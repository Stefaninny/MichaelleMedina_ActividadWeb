package org.nttdata.testing.stepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.nttdata.testing.Questions.ProductoEnCarrito;
import org.nttdata.testing.Tasks.AgregarCarrito;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.assertj.core.api.Assertions.assertThat;

public class AgregarCarritoStepDefinitions {
    @When("agrega un producto al carrito")
    public void agregaUnProductoAlCarrito() {
        theActorInTheSpotlight().attemptsTo(AgregarCarrito.agregar());
    }

    @Then("el producto fue agregado correctamente")
    public void elProductoFueAgregadoCorrectamente() {
        String producto = theActorInTheSpotlight().asksFor(
                ProductoEnCarrito.nombre()
        );

        assertThat(producto).isEqualTo("Iphone 6 32gb");
    }
}
