package storetesting.interactions;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClicButtons {

    public static final Target CLOSE_WINDOW_CAR =  Target.the("Close Window").
            located(By.xpath("//span[@class='cross']"));

    public static final Target CONTINUE_SHOPPING =  Target.the("Close Window").
            located(By.xpath("//span[@title='Continue shopping']"));

}
