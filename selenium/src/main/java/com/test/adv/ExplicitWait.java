package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by srikanth on 3/2/17.
 */
public class ExplicitWait {
//    String baseUrl = "https://www.google.co.in/";
    String baseUrl = "https://www.youtube.com/";
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "/home/srikanth/Downloads/softwares/drivers/chromedriver");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        /**
         *  ImplictWait tells browser to wait for the specified amount of time
         *  before throwing NoSuchElement exception
         */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // page load time
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

        // Load page
        driver.get(baseUrl);
    }

    @Test
    public void verifyTitle(){
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("youtube"));
    }

    @Test(enabled = false)
    public void usingExplicitWait(){
        /**
         * Open Google.com
         * Enter some text in the search bar
         * Wait for search button to be displayed
         * Once it appears, click on it
         *
         * Before throwing ElementNotVisible exception, driver will wait for specified amount of time
         */

        // wait for Google page to be loaded
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.titleContains("Google"));

        WebElement searchBar = driver.findElement(By.id("lst-ib"));
        searchBar.clear();
        searchBar.sendKeys("Hello");

        // Maximum amount of time (30 seconds)
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_fZl")));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("_fZl"))));

        //click on the button
        WebElement searchBtn = driver.findElement(By.id("_fZl"));
        searchBtn.click();

    }


}
