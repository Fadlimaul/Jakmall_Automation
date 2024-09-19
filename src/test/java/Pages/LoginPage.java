package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By EmailField = By.id("email");
    By PasswordField = By.id("password");
    By LoginButton = By.className("button--md");
    By PageTitle = By.xpath("//legend/h1[text()='Login']");
    By WarningMessage = By.className("form__col__response");
    By EyeIcon = By.className("show__pass");
    By ShowPassword = By.className("text-red");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void InputEmailField(String Email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        driver.findElement(EmailField).sendKeys(Email);
    }
    public void InputPasswordField(String Password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(Password);
    }
    public void ClickEyeIcon () {
        wait.until(ExpectedConditions.elementToBeClickable(EyeIcon));
        driver.findElement(EyeIcon).click();
    }
    public void ClickLoginButton () {
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton));
        driver.findElement(LoginButton).click();
    }
    public boolean PageTitleDisplayed() {
        return driver.findElement(PageTitle).isDisplayed();
    }
    public boolean WarningMessageDisplayed() {
        return driver.findElement(WarningMessage).isDisplayed();
    }
    public boolean ShowPasswordDisplayed() {
        return driver.findElement(ShowPassword).isDisplayed();
    }
}
