package co.com.github.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsernameInput extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Ingresar el usuario").located(By.xpath("//input[@name='login']"));

}
