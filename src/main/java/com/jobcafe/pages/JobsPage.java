package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JobsPage {

    private final WebDriver driver;

    public JobsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.getTitle().equals("JobCafe");
    }

    public void enterSearchLocation(String location) {
        WebElement searchLocation = driver.findElement(By.id("searchLocation"));
        searchLocation.sendKeys(location);
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(), 'Search')]"));
        searchButton.click();
    }

    public void searchJobsByLocation(String location) {
        enterSearchLocation(location);
        clickSearchButton();
    }

    public void selectJobType(String jobType) {
        Select jobTypeDropdown = new Select(driver.findElement(By.id("jobType")));
        jobTypeDropdown.selectByVisibleText(jobType);
    }

    public void searchJobsByLocationAndType(String location, String jobType) {
        enterSearchLocation(location);
        selectJobType(jobType);
        clickSearchButton();
    }

}
