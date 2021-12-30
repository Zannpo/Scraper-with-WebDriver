package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.navigate().to("https://www.diki.pl/slownik-angielskiego?q=scraping");
        //driver.navigate().to("https://azure.microsoft.com/pl-pl/services/devops/#overview");
        driver.manage().window().maximize();
    }

    @Test
    public void demo(){
        WordPage wordPage = new WordPage(driver);
        WebDriverWait wait = new WebDriverWait(driver,10);
        final WebElement linkToCookiesWindow = driver.findElement(By.className("abstractButtonAppearance"));
        if(linkToCookiesWindow.isDisplayed())
        {
            wait.until(ExpectedConditions.elementToBeClickable(linkToCookiesWindow));
            linkToCookiesWindow.findElement(By.cssSelector(".buttonText")).click();
        }
        driver.findElement(wordPage.linkToPronounciation).click();
        driver.findElement(wordPage.linkToGetSentences).click();
        driver.findElement(wordPage.linkToFirstWord).click();
    }

    @After
    public void driverQuit () {
        if (driver != null) {
            driver.quit();
        }
    }
}
