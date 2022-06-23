package co.com.github.dto.tasks;

import com.ibm.as400.access.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.github.dto.userinterface.UsernameInput.INPUT_USERNAME;

public class Username implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("edgarerazog").into(INPUT_USERNAME));
    }
        public static Performable username() { return Tasks.instrumented(Username.class);


        }
}
