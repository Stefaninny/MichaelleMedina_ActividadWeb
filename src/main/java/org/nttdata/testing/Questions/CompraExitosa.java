package org.nttdata.testing.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.nttdata.testing.Pages.HomePage;

public class CompraExitosa implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return HomePage.TXT_COMPRA_EXITOSA.resolveFor(actor).getText();
    }

    public static CompraExitosa mensaje(){
        return new CompraExitosa();
    }
}
