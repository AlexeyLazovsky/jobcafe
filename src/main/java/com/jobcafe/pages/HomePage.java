package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private static final String HOME_PAGE_URL = "http://167.99.178.249:3000/";

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(HOME_PAGE_URL);
    }

    public boolean isPageLoaded() {
        WebElement getStartedButton = driver.findElement(By.xpath("//*[@id=\"heroCarousel\"]/div"));
        return getStartedButton.isDisplayed();
    }
    public AboutUsPage clickAboutUsOption() {
        WebElement aboutUsLink = driver.findElement(By.xpath("//a[contains(@href, '/about')]"));
        aboutUsLink.click();
        return new AboutUsPage(driver);
    }




}


////*[@id="heroCarousel"]/div