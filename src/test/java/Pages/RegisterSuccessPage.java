package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegisterSuccessPage {

    WebDriver driver;
    WebDriverWait wait;

    By PageTitle = By.className("front__title");

    public RegisterSuccessPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public String getTitlePage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageTitle));
        return driver.findElement(PageTitle).getText();
    }
}
