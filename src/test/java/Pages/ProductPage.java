package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    By BeliSekarangButton = By.xpath("//span[@class='button__group' and text()='Beli Sekarang']");
//By BeliSekarangButton = By.className("pi__cart__checkout");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void ClickBeliSekarangButton() {
        // Scroll sedikit (misalnya 200 piksel) menggunakan JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");  // Menggulung halaman sedikit ke bawah (200 piksel)

        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen BeliSekarangButton dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(BeliSekarangButton));

        // Klik elemen setelah terlihat dan dapat diklik
        driver.findElement(BeliSekarangButton).click();
    }
}
