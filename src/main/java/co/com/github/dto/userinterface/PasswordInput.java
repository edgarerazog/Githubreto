package co.com.github.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordInput extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("Ingresar la contraseña").located(By.xpath("//input[@name='password']"));

}
