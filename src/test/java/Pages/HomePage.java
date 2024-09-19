package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By ProfilPict = By.className("profile__picture");
    By ProductImage = By.className("pi__image");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public boolean ProfilPictDisplayed() {
        return driver.findElement(ProfilPict).isDisplayed();
    }
    public void ClickProductImage() {
        // Scroll ke elemen ProductImage menggunakan JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(ProductImage));

        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen ProductImage dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(ProductImage));

        // Klik elemen setelah terlihat dan dapat diklik
        driver.findElement(ProductImage).click();
    }
}
