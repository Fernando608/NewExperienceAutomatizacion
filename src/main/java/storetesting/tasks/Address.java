package storetesting.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import storetesting.model.AddressData;
import storetesting.utils.Wait;

import java.util.List;

import static storetesting.userinterface.AddressPage.*;

public class Address  implements Task {

    private static List<AddressData> ad;
    public Address (List<AddressData> ad){ this.ad = ad; }

    @Override
    public <T extends Actor> void performAs(T actor) {


      actor.attemptsTo(Click.on(BUTTON_NEW_ADDRESS));

        actor.attemptsTo(

              //  Click.on(ADDRESS)
                /*,
                Enter.theValue("").into(INPUT_FISRTNAME),
                Enter.theValue(ad.get(0).getFirstName()).into(INPUT_FISRTNAME),
                Enter.theValue("").into(INPUT_LASTNAME),
                Enter.theValue(ad.get(0).getLastName()).into(INPUT_LASTNAME),
                Enter.theValue(ad.get(0).getAddress()).into(INPUT_NEWADDRESS),
                Enter.theValue(ad.get(0).getCity()).into(INPUT_CITY),
                SelectFromOptions.byVisibleText(ad.get(0).getState()).from(INPUT_STATE),
                Enter.theValue(ad.get(0).getZip()).into(INPUT_POSTCODE),
                SelectFromOptions.byVisibleText(ad.get(0).getCountry()).from(INPUT_COUNTRY),
                Enter.theValue(ad.get(0).getPhone()).into(INPUT_PHONE),
                Enter.theValue(ad.get(0).getPhone()).into(INPUT_MOBILE_PHONE),
                Enter.theValue(ad.get(0).getNameAddress()).into(INPUT_NAME_ADDRESS),
                Click.on(BUTTON_SAVE)*/
                );
    }

    public static Address ADS(List<AddressData> ad) {
        return Tasks.instrumented(Address.class, ad);
    }
}
