package storetesting.tasks;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import storetesting.utils.Wait;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static storetesting.interactions.ClicButtons.*;
import static storetesting.userinterface.AddProductPage.*;

public class AddProduct implements Task {

    public static Performable ASC() {  return  instrumented(AddProduct.class);   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Hover.over(SELECT_PRODUCT_ONE),
                Click.on(ADD_PRODUCT_CAR)
        );
        Wait.Time(10000);
        actor.attemptsTo( Click.on(CONTINUE_SHOPPING)  );
        actor.attemptsTo(
                Hover.over(SELECT_PRODUCT_TWO),
                Click.on(ADD_PRODUCT_CARTWO)
        );
        Wait.Time(10000);
        actor.attemptsTo( Click.on(CONTINUE_SHOPPING)  );
    }



}
