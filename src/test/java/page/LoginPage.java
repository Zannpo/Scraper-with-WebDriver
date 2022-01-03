package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public By linkToSignUp = By.xpath("/html/body/div/form/p/button/div/div/div");
    public By linkToName = By.id("fname");
    public By linkToSurname = By.id("lname");
    public By linkToEmail = By.id("email");
    public By linkToUsername = By.id("username");
    public By linkToPassword = By.id("password");
    public By linkToRulebook = By.id("regulamin");
    public By linkToFacebookLogin = By.id("facebookLoginLink");


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
