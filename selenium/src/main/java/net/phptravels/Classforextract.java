package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maade on 1/28/2017.
 */
public class Classforextract {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","/home/srikanth/Downloads/softwares/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://phptravels.net/");
    }

    @Test(priority = 0,enabled = true)
    public void verifyMenuItems() throws InterruptedException {
        WebElement leftNavBar = driver.findElement(By.cssSelector("div.navbar-collapse.collapse > ul:nth-child(1)"));

        List<WebElement> liTems = leftNavBar.findElements(By.tagName("li"));
        System.out.println("list items available " + liTems.size());
        int noofItems = liTems.size();

        List<String> links = new ArrayList<String>();

        for(int i=0; i<liTems.size(); i++){
            WebElement element = liTems.get(i);
            try{
                String link = element.findElement(By.tagName("a")).getAttribute("href");
                links.add(link);
            }catch (NoSuchElementException e){
                System.out.println("Error: "+e.getMessage());
            }
        }
        System.out.println("list of link items " + links.size());

        for(int j=0; j<links.size(); j++){
            System.out.println("Opening link "+links.get(j));
            driver.get(links.get(j));
            driver.navigate().back();
            Thread.sleep(5000);
        }
    }

    @Test(priority = 1, enabled = false)
    public void verifyImages() throws InterruptedException {
       List<WebElement> images = driver.findElements(By.tagName("img"));
       List<String> imageLinks = new ArrayList<String>();
       for(int i=0; i<images.size(); i++){
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
