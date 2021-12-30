package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentationPage extends BasePage{
    public String documentationURL = "href=\"https://docs.microsoft.com/pl-pl/azure/devops/index?view=vsts\"";
    public By linkToDocumentation = By.xpath("/html/body/main/div[3]/div/nav/ol/li[4]/a");
    public By linkToDocumentation2 = By.xpath("//*[@id=\"utility-dropdown\"]/ul/li[1]/a");
    public By durnySelector = By.cssSelector("#utility-dropdown > ul > li:nth-child(1) > a");
    public By cookiesWindow = By.xpath("//*[@id=\"wcpConsentBannerCtrl\"]");
    public By linkToAcceptCookies = By.xpath("/html/body/div[1]/div[1]/div/div[2]/button[1]");

    public DocumentationPage(WebDriver driver) {
        super(driver);
    }
}
