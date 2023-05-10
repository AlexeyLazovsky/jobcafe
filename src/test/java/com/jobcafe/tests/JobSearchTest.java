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





//    @Test
//    public void testTorontoLocationVisibility() {
//        WebDriver driver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
//        HomePage homePage = new HomePage(driver);
//        homePage.open();
//        FindJobPage findJobPage = homePage.clickFindJobOption();
//        JobSearchResultPage torontoResults = findJobPage.searchByLocation("Toronto");
//        //clear search....wait 5 s next line
//        JobSearchResultPage TelAvivResults = findJobPage.searchByLocation("Tel-Aviv");
//
//    }
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;
//
//    public class JobSearchTest {

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
    }










