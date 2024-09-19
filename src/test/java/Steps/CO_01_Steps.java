package Steps;

import Pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CO_01_Steps {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;
    CheckoutPage checkoutPage;
    PaymentPage paymentPage;
    RegisterPage registerPage;

    @Given("The user is on the login page and login")
    public void the_user_is_on_the_login_page_and_login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jakmall.com/login");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        checkoutPage = new CheckoutPage(driver);
        paymentPage = new PaymentPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage.InputEmailField("ilham@rupiapp.me");
        loginPage.InputPasswordField("Ilham23");
        loginPage.ClickLoginButton();
        registerPage.ClickBatalButton();
    }
    @When("the user click proudct display")
    public void the_user_click_product_display() {
        homePage.ClickProductImage();
    }
    @When("the user click beli sekarang button")
    public void the_user_click_beli_sekarang_button() {
        productPage.ClickBeliSekarangButton();
    }
    @When("the user choose shipping method")
    public void the_user_choose_shipping_method() {
        checkoutPage.ClickjneRegImage();
    }
    @When("the user click lanjut ke pembayaran button")
    public void the_user_click_lanjut_ke_pembayaran_button() {
        checkoutPage.ClicklanjutKePembayaranButton();
    }
    @When("the user choose payment method")
    public void the_user_choose_payment_method() {
        paymentPage.ClickBankTransferButton();
    }
    @When("the user click bayar button")
    public void the_user_bayar_button() {
        paymentPage.ClickBayarButton();
    }
    @Then("the user get success message")
    public void the_user_get_success_message() {
        assert true; paymentPage.WaitingPaymentLogoDisplayed();
        driver.quit();
    }
}
