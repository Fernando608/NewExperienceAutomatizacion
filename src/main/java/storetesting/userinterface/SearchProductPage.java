package storetesting.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchProductPage {

    public static final Target  CLIC = Target.the("enter product name").located(By.id("search_query_top"));
    public static final Target INPUT_PRODUCTNAME = Target.the("enter product name").located(By.xpath("//input[@name='search_query']"));
    public static  final Target SEARCH_BUTTON = Target.the("Search Product").located(By.xpath("//button[@name='submit_search']"));
    public static final Target SELECT_PRODUCT =  Target.the("Select product1").located(org.openqa.selenium.By.xpath("//div[@class='right-block']//h5//a[contains(text(),'Printed Chiffon Dress')][1]"));
    public static final Target INPUT_QTY = Target.the("Add qty").located(By.id("quantity_wanted"));
    public static final Target SELECT_SIZE = Target.the("Add size").located(By.id("group_1"));
    public static final Target SELECT_COLOR = Target.the("Select color").located(By.id("color_15"));
    public static final Target ADD_PRODUCT_CAR_ID = Target.the("Add to car").located(By.xpath("//p[@id='add_to_cart']//button"));
    public static final Target HOVER_CART = Target.the("").located(By.xpath("//div[@class='shopping_cart']//a[@title='View my shopping cart']"));
    public static final Target BUTTON_CART = Target.the("").located(By.id("button_order_cart"));

}
