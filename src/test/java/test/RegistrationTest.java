package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.RegistrationPage;

public class RegistrationTest {
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
        RegistrationPage registrationPage = new RegistrationPage(driver);

        driver.findElement(registrationPage.linkToName).sendKeys("XAE-12");
        driver.findElement(registrationPage.linkToSurname).sendKeys("Musk");
        driver.findElement(registrationPage.linkToEmail).sendKeys("xae@yahoo.com");
        driver.findElement(registrationPage.linkToPassword).sendKeys("pa$$w0d");
        driver.findElement(registrationPage.linkToUsername).sendKeys("Xae");
        driver.findElement(registrationPage.linkToRulebook).click();
        driver.findElement(registrationPage.linkToSignUp).click();
    }

    @Test
    public void registerIncorrectEmail(){
        RegistrationPage registrationPage = new RegistrationPage(driver);

        driver.findElement(registrationPage.linkToName).sendKeys("XAE-12");
        driver.findElement(registrationPage.linkToSurname).sendKeys("Musk");
        driver.findElement(registrationPage.linkToEmail).sendKeys("xaeyahoocom");
        driver.findElement(registrationPage.linkToPassword).sendKeys("pa$$w0d");
        driver.findElement(registrationPage.linkToUsername).sendKeys("Xae");
        driver.findElement(registrationPage.linkToRulebook).click();
        driver.findElement(registrationPage.linkToSignUp).click();
    }

    @Test
    public void registerWithoutName(){
        RegistrationPage registrationPage = new RegistrationPage(driver);

        driver.findElement(registrationPage.linkToSurname).sendKeys("Musk");
        driver.findElement(registrationPage.linkToEmail).sendKeys("xae@yahoo.com");
        driver.findElement(registrationPage.linkToPassword).sendKeys("pa$$w0d");
        driver.findElement(registrationPage.linkToUsername).sendKeys("Xae");
        driver.findElement(registrationPage.linkToRulebook).click();
        driver.findElement(registrationPage.linkToSignUp).click();
    }

    @Test
    public void loginViaFacebook()
    {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        driver.findElement(registrationPage.linkToFacebookLogin).click();
    }

    @After
    public void driverQuit () {
        if (driver != null) {
            driver.quit();
        }
    }
}
