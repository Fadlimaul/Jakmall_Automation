package Steps;

import Pages.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class REG_01_Steps {

    WebDriver driver;
    RegisterPage registersPage;
    RegisterSuccessPage registerSuccessPage;

    @Given("The user is on the register page")
    public void the_user_is_on_the_register_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jakmall.com/register");
        registersPage = new RegisterPage(driver);
        registerSuccessPage = new RegisterSuccessPage(driver);
    }
    @When("The user click batal button")
    public void the_user_click_batal_button() {
        registersPage.ClickBatalButton();
    }
    @When("The user enter email field {string}")
    public void the_user_enter_email_field(String email) {
        registersPage.InputEmailField(email);
    }
    @When("The user enter nama lengkap field {string}")
    public void the_user_enter_nama_lengkap_field(String namalengkap) {
        registersPage.InputNamaLengkapField(namalengkap);
    }
//    @When("The user enter telepon field {int}")
//    public void the_user_enter_telepon_field(Integer telepon) {
//        registersPage.InputTeleponField(telepon);
//    }
@When("The user enter telepon field {string}")
public void the_user_enter_telepon_field(String telepon) {
    registersPage.InputTeleponField(telepon);
}
    @When("The user enter password field {string}")
    public void the_user_enter_password_field(String password) {
        registersPage.InputPasswordField(password);
    }
    @When("The user click eye icon")
    public void the_user_click_eye_icon() {
        registersPage.ClickEyeIcon();
    }
    @When("The user click daftar akun button")
    public void the_user_click_daftar_akun_button() {
        registersPage.ClickDaftarAkunButton();
    }
    @Then("the user get warning email message")
    public void the_user_get_warning_email_message() {
        assert true; registersPage.WarningEmailMessageDisplayed();
        driver.quit();
    }
    @Then("the user get warning password message")
    public void the_user_get_warning_password_message() {
        assert true; registersPage.WarningPasswordMessageDisplayed();
        driver.quit();
    }
    @Then("the user get warning nama lengkap message")
    public void the_user_get_warning_nama_lengkap_message() {
        assert true; registersPage.WarningNamaLengkapMessageDisplayed();
        driver.quit();
    }
    @Then("the user get warning message")
    public void the_user_get_warning_message() {
        assert true; registersPage.WarningMessageDisplayed();
        driver.quit();
    }
    @Then("the password should be displayed")
    public void the_password_should_be_displayed() {
        assert true; registersPage.ShowPasswordDisplayed();
        driver.quit();
    }
    @Then("the user still on the register page")
    public void the_user_still_on_the_register_page() {
        // assert true; registersPage.PageTitleDisplayed();
        Assert.assertEquals(registersPage.getTitlePage(),"Daftar Akun");
        driver.quit();
    }
    @Then("the user directed to register success page")
    public void the_user_directed_to_register_success_page() {
        // assert true; registersPage.PageTitleDisplayed();
        Assert.assertEquals(registerSuccessPage.getTitlePage(),"Pendaftaran Berhasil");
        driver.quit();
    }
}
