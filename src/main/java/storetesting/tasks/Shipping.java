package storetesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import storetesting.utils.Wait;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static storetesting.userinterface.ShippingPage.*;

public class Shipping implements Task {
    public static Performable TD() {
        return instrumented(Shipping.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(INPUT_SERVICE),
                Click.on(BUTTON_CARRRIER),
                Click.on(INPUT_PAYMENT)
                );
        Wait.Time(5000);
        actor.attemptsTo(
                Click.on(BUTTON_CONFIRM_PAY));
    }

}
