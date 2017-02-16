package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Google Signup page
 * Step1: Go to Google.com (PAGE 1)
 * Step2: Click on GMAIL link (PAGE 2)
 * Step3: Click on 'Create Account' link in Gmail Sign in page
 * Step4: Fill the form (PAGE 3)
 */
public class GmailSignup {
    String baseUrl = "https://www.google.co.in";
    WebDriver driver;

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nani\\Downloads\\chromedriver.exe");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void verifyWindows() {
        //click on gmail link in home page
        driver.findElement(By.linkText("Gmail"));
        // click on "create account" in sign in page
        driver.findElement(By.linkText("Create an account"));
        //fill singup form
        driver.findElement(By.id("firstname-placeholder")).sendKeys("Test");
        driver.findElement(By.id("lastname-placeholder")).sendKeys("User123");


    }
}