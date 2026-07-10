package org.nttdata.testing.stepDefinition;


import io.cucumber.datatable.DataTable;
import static org.assertj.core.api.Assertions.assertThat;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.nttdata.testing.Questions.CompraExitosa;
import org.nttdata.testing.Tasks.PagarCarrito;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagarCarritoStepDefinitions {
    @When("realiza el pago con")
    public void realizaElPagoCon(DataTable tabla) {
        List<Map<String, String>> datos = tabla.asMaps();
        theActorInTheSpotlight().attemptsTo(
                PagarCarrito.conDatos(
                        datos.get(0).get("nombre"),
                        datos.get(0).get("pais"),
                        datos.get(0).get("ciudad"),
                        datos.get(0).get("tarjeta"),
                        datos.get(0).get("mes"),
                        datos.get(0).get("anio")
                )
        );
    }

    @Then("la compra se realiza exitosamente")
    public void laCompraSeRealizaExitosamente() {
        String mensaje =
                theActorInTheSpotlight().asksFor(
                        CompraExitosa.mensaje()
                );

        assertThat(mensaje)
                .isEqualTo("Thank you for your purchase!");
    }
}
