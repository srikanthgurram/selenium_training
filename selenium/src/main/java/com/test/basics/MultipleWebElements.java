package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srikanth on 29/1/17.
 */
public class MultipleWebElements {
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

    @Test(enabled = false)
    public void verifyMenuItems() throws InterruptedException {
        WebElement leftNavBar = driver.findElement(
                By.cssSelector("nav.collapse.navbar-collapse > ul:nth-child(1)"));

        List<WebElement> liItems = leftNavBar.findElements(By.tagName("li"));
        System.out.println("List items available = "+liItems.size());
        int noOfItems = liItems.size();


/*
        for(int i=0;i<noOfItems;i++){
            WebElement leftNavBar2 = driver.findElement(
                    By.cssSelector("nav.collapse.navbar-collapse > ul:nth-child(1)"));

            List<WebElement> liItems2 = leftNavBar2.findElements(By.tagName("li"));

            //click on the element
            liItems2.get(i).click();
            //navigate back to home page
            driver.navigate().back();
            Thread.sleep(1000);

        }

*/


        List<String> links = new ArrayList<String>();
        //get all the links
        for(int i=0; i<liItems.size(); i++){
            WebElement element = liItems.get(i);
            String link = element.findElement(By.tagName("a")).getAttribute("href");
            links.add(link);
        }

        System.out.println("Total links available = "+links.size());
        //iterate over the arrays
        for (int j=0; j<links.size(); j++){
            System.out.println("Opening link "+links.get(j));
            driver.get(links.get(j));
            driver.navigate().back();
            Thread.sleep(1000);
        }

    }

    @Test
    public void verifyImages() throws InterruptedException {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        List<String> imageLinks = new ArrayList<String>();

        for(int i=0;i<images.size();i++){
            imageLinks.add(images.get(i).getAttribute("src"));
        }

        for(int j=0;j<imageLinks.size();j++){
            driver.get(imageLinks.get(j));
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(1000);
        }
    }
}
