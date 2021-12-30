package org.example.service;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

    public void scrape(final String value)
    {
        driver.get(baseURL + value);
        final WebElement scrapedElements = driver.findElementByClassName("dictionaryEntity");
        final List<WebElement> elementsList = scrapedElements.findElements(By.tagName("a"));
        elementsList.forEach(element -> System.out.println(element.getText()));
        driver.quit();
    }

}
