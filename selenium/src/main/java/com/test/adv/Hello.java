package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by nani on 2/10/2017.
 */
public class Hello {
    String baseUrl = "https://www.amazon.in/";
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nani\\Downloads\\chromedriver.exe");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeDriver(){
       // driver.quit();
    }

    @Test(enabled = false)
    public void verifyMoveToElement(){
        // Load page
        driver.get(baseUrl);
        WebElement linkToHover = driver.findElement(By.xpath("//*[@id='nav-link-wishlist']/span[2]"));
        Actions action = new Actions(driver);
        Action mouseOverHome = action.moveToElement(linkToHover).build();

        mouseOverHome.perform();
    }

    @Test
    public void verifyFileUpload(){
        driver.get("http://toolsqa.com/automation-practice-form/");
        driver.findElement(By.xpath("//*[@id='photo']")).sendKeys("C:\\Users\\nani\\Downloads\\upload.txt");
    }
}
