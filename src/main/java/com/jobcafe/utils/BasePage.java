package com.jobcafe.utils;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    // Default constructor is added to prevent the error you encountered
    public BasePage() {}

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageLoaded() {
        // Method to check if page is loaded
        return true;
    }

    // Other common methods can be added here
}
