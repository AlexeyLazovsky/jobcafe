package com.jobcafe.tests;

import com.jobcafe.pages.FindJobPage;
import com.jobcafe.pages.HomePage;
import com.jobcafe.pages.JobSearchResultPage;
import com.jobcafe.utils.SharedDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JobSearchTest extends BaseTest {


    @Test

    public void testLocationVisibility() {
        WebDriver driver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        FindJobPage findJobPage = homePage.clickFindJobOption();
        JobSearchResultPage torontoResults = findJobPage.searchByLocation("Toronto");

        // Reset search and wait 5 seconds
        torontoResults.pressResetButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JobSearchResultPage TelAvivResults = findJobPage.searchByLocation("Tel Aviv");

        TelAvivResults.pressResetButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JobSearchResultPage  ChicagoResults =  findJobPage.searchByLocation("Chicago");
        ChicagoResults.pressResetButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JobSearchResultPage  NewYorkResults =  findJobPage.searchByLocation("New York");

    }


    @Test
    public void testSearchByPositionAndLocation() {
        WebDriver driver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        FindJobPage findJobPage = homePage.clickFindJobOption();

        // Search for QA positions
        JobSearchResultPage qaResults = findJobPage.searchByPosition("QA");
        assertTrue(qaResults.isResultListDisplayed());
        List<String> qaLocations = qaResults.getResultLocations();
        for (String location : qaLocations) {
            System.out.println(location);
        }

        // Reset search and wait 5 seconds
        qaResults.pressResetButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Search for Developer positions
        JobSearchResultPage developerResults = findJobPage.searchByPosition("Developer");
        assertTrue(developerResults.isResultListDisplayed());
        List<String> developerLocations = developerResults.getResultLocations();
        for (String location : developerLocations) {
            System.out.println(location);
        }

        // Reset search and wait 5 seconds
        developerResults.pressResetButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Search for Project Manager positions
        JobSearchResultPage projectManagerResults = findJobPage.searchByPosition("Project Manager");
        assertTrue(projectManagerResults.isResultListDisplayed());
        List<String> pmLocations = projectManagerResults.getResultLocations();
        for (String location : pmLocations) {
            System.out.println(location);
        }
    }

    @Test
    public void testInvalidSearchByPosition() {
        WebDriver driver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        FindJobPage findJobPage = homePage.clickFindJobOption();
        JobSearchResultPage invalidResults = findJobPage.searchByPosition("abracadabra");
        assertTrue(invalidResults.isNoResultsFoundDisplayed());
    }

    @Test
    public void testResetSearchFields() {
        WebDriver driver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        FindJobPage findJobPage = homePage.clickFindJobOption();

        JobSearchResultPage qaResults = findJobPage.searchByPosition("QA");
        assertTrue(qaResults.isResultListDisplayed());
        List<String> qaLocations = qaResults.getResultLocations();
        for (String location : qaLocations) {
            System.out.println(location);
        }


        findJobPage.searchByLocation("New York");


        findJobPage.populateCompanyInput("Microsoft");

        findJobPage.populateDescriptionInput("test description");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        qaResults.pressResetButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}












