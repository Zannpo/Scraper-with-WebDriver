package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WordPage extends BasePage{
    public By linkToCookiesWindow = By.className("abstractButtonAppearance");
    public By linkToAcceptCookies = By.cssSelector(".buttonText");

    public WordPage(WebDriver driver) {
        super(driver);
    }
}
