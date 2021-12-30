package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.DocumentationPage;
import page.WordPage;

public class BaseTest {
    public WebDriver driver;
    private Object WebDriverManager;


    @Before
    public void driverSetup(){
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.diki.pl/");
        //driver.navigate().to("https://azure.microsoft.com/pl-pl/services/devops/#overview");
        //driver.manage().window().maximize();
    }

    @Test
    public void demo(){
        //DocumentationPage documentationPage = new DocumentationPage(driver);

        WordPage wordPage = new WordPage(driver);
        //Wait for the cookies to be clickable
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(wordPage.linkToAcceptCookies));
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(wordPage.linkToAcceptCookies));
        //if(driver.findElement(documentationPage.cookiesWindow).isDisplayed() == true)
        //{
        //    driver.findElement(documentationPage.linkToAcceptCookies).click();
        //}
        //else
        //driver.findElement(documentationPage.linkToDocumentation).click();
    }

    @After
    public void driverQuit () {
        if (driver != null) {
            driver.quit();
        }
    }
}
