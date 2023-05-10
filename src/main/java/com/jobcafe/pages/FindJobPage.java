package com.jobcafe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class FindJobPage {

    private static final String FIND_JOB_PAGE_URL = "http://167.99.178.249:3000/job-page";

    private final WebDriver driver;

    public FindJobPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void open() {
        driver.get(FIND_JOB_PAGE_URL);
    }

    public boolean isPageLoaded() {
        return driver.getCurrentUrl().equals(FIND_JOB_PAGE_URL);
    }

    public WebElement getSearchButtonElement() {
        return driver.findElement(By.xpath("//button[@class='search-butom']"));
    }

    public WebElement getLocationSearchBarElement() {
        return driver.findElement(By.xpath("//input[@name='location']"));
    }

    public JobSearchResultPage searchByLocation(String location) {
        WebElement locationSearchBar = getLocationSearchBarElement();
        WebElement searchButton = getSearchButtonElement();

        locationSearchBar.sendKeys(location);
        searchButton.click();

        return new JobSearchResultPage(driver);
    }

    public void clearSearch() {
        WebElement searchInput = driver.findElement(By.xpath("//input[@name='q']"));
        searchInput.clear();
    }

    public WebElement getSidebarElement() {
        return driver.findElement(By.xpath("//div[@class='sidebar']"));
    }
}
