package co.com.github.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarClick extends PageObject {
    public static final Target CLICK_INGRESAR = Target.the("Click en Sign In").located(By.xpath("//input[@name='commit']"));

}
