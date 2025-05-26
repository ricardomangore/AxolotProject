package com.ryckmangore.apput.hooks;

import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SeleniumHooks {

    public static WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        // Code to run before the entire test suite
    }

    @AfterSuite
    public void afterSuite() {
        // Code to run after the entire test suite
    }

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        System.out.println("WebDriver initialized.");
    }

    @AfterTest
    public void afterTest() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("WebDriver closed.");
    }

    @BeforeMethod
    public void beforeMethod() {
        // Code to run before each test method
    }

    @AfterMethod
    public void afterMethod() {
        // Code to run after each test method
    }
}
