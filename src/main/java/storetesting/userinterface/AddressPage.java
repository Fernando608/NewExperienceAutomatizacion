package storetesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {
    public static final Target ADDRESSq = Target.the("Ne Address").located(By.xpath("//ul//li//a[@title='Addresses']"));
    public static final Target BUTTON_NEW_ADDRESS = Target.the("New Address").located(By.xpath("//p[@class='address_add submit']//a"));
    public static final Target INPUT_FISRTNAME = Target.the("FirtNAme").located(By.id("firstname"));
    public static final Target INPUT_LASTNAME = Target.the("LastName").located(By.id("lastname"));
    public static final Target INPUT_NEWADDRESS = Target.the("New Address Desc").located(By.id("address1"));
    public static final Target INPUT_CITY= Target.the("CITY").located(By.id("address1"));
    public static final Target INPUT_POSTCODE = Target.the("postcode").located(By.id("postcode"));
    public static final Target INPUT_STATE = Target.the("New state").located(By.id("id_state"));
    public static final Target INPUT_COUNTRY = Target.the("New country").located(By.id("id_country"));
    public static final Target INPUT_PHONE = Target.the("New phone").located(By.id("phone"));
    public static final Target INPUT_MOBILE_PHONE = Target.the("New MOBILE phone").located(By.id("phone_mobile"));
    public static final Target INPUT_NAME_ADDRESS = Target.the("Name Address").located(By.id("alias"));
    public static final Target BUTTON_SAVE= Target.the("save").located(By.id("submitAddressin"));

}
