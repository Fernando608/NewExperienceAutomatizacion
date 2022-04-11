package storetesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShippingPage {

    public static final Target INPUT_SERVICE = Target.the("").located(By.xpath("//input[@id='cgv']"));
    public static final Target  BUTTON_CARRRIER = Target.the("").located(By.xpath("//button[@name='processCarrier']"));
    public static final Target  INPUT_PAYMENT = Target.the("").located(By.xpath("//div//p//a[@title='Pay by bank wire']"));
    public static final Target  BUTTON_CONFIRM_PAY = Target.the("").located(By.xpath("//button//span[contains(text(),'I confirm my order')]"));
    public static final Target VERIFY_TITLE = Target.the("").located(By.xpath("//div//p//strong[contains(text(),'Your order on My Store is complete.')]"));
}
