package org.nttdata.testing.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nttdata.testing.Pages.HomePage;

public class PagarCarrito implements Task {
    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjeta;
    private String mes;
    private String anio;

    public PagarCarrito(String nombre,
                        String pais,
                        String ciudad,
                        String tarjeta,
                        String mes,
                        String anio) {

        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.tarjeta = tarjeta;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
         actor.attemptsTo(
                 Click.on(HomePage.BTN_PLACE_ORDER),
                 Enter.theValue(nombre).into(HomePage.TXT_NAME),
                 Enter.theValue(pais).into(HomePage.TXT_COUNTRY),
                 Enter.theValue(ciudad).into(HomePage.TXT_CITY),
                 Enter.theValue(tarjeta).into(HomePage.TXT_CARD),
                 Enter.theValue(mes).into(HomePage.TXT_MONTH),
                 Enter.theValue(anio).into(HomePage.TXT_YEAR),
                 Click.on(HomePage.BTN_PURCHASE)
        );
    }

    public static Performable conDatos(
            String nombre,
            String pais,
            String ciudad,
            String tarjeta,
            String mes,
            String anio){

        return Tasks.instrumented(
                PagarCarrito.class,
                nombre,
                pais,
                ciudad,
                tarjeta,
                mes,
                anio
        );
    }
}