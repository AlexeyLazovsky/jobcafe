package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AboutUsPage {

    private static final String ABOUT_US_PAGE_URL = "http://167.99.178.249:3000/about";

    private final WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(ABOUT_US_PAGE_URL);
    }

    public boolean isLogoVisible() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/section[1]/div/div/h2"));
        return logo.isDisplayed();
    }
}
