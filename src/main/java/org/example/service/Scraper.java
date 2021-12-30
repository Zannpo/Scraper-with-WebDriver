package org.example.service;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
//@AllArgsConstructor
public class Scraper {

    private static final String baseURL= "https://www.diki.pl/";

    private static final ChromeDriver driver = new ChromeDriver();

    @PostConstruct
    void postConstruct()
    {
        //A searching query
        scrape("scraping");
    }

    public void scrape(final String queryValue)
    {
        driver.get(baseURL + queryValue);

        //Wait for the cookies to be clickable
        WebDriverWait wait = new WebDriverWait(driver,10);
        final WebElement linkToCookiesWindow = driver.findElementByClassName("abstractButtonAppearance");
        wait.until(ExpectedConditions.elementToBeClickable(linkToCookiesWindow));
        linkToCookiesWindow.findElement(By.cssSelector(".buttonText")).click();

        final WebElement scrapedElements = driver.findElementByClassName("dictionaryEntity");
        final List<WebElement> elementsList = scrapedElements.findElements(By.tagName("a"));
        elementsList.forEach(element -> System.out.println(element.getText()));
        if (driver != null) {
            driver.quit();
        }
    }

}
