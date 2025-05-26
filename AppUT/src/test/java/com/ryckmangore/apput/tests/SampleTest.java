package com.ryckmangore.apput.tests;

import com.ryckmangore.apput.hooks.SeleniumHooks;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void verifyGoogleTitle() {
        WebDriver driver = SeleniumHooks.driver; // Access the driver from the hook class
        driver.get("https://www.google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
        System.out.println("Google title verified successfully.");
    }
}
