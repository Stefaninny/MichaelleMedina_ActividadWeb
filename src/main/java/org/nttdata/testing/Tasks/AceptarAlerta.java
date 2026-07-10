package org.nttdata.testing.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AceptarAlerta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((WebDriverFacade) net.serenitybdd.screenplay.abilities.BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        driver.switchTo().alert().accept();
    }

    public static AceptarAlerta aceptar() {
        return net.serenitybdd.screenplay.Tasks.instrumented(AceptarAlerta.class);
    }
}
