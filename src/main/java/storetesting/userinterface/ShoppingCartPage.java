package storetesting.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ShoppingCartPage {

    public static final Target DELETE_PRODCUT = Target.the("").located(By.xpath("//td//div//a[@id='1_1_0_0']"));
    public static final Target ADD_QTY = Target.the("").located(By.xpath("//td//div//a[@id='cart_quantity_up_2_7_0_0']"));
    public static final Target BUTTON_CHECKOUT = Target.the("").located(By.xpath("//p//a//span[contains(text(),'Proceed to checkout')]"));


}
