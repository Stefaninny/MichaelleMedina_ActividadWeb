package org.nttdata.testing.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import org.nttdata.testing.Tasks.NavigateTo;
import org.nttdata.testing.Tasks.RegistrarUsuario;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStepDefinitions {
    @Given("el {actor} esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @When("se registra con un nombre de usuario {string} y contrasena {string}")
    public void seRegistraConUnNombreDeUsuarioYContrasena(String username, String password) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.withData(username,password));
    }

    @Then("se realiza el registro de manera exitosa")
    public void seRealizaElRegistroDeManeraExitosa() {
        System.out.println("Exitoso");
    }
}
