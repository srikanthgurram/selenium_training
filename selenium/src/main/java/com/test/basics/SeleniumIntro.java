package com.test.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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


    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.gecko.driver", "/home/srikanth/Downloads/softwares/drivers/geckodriver");
        //open browser
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.gmail.com");
    }

    @Test
    public void verifyLoginPage(){

    }

    @Test
    public void openSignupPage(){

    }

    @Test
    public void fillDetailsInSingupPage(){

    }

}
