package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class JobSearchResultPage {

    private final WebDriver driver;

    public JobSearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isResultListDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement results = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"jobs\"]/div/div/div[1]/div/article/ul/li")));
        List<WebElement> resultElements = results.findElements(By.xpath("//*[@id=\"jobs\"]/div/div/div[1]/div/article/ul/li"));
        return resultElements.size() > 0;
    }
    //  //*[@id="jobs"]/div/div/div[1]/div/article/ul/li[1]/span[2]/text()
    public List<String> getResultLocations() {
        List<WebElement> resultElements = driver.findElements(By.xpath("//*[@id=\"jobs\"]/div/div/div[1]/div/article/ul/li[1]/span[2]"));
        List<String> locations = new ArrayList<>();
        for (WebElement element : resultElements) {
            locations.add(element.getText());
        }
        return locations;
    }

    public String getResultLocationByIndex(int index) {
        WebElement resultElement = driver.findElement(By.xpath(String.format("//div[@class='job-result'][%d]//span[@class='job-result__location']", index)));
        return resultElement.getText();
    }
    public void pressResetButton() {
        WebElement resetButton = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/button[2]"));
        resetButton.click();
    }



}
