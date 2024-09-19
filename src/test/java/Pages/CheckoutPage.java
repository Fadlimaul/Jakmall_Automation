package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    By lanjutKePembayaranButton = By.xpath("//a[@class='button button--cta button--lg cart__next' and @href='#step-payment']//span[text()='Lanjut ke Pembayaran']");
    By jneRegImage = By.xpath("//img[@alt='JNE REG']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void ClicklanjutKePembayaranButton() {
        // Scroll ke elemen ProductImage menggunakan JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(lanjutKePembayaranButton));

        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen ProductImage dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(lanjutKePembayaranButton));

        // Klik elemen setelah terlihat dan dapat diklik
        driver.findElement(lanjutKePembayaranButton).click();
    }
    public void ClickjneRegImage () {
        wait.until(ExpectedConditions.elementToBeClickable(jneRegImage));
        driver.findElement(jneRegImage).click();
    }
}
