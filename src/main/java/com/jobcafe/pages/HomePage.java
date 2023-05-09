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

    public FindJobPage clickFindJobOption() {
        WebElement findJobButton = driver.findElement(By.xpath("//*[@id=\"3\"]"));
        findJobButton.click();
        return new FindJobPage(driver);
    }

    public AboutUsPage clickAboutUsOption() {
        WebElement aboutUsButton = driver.findElement(By.xpath("//a[@href='/about']"));
        aboutUsButton.click();
        return new AboutUsPage(driver);
    }
}
