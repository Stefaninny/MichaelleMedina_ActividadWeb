package org.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {
    //Registrar Usuario
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

    //Agregar Carrito
    public static final Target LNK_PRODUCT = Target.the("Producto Iphone 6 32gb")
            .located(By.xpath("//a[text()='Iphone 6 32gb']"));
    public static final Target BTN_ADD_TO_CART = Target.the("Botón Add to cart")
            .located(By.linkText("Add to cart"));
    public static final Target BTN_CART = Target.the("Botón Cart")
            .located(By.id("cartur"));
    public static final Target PRODUCTO_CARRITO = Target.the("Producto agregado al carrito")
            .located(By.xpath("//td[text()='Iphone 6 32gb']"));

    //Pago Producto
    public static final Target BTN_PLACE_ORDER = Target.the("Botón Place Order")
            .located(By.xpath("//button[text()='Place Order']"));
    public static final Target TXT_NAME = Target.the("Nombre")
            .located(By.id("name"));
    public static final Target TXT_COUNTRY = Target.the("Pais")
            .located(By.id("country"));
    public static final Target TXT_CITY = Target.the("Ciudad")
            .located(By.id("city"));
    public static final Target TXT_CARD = Target.the("Tarjeta")
            .located(By.id("card"));
    public static final Target TXT_MONTH = Target.the("Mes")
            .located(By.id("month"));
    public static final Target TXT_YEAR = Target.the("Año")
            .located(By.id("year"));
    public static final Target BTN_PURCHASE = Target.the("Botón Purchase")
            .located(By.xpath("//button[text()='Purchase']"));
    public static final Target TXT_COMPRA_EXITOSA = Target.the("Mensaje Compra Exitosa")
            .located(By.xpath("//h2[text()='Thank you for your purchase!']"));
    public static final Target BTN_OK = Target.the("Botón OK")
            .located(By.xpath("//button[text()='OK']"));
}