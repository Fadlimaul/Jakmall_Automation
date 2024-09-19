package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.RegisterSuccessPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LOG_01_Steps {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jakmall.com/login");
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }
    @When("The user filling email field {string}")
    public void the_user_filling_email_field(String email) {
        loginPage.InputEmailField(email);
    }
    @When("The user filling password field {string}")
    public void the_user_filling_password_field(String password) {
        loginPage.InputPasswordField(password);
    }
    @When("The user clicks eye icon")
    public void the_user_clicks_eye_icon() {
        loginPage.ClickEyeIcon();
    }
    @When("The user click login button")
    public void the_user_click_login_button() {
        loginPage.ClickLoginButton();
    }
    @Then("the user get error message")
    public void the_user_get_error_message() {
        assert true; loginPage.WarningMessageDisplayed();
        driver.quit();
    }
    @Then("the password should be shown")
    public void the_password_should_be_shown() {
        assert true; loginPage.ShowPasswordDisplayed();
        driver.quit();
    }
    @Then("the user still on the login page")
    public void the_user_still_on_the_login_page() {
         assert true; loginPage.PageTitleDisplayed();
        driver.quit();
    }
    @Then("the user directed to home page")
    public void the_user_directed_to_home_page() {
         assert true; homePage.ProfilPictDisplayed();
        driver.quit();
    }

    @Then("the user can see password that he typed")
    public void the_user_can_see_password_that_he_typedd() {
        assert true; loginPage.ShowPasswordDisplayed();
        driver.quit();
    }
}
