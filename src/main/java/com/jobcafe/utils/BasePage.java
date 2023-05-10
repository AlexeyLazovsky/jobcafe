package com.jobcafe.utils;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;


    public BasePage() {}

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        // Method to check if page is loaded
        return true;
    }


}
