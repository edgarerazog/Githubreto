package co.com.github.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.github.dto.userinterface.IngresarClick.CLICK_INGRESAR;
import static co.com.github.dto.userinterface.PasswordInput.INPUT_PASSWORD;
import static co.com.github.dto.userinterface.SiginClick.CLICK_SIGIN;

public class Ingresar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_INGRESAR));
    }

    public static Performable ingresar() { return Tasks.instrumented(Ingresar.class);
}
}
