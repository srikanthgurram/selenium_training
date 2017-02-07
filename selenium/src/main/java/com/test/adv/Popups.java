package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by srikanth on 7/2/17.
 */
public class Popups {
    String baseUrl = "http://demo.guru99.com/popup.php";
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
    public void verifyWindows() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        //open the pop up windows
        driver.findElement(By.linkText("Click Here")).click();

        // get all the window handles
        // Set is is similar to List, but it doesn't contain duplicates
        Set<String> windowHandles = driver.getWindowHandles();
        // Iterator is used with the Set
        Iterator<String> handles = windowHandles.iterator();

        // iterating over the set of elements
        for(;handles.hasNext();){
        // while(handles.hasNext()){

            //.next returns the curent element in the set
            String childWindow = handles.next();
            if(childWindow.compareToIgnoreCase(parentWindow) != 0){
                // display current url
                System.out.println("Main URL: "+driver.getCurrentUrl());

                //  swith to pop up / window
                driver.switchTo().window(childWindow);
                System.out.println("Child URL: "+driver.getCurrentUrl());

                //ChildWindow: enter text in the email field
                driver.findElement(By.name("emailid")).sendKeys("ex@x.com");
                driver.findElement(By.name("btnLogin")).click();
                //close the pop up window
//                driver.close();

                //switch back to main window (method 1)
//                driver.switchTo().defaultContent();

                //switch to main window using the handle (method 2)
                 driver.switchTo().window(parentWindow);

                // make sure you are on the right page
                Assert.assertEquals("http://demo.guru99.com/popup.php",
                                    driver.getCurrentUrl());

                driver.findElement(By.linkText("Click Here")).click();

            }
        }


    }

}
