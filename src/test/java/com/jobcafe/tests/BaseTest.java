package com.jobcafe.tests;
import com.jobcafe.utils.Browser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = Browser.setup();
    }



    @AfterEach
    public void tearDown() {
        driver.close();
        driver.quit();
        Browser.tearDown();
    }

    @AfterAll
    public static void closeDriver() {
        // driver.quit();
    }



}