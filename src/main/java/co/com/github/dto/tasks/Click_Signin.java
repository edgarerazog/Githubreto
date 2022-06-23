package co.com.github.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.github.dto.userinterface.SiginClick.CLICK_SIGIN;

public class Click_Signin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CLICK_SIGIN));

    }
    public static Performable Click_Signin(){ return Tasks.instrumented(Click_Signin.class);
    }
}
