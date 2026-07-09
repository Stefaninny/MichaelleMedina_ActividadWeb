package org.nttdata.testing.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.testing.Pages.HomePage;
import org.nttdata.testing.Tasks.LoginUsuario;
import net.serenitybdd.screenplay.ensure.Ensure;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class LoginUsuarioStepDefinitions {
    @When("inicia sesion con usuario {string} y contrasena {string}")
    public void iniciaSesionConUsuarioYContrasena(String username, String password) {
        theActorInTheSpotlight().attemptsTo(LoginUsuario.withData(username,password));
    }

    @Then("ingresa exitosamente al sistema {string}")
    public void ingresaExitosamenteAlSistema(String username) {
        String expectedWelcomeMessage = "Welcome " + username;

        theActorInTheSpotlight().attemptsTo(WaitUntil.the(HomePage.TXT_WELCOME, containsText(expectedWelcomeMessage))
                .forNoMoreThan(5).seconds(), Ensure.that(HomePage.TXT_WELCOME).text()
                .isEqualTo(expectedWelcomeMessage)
        );
    }
}
