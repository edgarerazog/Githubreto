package co.com.github.dto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SiginClick extends PageObject {
    public static final Target CLICK_SIGIN = Target.the("Click en Sign In").located(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline']"));

}
