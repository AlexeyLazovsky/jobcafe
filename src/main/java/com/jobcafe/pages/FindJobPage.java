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

    public JobSearchResultPage searchByPosition(String position) {
        WebElement positionInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[1]"));
        positionInput.sendKeys(position);
        positionInput.submit();
        return new JobSearchResultPage(driver);
    }


    public void clearSearch() {
        WebElement searchInput = driver.findElement(By.xpath("//input[@name='q']"));
        searchInput.clear();
    }

    public WebElement getSidebarElement() {
        return driver.findElement(By.xpath("//div[@class='sidebar']"));
    }

    public void enterPosition(String position) {
        WebElement positionInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[1]"));
        positionInput.sendKeys(position);
    }

    public void enterLocation(String location) {
        WebElement locationInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[2]"));
        locationInput.sendKeys(location);
    }

    public void enterCompany(String company) {
        WebElement companyInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[3]"));
        companyInput.sendKeys(company);
    }

    public void enterDescription(String description) {
        WebElement descriptionInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[4]"));
        descriptionInput.sendKeys(description);
    }

    public String getPositionInputText() {
        WebElement positionInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[1]"));
        return positionInput.getAttribute("value");
    }

    public String getLocationInputText() {
        WebElement locationInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[2]"));
        return locationInput.getAttribute("value");
    }

    public String getCompanyInputText() {
        WebElement companyInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[3]"));
        return companyInput.getAttribute("value");
    }

    public String getDescriptionInputText() {
        WebElement descriptionInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[4]"));
        return descriptionInput.getAttribute("value");
    }


    public String getPositionInputValue() {
        WebElement positionInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[1]"));
        return positionInput.getAttribute("value");
    }

    public String getLocationInputValue() {
        WebElement locationInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[2]"));
        return locationInput.getAttribute("value");
    }

    public String getCompanyInputValue() {
        WebElement companyInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[3]"));
        return companyInput.getAttribute("value");
    }

    public String getDescriptionInputValue() {
        WebElement descriptionInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[4]"));
        return descriptionInput.getAttribute("value");
    }

    public void populateCompanyInput(String company) {
        WebElement companyInput = driver.findElement(By.xpath("//*[@id='jobs']/div/div/div[2]/div/div/form/input[3]"));
        companyInput.sendKeys(company);
    }



    public void populateDescriptionInput(String company) {
        WebElement companyInput = driver.findElement(By.xpath("//*[@id=\"jobs\"]/div/div/div[2]/div/div/form/input[4]"));
        companyInput.sendKeys(company);
    }


}
