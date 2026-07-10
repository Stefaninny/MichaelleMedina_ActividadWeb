package org.nttdata.testing.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.nttdata.testing.Pages.HomePage;

import java.time.Duration;

public class AgregarCarrito implements Task{
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.LNK_PRODUCT),
                Click.on(HomePage.BTN_ADD_TO_CART),
                AceptarAlerta.aceptar(),
                Click.on(HomePage.BTN_CART),
                WaitUntil.the(
                        HomePage.PRODUCTO_CARRITO,
                        WebElementStateMatchers.isVisible()
                )
        );
    }

    public static AgregarCarrito agregar() {
        return Tasks.instrumented(AgregarCarrito.class);
    }
}
