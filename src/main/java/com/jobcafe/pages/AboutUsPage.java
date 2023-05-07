package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutUsPage {

    private WebDriver driver;

    public AboutUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.getTitle().equals("About Us");
    }

    public boolean isLogoDisplayed() {
        WebElement logo = driver.findElement(By.cssSelector(".navbar-brand img"));
        return logo.isDisplayed();
    }

    public String getAboutUsText() {
        WebElement aboutUsText = driver.findElement(By.cssSelector(".page-content p"));
        return aboutUsText.getText();
    }

}
