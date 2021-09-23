package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Login  {

    public WebDriver driver;
    public String Url ="http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx";

    @Given("^Open chrome and start application$")
    public void open_chrome_and_start_application() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Url);
        driver.get(Url);
    }

    @When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
    public void i_enter_valid_and_valid(String uname, String pass) throws Throwable {
        Pages.Login login = new Pages.Login(driver);
        login.loginTest(uname,pass);

    }

    @Then("^user should be able to login successfully$")
    public void user_should_be_able_to_login_successfully() throws Throwable {
        Pages.Login login = new Pages.Login(driver);
        login.setLoginButton();
    }

    @Then("^application should be closed$")
    public void application_should_be_closed() throws Throwable {
        driver.close();
        driver.quit();
    }
}
