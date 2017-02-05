package com.test.adv;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by srikanth on 2/2/17.
 *
 * Scenario:
     1. Open Google.com
     2. Click on Search bar
     4. Check if Search button is present or not?
     3. Enter some text "Hello"
     4. Again check if search button is present
     5. if button is present, click on it
 */
public class VerifyingElementIsPresent {
    String baseUrl = "https://www.google.co.in/";
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "/home/srikanth/Downloads/softwares/drivers/chromedriver");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        /**
         *  ImplictWait tells browser to wait for the specified amount of time
         *  before throwing ElementNotFound exception
        */
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verifySearchButton() {
        //make sure google page is opened
        Assert.assertEquals(driver.getTitle(),"Google");

        WebElement searchBar = driver.findElement(By.id("lst-ib"));
        searchBar.clear();
        searchBar.sendKeys("Hello");
        searchBar.sendKeys(Keys.ESCAPE);

        //verify element is present or not
        WebElement searchBtn = driver.findElement(By.id("_fZl"));

        // check if hidden element is displayed
        if (searchBtn.isDisplayed()){
            System.out.println("Search button is displayed");
            searchBtn.click();
        }else{
            System.out.println("Search button is not displayed");
        }

        // checking if element is not present
        if(elementIsFound("hdtb-msb")){
            System.out.println("Element is found");
        }else{
            System.out.println("Element is not found");
        }

    }

    //method checking if element is present
    public boolean elementIsFound(String id){
        try{
            driver.findElement(By.id(id));
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }
}
