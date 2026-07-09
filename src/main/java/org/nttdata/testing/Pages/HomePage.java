package org.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {
    public static final Target BTN_SIGN_UP = Target.the("Boton para hacer el registro")
            .located(By.id("signin2"));
    public static final Target USER_NAME = Target.the("Campo de usuario")
            .located(By.id("sign-username"));
    public static final Target PASS_WORD = Target.the("Campo de contraseña")
            .located(By.id("sign-password"));
    public static final Target BTN_REGISTER = Target.the("Registrar Usuario")
            .located(By.xpath("//button[text()='Sign up']"));
    //Login
    public static final Target BTN_LOGIN = Target.the("Botón Login")
            .located(By.id("login2"));
    public static final Target TXT_LOGIN_USER = Target.the("Usuario Login")
            .located(By.id("loginusername"));
    public static final Target TXT_LOGIN_PASSWORD = Target.the("Contraseña Login")
            .located(By.id("loginpassword"));
    public static final Target BTN_LOGIN_MODAL = Target.the("Botón Ingresar")
            .located(By.xpath("//button[text()='Log in']"));
    public static final Target TXT_WELCOME = Target.the("Mensaje de bienvenida")
            .located(By.id("nameofuser"));

}