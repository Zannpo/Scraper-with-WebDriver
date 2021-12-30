package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL= "https://azure.microsoft.com/pl-pl/services/devops/#overview";

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void openHomePage(){
        driver.get(baseURL);
    }
}
