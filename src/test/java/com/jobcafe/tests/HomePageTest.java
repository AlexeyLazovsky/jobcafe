package com.jobcafe.tests;

import com.jobcafe.pages.HomePage;
import com.jobcafe.utils.SharedDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class HomePageTest {


    @Test
    public void testOpenHomePageAndLogoVisible() {
        WebDriver driver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        Assertions.assertTrue(homePage.isPageLoaded());
        driver.quit();
    }

}
