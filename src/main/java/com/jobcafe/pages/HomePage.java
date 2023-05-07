package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("http://167.99.178.249:3000/");
    }

    public boolean isPageLoaded() {
        return driver.getTitle().equals("JobCafe");
    }

    public boolean isLogoDisplayed() {
        WebElement logo = driver.findElement(By.cssSelector(".navbar-brand img"));
        return logo.isDisplayed();
    }

    public boolean isComingSoonDisplayed() {
        WebElement comingSoon = driver.findElement(By.cssSelector(".hero-banner img"));
        return comingSoon.isDisplayed();
    }

    public void clickAboutUs() {
        driver.findElement(By.linkText("About Us")).click();
    }

    public void clickJobs() {
        driver.findElement(By.linkText("Jobs")).click();
    }

    public void enterLoginCredentials(String username, String password) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void submitLoginForm() {
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }

}
