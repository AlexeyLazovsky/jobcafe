package com.jobcafe.logs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import java.util.logging.Level;

public class Logger {
    private static final Level LOG_LEVEL = Level.ALL;

    public static void setupLogging(WebDriver driver) {
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, LOG_LEVEL);

        driver.manage().logs().get(LogType.PERFORMANCE);

        java.util.logging.Logger.getLogger("").setLevel(LOG_LEVEL);
    }
}
