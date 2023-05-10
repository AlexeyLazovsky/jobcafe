package com.jobcafe.tests;

import com.jobcafe.pages.AboutUsPage;
import com.jobcafe.pages.HomePage;
import com.jobcafe.utils.SharedDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.jobcafe.utils.SharedDriver.Browser;

public class AboutUsPageTest extends BaseTest {

    @Test
    public void testAboutUsPage() {
        WebDriver driver = SharedDriver.getWebDriver(Browser.CHROME);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        AboutUsPage aboutUsPage = homePage.clickAboutUsOption();
        Assertions.assertTrue(aboutUsPage.isLogoVisible());
        SharedDriver.closeDriver();
    }
}
