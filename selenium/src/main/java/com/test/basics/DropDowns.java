package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by srikanth on 11/1/17.
 */
public class DropDowns {
    String baseUrl = "https://www.facebook.com/";
    WebDriver driver;

    @BeforeClass
    public void openBrowser(){
        // get the chromedriver instance
        System.setProperty("webdriver.chrome.driver",
                "/home/srikanth/Downloads/softwares/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterClass
    public void quitBrowser(){
//        driver.quit();
    }

    @Test
    public void verifyDropDowns(){
        WebElement monthDropDown =
                driver.findElement(By.cssSelector("select#month._5dba"));
        Select monthSelection = new Select(monthDropDown);

//        daySelection.selectByIndex(4);
//        monthSelection.selectByVisibleText("Apr");
        monthSelection.selectByValue("6");
        List<WebElement> options = monthSelection.getOptions();
    }






}
