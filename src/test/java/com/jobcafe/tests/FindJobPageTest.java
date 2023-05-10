package com.jobcafe.tests;

import com.jobcafe.pages.FindJobPage;
import com.jobcafe.pages.HomePage;
import com.jobcafe.utils.SharedDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FindJobPageTest extends BaseTest {

    @Test
    public void testOpenFindJobPage() {
        WebDriver driver = SharedDriver.getWebDriver(SharedDriver.Browser.CHROME);
        HomePage homePage = new HomePage(driver);
        homePage.open();
        FindJobPage findJobPage = homePage.clickFindJobOption();
        Assertions.assertTrue(findJobPage.isPageLoaded());
        Assertions.assertTrue(findJobPage.getSidebarElement().isDisplayed());
        Assertions.assertTrue(findJobPage.getSearchButtonElement().isDisplayed());
        SharedDriver.closeDriver();
    }

}
