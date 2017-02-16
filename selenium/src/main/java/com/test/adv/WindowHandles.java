package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by nani on 2/10/2017.
 */
public class WindowHandles {
    String baseUrl = "http://demo.guru99.com/popup.php";
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
    public void verifyWindows() throws InterruptedException {
        //handle for the current window
           String parentWindow = driver.getWindowHandle();
        System.out.println("current window handle: "+parentWindow);
//        open the pop up windows
        WebElement popupLink = driver.findElement(By.linkText("Click Here"));
        popupLink.click();

         //get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Total no of Winows: "+ allWindowHandles.size());
        Iterator<String> HandlesIterator = allWindowHandles.iterator();

        //using while loop
        // (0 < 2) first iteration
        // (1 < 2) second iteration
        while(HandlesIterator.hasNext()){
            String currentHandle = HandlesIterator.next();
            System.out.println("Window hanlde: "+currentHandle);

            //switch to child window, ignore if it is a parent window
            if(!currentHandle.equalsIgnoreCase(parentWindow)){
                System.out.println("Child window found");
                //print url before switching
                System.out.println("Before switching i am in "+driver.getCurrentUrl());
                //switch to the child window
                driver.switchTo().window(currentHandle);

                //use external condition
                WebDriverWait wait = new WebDriverWait(driver, 10);
                //wait till the input box is clickable
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("emailid"))));

                //print url after switching
                System.out.println("After switching i am in "+driver.getCurrentUrl());
                //close the pop up window
//                driver.close();
            }else{
                System.out.println("Ignoring the parent window");
            }
        }
        //switch back to parent window
        driver.switchTo().window(parentWindow);
//        driver.navigate().back();
        System.out.println("Switch back to parent window: "+driver.getCurrentUrl());
        //click on the link again
        popupLink.click();
    }
}
