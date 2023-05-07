package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {

    private WebDriver driver;

    public JobsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        return driver.getTitle().equals("Jobs");
    }

    public void enterLocation(String location) {
        driver.findElement(By.id("location")).sendKeys(location);
    }

    public void enterPosition(String position) {
        driver.findElement(By.id("position")).sendKeys(position);
    }

    public void enterCompany(String company) {
        driver.findElement(By.id("company")).sendKeys(company);
    }

    public void submitSearchForm() {
        driver.findElement(By.cssSelector(".btn-primary")).click();
    }

    public boolean isSearchResultsDisplayed() {
        WebElement searchResults = driver.findElement(By.cssSelector(".search-results"));
        return searchResults.isDisplayed();
    }

    public boolean isNoResultsMessageDisplayed() {
        WebElement noResultsMessage = driver.findElement(By.cssSelector(".alert-warning"));
        return noResultsMessage.isDisplayed();
    }

    public void resetSearchForm() {
        driver.findElement(By.cssSelector(".btn-secondary")).click();
    }

    public boolean isSearchFormReset() {
        WebElement locationInput = driver.findElement(By.id("location"));
        WebElement positionInput = driver.findElement(By.id("position"));
        WebElement companyInput = driver.findElement(By.id("company"));

        return locationInput.getText().isEmpty() && positionInput.getText().isEmpty() && companyInput.getText().isEmpty();
    }

}
