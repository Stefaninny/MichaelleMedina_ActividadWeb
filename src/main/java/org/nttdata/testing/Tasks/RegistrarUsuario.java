package org.nttdata.testing.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nttdata.testing.Pages.HomePage;

public class RegistrarUsuario implements Task {
    private String username;
    private String password;

    public RegistrarUsuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(HomePage.BTN_SIGN_UP),
                Enter.theValue(username).into(HomePage.USER_NAME),
                Enter.theValue(password).into(HomePage.PASS_WORD),
                Click.on(HomePage. BTN_REGISTER)
        );
    }

    public static Performable withData(String username, String password){
        return new RegistrarUsuario(username,password);
    }

}
