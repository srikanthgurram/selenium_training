package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by nani on 3/8/2017.
 */
public class MouseActions {
    WebDriver driver;
    String baseUrl = "";

    @BeforeClass
    public void initializeDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nani\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @AfterClass
    public void closeDriver(){
        //driver.quit();
    }

    @Test(enabled = false)
    public void verifyMouseActions(){
        baseUrl = "https://www.amazon.in/";
        driver.get(baseUrl);
        WebElement primeDropDown = driver.findElement(By.xpath("//a[@id='nav-link-prime']/span[1]"));
        Actions myActions = new Actions(driver);

        Action mouseHoverAction = myActions.
                                        moveToElement(primeDropDown).
                                        click().
                                        build();
        mouseHoverAction.perform();
    }


    @Test(enabled = false)
    public void verifyDragNDrop(){
        baseUrl = "http://jqueryui.com/droppable/";
        driver.get(baseUrl);
        Actions myActions = new Actions(driver);

        //wait for frame to be present
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement destination = driver.findElement(By.id("droppable"));

        //drag and drop operation
        Action dragAndDropAction = myActions.dragAndDrop(source,destination).build();
        dragAndDropAction.perform();
        String textPresent = driver.findElement(By.xpath("//*[@id='droppable']/p")).getText();

        //check if elemet is dropped or not?
        Assert.assertEquals(textPresent,"Dropped!");

        //switch to the main page
        driver.switchTo().defaultContent();
    }


}
