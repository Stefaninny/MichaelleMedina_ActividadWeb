package org.nttdata.testing.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.nttdata.testing.Pages.HomePage;

public class ProductoEnCarrito implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return HomePage.PRODUCTO_CARRITO.resolveFor(actor).getText();
    }

    public static ProductoEnCarrito nombre() {
        return new ProductoEnCarrito();
    }
}
