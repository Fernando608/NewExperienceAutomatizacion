
package storetesting.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import storetesting.model.*;
import storetesting.questions.Answer;
import storetesting.tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;



public class StoreStepDefinitions {

    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^The user wants to enter the main page of New Experience$")
    public void theUserWantsToEnterTheMainPageOfNewExperience()  {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.theUrl());
    }


    @When("^The user adds two items to the shopping cart\\.$")
    public void theUserAddsTwoItemsToTheShoppingCart() {
       theActorInTheSpotlight().attemptsTo(AddProduct.ASC());
    }

    @And("^the user searches for a product and adds it to the shopping cart$")
    public void theUserSearchesForAProductAndAddsItToTheShoppingCart(List<ProductData>productData)  {
        theActorInTheSpotlight().attemptsTo(SearchProduct.SPP(productData));
    }


    @And("^the user modifies the products to be purchased$")
    public void theUserModifiesTheProductsToBePurchased() {
       theActorInTheSpotlight().attemptsTo(ShoppingCart.SP());
            }

    @And("^user logs in$")
    public void userLogsIn(List<LoginData>loginData)  {
            theActorInTheSpotlight().attemptsTo(LongIn.LGD(loginData));
            }

   /* @And("^the user adds a new delivery address$")
    public void theUserAddsANewDeliveryAddress()  throws Exception{
        //    theActorInTheSpotlight().attemptsTo(Address.ADS(addressData));
    }
    */
    @And("^the user accepts the terms and conditions and continues with the process$")
    public void theUserAcceptsTheTermsAndConditionsAndContinuesWithTheProcess()  {
        theActorInTheSpotlight().attemptsTo(Shipping.TD());
    }

    @Then("^Verify order was done correctly$")
    public void verifyOrderWasDoneCorrectly(List<VerifyOrderData>verifyOrderData) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(verifyOrderData.get(0).getTitle())));
    }

}