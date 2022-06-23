package co.com.github.dto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.github.dto.userinterface.PasswordInput.INPUT_PASSWORD;
import static co.com.github.dto.userinterface.UsernameInput.INPUT_USERNAME;

public class Password implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Edgarerazo123@").into(INPUT_PASSWORD));
    }
    public static Performable password() { return Tasks.instrumented(Password.class);
}
}