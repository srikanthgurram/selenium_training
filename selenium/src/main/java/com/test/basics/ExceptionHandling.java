package com.test.basics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by srikanth on 1/2/17.
 */
public class ExceptionHandling {

    // Error handling
    String baseUrl = "http://getbootstrap.com/";
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "/home/srikanth/Downloads/softwares/drivers/chromedriver");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void testElementThatDoesNotExists(){
        try {
            WebElement element1 = driver.findElement(By.className("My.Class"));
        } catch (InvalidSelectorException i){
            System.out.println("You have given invalid selector");
        } catch (NoSuchElementException e){
            System.out.println("Hey!, element is not found");
            e.printStackTrace();
        }

        System.out.println("__________________After Error occured");
        //InvalidSelectorException
        //NoSuchElementException
    }

}









