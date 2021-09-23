package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    WebDriver driver;

    By Username = By.xpath("//input[@id='ctl00_MainContent_username']");
    By Password = By.xpath("//input[@id='ctl00_MainContent_password']");
    By LoginButton = By.xpath("//input[@id='ctl00_MainContent_login_button']");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void loginTest(String user,String pass){
        driver.findElement(Username).sendKeys(user);
        driver.findElement(Password).sendKeys(pass);
    }

    public void setLoginButton(){
        driver.findElement(LoginButton).click();
    }
}
