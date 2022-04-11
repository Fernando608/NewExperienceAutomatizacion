package storetesting.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class AddProductPage {
    public static final Target SELECT_PRODUCT_ONE =  Target.the("Select product1").located(By.xpath("//div//h5//a[@title='Blouse']"));
    public static final Target ADD_PRODUCT_CAR = Target.the("Add to car Home").located(By.xpath("//a[@data-id-product='2']//span"));
    public static final Target SELECT_PRODUCT_TWO = Target.the("Add to car").located(By.xpath("//div//h5//a[@title='Faded Short Sleeve T-shirts']"));
    public static final Target ADD_PRODUCT_CARTWO = Target.the("Add to car Home2").located(By.xpath("//a[@data-id-product='1']//span"));


}
