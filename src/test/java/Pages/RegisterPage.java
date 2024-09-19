package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    By EmailField = By.id("email");
    By NamaLengkapField = By.id("name");
    By TeleponField = By.id("phone_number");
    By PasswordField = By.id("password");
    By EyeIcon = By.className("show__pass");
    By WarningEmailMessage = By.xpath("//div[@class='form__col__response text--red' and text()='Email sudah pernah terdaftar sebelumnya.']");
    By WarningPasswordMessage = By.xpath("//div[@class='form__col__response text--red' and text()='Isian password harus antara 6 dan 50 karakter.']");
    By WarningNamaLengkapMessage = By.xpath("//div[@class='form__col__response text--red' and text()='Isian nama harus antara 3 dan 30 karakter.']");
    By WarningMessage = By.className("form__col__response");
    By DaftarAkunButton = By.xpath("//input[@type='submit' and @value='Daftar Akun']");
    By PageTitle = By.xpath("//legend/h1[text()='Daftar Akun']");
    By BatalButton = By.id("onesignal-slidedown-cancel-button");
    By ShowPassword = By.className("text-red");
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void InputEmailField(String Email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailField));
        driver.findElement(EmailField).sendKeys(Email);
    }
    public void InputNamaLengkapField(String NamaLengkap) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NamaLengkapField));
        driver.findElement(NamaLengkapField).sendKeys(NamaLengkap);
    }
//    public void InputTeleponField(Integer Telepon) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(TeleponField));
//        driver.findElement(TeleponField).sendKeys(Telepon.toString());
//    }
    public void InputTeleponField(String Telepon) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TeleponField));
        driver.findElement(TeleponField).sendKeys(Telepon);
    }
    public void InputPasswordField(String Password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(PasswordField));
        driver.findElement(PasswordField).sendKeys(Password);
    }
    public void ClickEyeIcon () {
        wait.until(ExpectedConditions.elementToBeClickable(EyeIcon));
        driver.findElement(EyeIcon).click();
    }
    public void ClickBatalButton () {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.elementToBeClickable(BatalButton));
        driver.findElement(BatalButton).click();
    }
    public void ClickDaftarAkunButton() {
        // Scroll sedikit (misalnya 200 piksel) menggunakan JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");  // Menggulung halaman sedikit ke bawah

        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen DaftarAkunButton dapat diklik
        wait.until(ExpectedConditions.elementToBeClickable(DaftarAkunButton));

        // Klik elemen setelah terlihat dan dapat diklik
        driver.findElement(DaftarAkunButton).click();
    }
    public boolean WarningEmailMessageDisplayed() {
        return driver.findElement(WarningEmailMessage).isDisplayed();
    }
    public boolean WarningPasswordMessageDisplayed() {
        return driver.findElement(WarningPasswordMessage).isDisplayed();
    }
    public boolean WarningNamaLengkapMessageDisplayed() {
        return driver.findElement(WarningNamaLengkapMessage).isDisplayed();
    }
    public boolean WarningMessageDisplayed() {
        return driver.findElement(WarningMessage).isDisplayed();
    }
    public boolean ShowPasswordDisplayed() {
        return driver.findElement(ShowPassword).isDisplayed();
    }
    public boolean PageTitleDisplayed() {
        // Scroll ke atas menggunakan JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 0);");  // Menggulung halaman ke atas

        // Inisialisasi WebDriverWait dengan waktu tunggu 40 detik
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // Tunggu hingga elemen PageTitle terlihat
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageTitle));

        // Mengembalikan true jika elemen PageTitle terlihat
        return driver.findElement(PageTitle).isDisplayed();
    }
    public String getTitlePage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PageTitle));
        return driver.findElement(PageTitle).getText();
    }
}
