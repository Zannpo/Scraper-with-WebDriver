package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.WordPage;

public class LoginTest {
    public WebDriver driver;

    @Before
    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.etutor.pl/registration?redirectToken=hcGcvEHIA61lFv4pFIw3q2MZLgN_dg2D-XSnpjRKeWUf03Ht7bV9rGGqFdm0REcQJtNxVAxDWc4p2Szcr0e_Qg..");
        driver.manage().window().maximize();
    }

    @Test
    public void registerCorrectData(){
        LoginPage loginPage = new LoginPage(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);

        driver.findElement(loginPage.linkToName).sendKeys("XAE-12");
        driver.findElement(loginPage.linkToSurname).sendKeys("Musk");
        driver.findElement(loginPage.linkToEmail).sendKeys("xae@yahoo.com");
        driver.findElement(loginPage.linkToPassword).sendKeys("pa$$w0d");
        driver.findElement(loginPage.linkToUsername).sendKeys("Xae");
        driver.findElement(loginPage.linkToRulebook).click();

        //driver.findElement(loginPage.linkToSignUp).click();
    }

    @Test
    public void loginViaFacebook()
    {
        LoginPage loginPage = new LoginPage(driver);

        driver.findElement(loginPage.linkToFacebookLogin).click();

    }

    @After
    public void driverQuit () {
        if (driver != null) {
            driver.quit();
        }
    }
}
