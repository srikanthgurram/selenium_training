package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by srikanth on 4/1/17.
 */
public class SeleniumIntro {
    /**
     * Test case to verify Google Signup Page
     * Pre-requisites (or) Test setup:
     *  - Install any required softwares
     *  - setup
     *
     * Steps:
     *  1. Open Browser
     *      - expected: browser should be opened

     *  2. Open url www.gmail.com
     *      - expected: Gmail sign in page should appear
     *
     *  3. Click on 'create_account' link
     *      - expected: Gmail Singup Page should open
     *
     *  4. Fill all the details and 'Signup'
     *      - expected: Gmail account has to be created
     */
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.gecko.driver", "/home/srikanth/Downloads/softwares/drivers/geckodriver");
        //open browser
        driver = new FirefoxDriver();
        driver.get("http://www.gmail.com");
    }

    @AfterClass
    public void closeBrowser(){
        // it close the current window launched by driver
//        driver.close();
        // it closes all the child windows along with the current window
        driver.quit();
    }

    @Test(priority = 0)
    public void openLoginPage(){
        /*
            Verify the current URL
            Verify page header
            Verify Input Box & Next button (may not be unique)
            Verify text ' Sign in to continue to Gmail '
            Verify the link 'Find my account'
            Verify Page title
         */

        // Verifying based on the Current URL
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("accounts.google.com"));

        //Verifying based on the Page Title
        Assert.assertEquals(driver.getTitle(), "Gmail");

    }

    @Test(priority = 1)
    public void openSignupPage() throws InterruptedException {
        WebElement signUpLink = driver.findElement(By.linkText("Create account"));
        signUpLink.click();
        //adding time delay
        Thread.sleep(2000);
        String pageTitle = driver.getTitle();
        //Assertions
        Assert.assertEquals(pageTitle, "Create your Google Account");
    }

    @Test(priority = 2)
    public void fillDetailsInSingupPage(){

    }

}
