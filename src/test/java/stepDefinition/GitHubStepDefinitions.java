package stepDefinition;

import co.com.github.dto.tasks.*;
import co.com.github.dto.util.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class GitHubStepDefinitions {

    @Before
    public void setUp() { OnStage.setTheStage(new OnlineCast()); }

    @Given("el cliente ingresa a la pagina web")
    public void elClienteIngresaALaPaginaWeb() {
        theActorCalled(Constants.ACTOR).wasAbleTo(OpenWebGithub.openWebGithub());
        theActorCalled(Constants.ACTOR).wasAbleTo(Click_Signin.Click_Signin());

    }
    @When("cuando este en la opcion login colocar usuario y clave e ingresar")
    public void cuandoEsteEnLaOpcionLoginColocarUsuarioYClaveEIngresar() {
        theActorCalled(Constants.ACTOR).wasAbleTo(Username.username());
        theActorCalled(Constants.ACTOR).wasAbleTo(Password.password());

    }
    @Then("Validar que el ingreso sea exitoso")
    public void validarQueElIngresoSeaExitoso() {
        theActorCalled(Constants.ACTOR).wasAbleTo(Ingresar.ingresar());

    }
}
