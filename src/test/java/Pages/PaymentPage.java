package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {

    WebDriver driver;
    WebDriverWait wait;

    By BankTransferButton = By.xpath("//span[contains(text(), 'Bank Transfer')]");
    By BayarButton = By.xpath("//button[contains(text(), 'Bayar')]");
    By BackToMerchantButton = By.id("back-to-merchant");
    By BackToMerchant2Button = By.id("back2merchant_buttton");
    By CekStatusPembayaranButton = By.className("sbtn");
    By jakmallLogo = By.className("header__logo--default");
    By WaitingPaymentLogo = By.className("finish__img");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
//    public void ClickBankTransferButton() {
//        // Scroll ke elemen IndomaretPaymentButton menggunakan JavaScript Executor
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(BankTransferButton));
//
//        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//
//        // Tunggu hingga elemen IndomaretPaymentButton dapat diklik
//        wait.until(ExpectedConditions.elementToBeClickable(BankTransferButton));
//
//        // Klik elemen setelah terlihat dan dapat diklik
//        driver.findElement(BankTransferButton).click();
//    }
    public void ClickBankTransferButton () {
        wait.until(ExpectedConditions.elementToBeClickable(BankTransferButton));
        driver.findElement(BankTransferButton).click();
    }
    public void ClickBayarButton () {
        wait.until(ExpectedConditions.elementToBeClickable(BayarButton));
        driver.findElement(BayarButton).click();
    }
    public boolean WaitingPaymentLogoDisplayed() {
        return driver.findElement(WaitingPaymentLogo).isDisplayed();
    }
}
