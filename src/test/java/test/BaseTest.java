package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.DocumentationPage;

public class BaseTest {
    public WebDriver driver;
    private Object WebDriverManager;


    @Before
    public void driverSetup(){
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://azure.microsoft.com/pl-pl/services/devops/#overview");
        //driver.manage().window().maximize();
    }

    @Test
    public void demo(){
        DocumentationPage documentationPage = new DocumentationPage(driver);
        driver.findElement(documentationPage.linkToDocumentation).click();
    }

    @After
    public void driverQuit () {
        if (driver != null) {
            driver.quit();
        }
    }
}
