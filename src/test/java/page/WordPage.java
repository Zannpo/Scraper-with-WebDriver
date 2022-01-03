package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WordPage extends BasePage{
    public By linkToCookiesWindow = By.className("abstractButtonAppearance");
    public By linkToAcceptCookies = By.cssSelector(".buttonText");
    public By linkToInputWord = By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/form/div[1]/input");
    public By linkToSearchingLoop = By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/form/button");
    public By linkToCancelWord = By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/div/form/div[1]/a");
    public By linkToPronounciation = By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[1]/h1/span[2]/span[1]/span");
    public By linkToGetSentences = By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[1]/div[3]/div[3]/a");
    public By linkToFirstWord = By.xpath("/html/body/div[3]/div[2]/div[2]/div[1]/div/div[1]/ol[1]/li/span[1]/a");


    public WordPage(WebDriver driver) {
        super(driver);
    }
}
