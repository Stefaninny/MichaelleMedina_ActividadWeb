package org.nttdata.testing.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nttdata.testing.Pages.HomePage;

public class LoginUsuario implements Task {
    private String username;
    private String password;

    public LoginUsuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_LOGIN),
                Enter.theValue(username).into(HomePage.TXT_LOGIN_USER),
                Enter.theValue(password).into(HomePage.TXT_LOGIN_PASSWORD),
                Click.on(HomePage.BTN_LOGIN_MODAL)
        );
    }

    public static Performable withData(String username, String password){
        return new LoginUsuario(username,password);
    }

}
