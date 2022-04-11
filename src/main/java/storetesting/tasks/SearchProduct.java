package storetesting.tasks;

import storetesting.model.ProductData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import storetesting.utils.Wait;

import java.util.List;

import static storetesting.interactions.ClicButtons.*;
import static storetesting.userinterface.SearchProductPage.*;


public class SearchProduct implements Task {
private static List<ProductData> pn;
public SearchProduct (List<ProductData> pn){ this.pn = pn;}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLIC),
                Enter.theValue(pn.get(0).getSeaProduct()).into(INPUT_PRODUCTNAME),
                Click.on(SEARCH_BUTTON),
                Click.on(SELECT_PRODUCT),
                Enter.theValue("").into(INPUT_QTY),
                Enter.theValue(pn.get(0).getCant()).into(INPUT_QTY),
                Click.on(SELECT_SIZE),
                SelectFromOptions.byVisibleText(pn.get(0).getSize()).from(SELECT_SIZE),
                Click.on(SELECT_COLOR),
                Click.on(ADD_PRODUCT_CAR_ID)
        );
        Wait.Time(12000);
        actor.attemptsTo(Click.on(CLOSE_WINDOW_CAR),
                Hover.over(HOVER_CART),
                Click.on(BUTTON_CART));

    }

public  static   SearchProduct SPP(List<ProductData> pn) {
    return Tasks.instrumented(SearchProduct.class, pn); }

}
