package storetesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import storetesting.utils.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static storetesting.userinterface.ShoppingCartPage.*;


public class ShoppingCart implements Task {

    public static Performable SP() { return instrumented(ShoppingCart.class);  }

    @Override
    public <T extends Actor> void performAs(T actor){
            actor.attemptsTo(Click.on(DELETE_PRODCUT));
            Wait.Time(3000);
            actor.attemptsTo(Click.on(ADD_QTY));
            Wait.Time(3000);
            actor.attemptsTo(Click.on(BUTTON_CHECKOUT));
    }


}
