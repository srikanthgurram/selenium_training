package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by maade on 2/7/2017.
 */
public class Windows {
    WebDriver driver;
    @BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nani\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();

        ProfilesIni myProfile = new ProfilesIni();
        FirefoxProfile automationProfile = myProfile.getProfile("Selenium");
        driver = new FirefoxDriver(automationProfile);

        System.out.println("driver address = "+driver);
        driver.get("http://www.phptravels.net/en");
    }

    @Test(priority = 0)
    public void bookHotel()throws InterruptedException{
        driver.findElement(By.xpath("html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
        WebElement loca = driver.findElement(By.id("citiesInput"));
        WebElement checkIn = driver.findElement(By.xpath("html/body/div[3]/div[4]/div/div/div[2]/div/form/div[2]/div/input"));
        WebElement checkOut = driver.findElement(By.xpath("html/body/div[3]/div[4]/div/div/div[2]/div/form/div[3]/div/input"));
        WebElement searchBtn = driver.findElement(By.xpath("html/body/div[3]/div[4]/div/div/div[2]/div/form/div[6]/div/button"));

        loca.sendKeys("Atlanta, Georgia, United States");
        checkIn.clear();
        checkIn.sendKeys("02/08/2017");
        checkOut.clear();
        checkOut.sendKeys("02/13/2017");
        searchBtn.click();
        Thread.sleep(1000);

        Assert.assertEquals(driver.getTitle(),"Search");
    }

    @Test(priority = 1)
    public void bookFlight() throws InterruptedException {
        driver.navigate().back();
        Thread.sleep(1000);
        driver.findElement(By.xpath("html/body/div[3]/div[3]/div/ul/li[3]/a")).click();
//        WebElement flyFrom = driver.findElement(By.id("a1"));
        WebElement flyFrom = driver.findElement(By.xpath("//form[@id='wego-flights-searchform']/div[1]/div/input"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(flyFrom));

        flyFrom.clear();
        flyFrom.sendKeys("New York, NY, United States");

        WebElement arriveAt = driver.findElement(By.xpath("//form[@id='wego-flights-searchform']/div[2]/div/input"));
        arriveAt.clear();
        arriveAt.sendKeys("Chicago, IL, United States");

        WebElement departDate = driver.findElement(By.xpath("//form[@id='wego-flights-searchform']/div[3]/div/input"));
        departDate.clear();
        departDate.sendKeys("24/02/2017");

        WebElement rtnDate = driver.findElement(By.xpath("//form[@id='wego-flights-searchform']/div[4]/div/input"));
        rtnDate.clear();
        rtnDate.sendKeys("27/02/2017");

        WebElement dropDown = driver.findElement(By.xpath("//*[@id='wg_adult']"));
        Select round = new Select(dropDown);
        round.selectByVisibleText("2");

        WebElement searchBtn = driver.findElement(By.cssSelector("#search-button"));
        searchBtn.click();
        Thread.sleep(3000);
        //user has to switch the tab
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");

    }

   @Test(priority = 2, enabled=false)
    public void bookTours(){
       System.out.println("-----------------------------------------------------------");
       System.out.println("Current URL: "+driver.getCurrentUrl());

       String parentWindow = driver.getWindowHandle();
       Set<String> windowHandles = driver.getWindowHandles();
       Iterator<String> handles = windowHandles.iterator();
       for(;handles.hasNext();){
           String currentWindow =handles.next();
           //switch to parent window
           if(currentWindow.equalsIgnoreCase(parentWindow)){
               System.out.println("Switched to parent window");
               Assert.assertTrue(driver.getCurrentUrl().equals("http://phptravels.net/en"));


               driver.findElement(By.xpath("html/body/div[3]/div[3]/div/ul/li[4]/a")).click();
               WebElement tourLoc = driver.findElement(By.className("select2-chosen"));
               WebElement checkIn = driver.findElement(By.name("date"));
               WebElement dropAdult = driver.findElement(By.id("adults"));
               WebElement dropTourType = driver.findElement(By.id("tourtype"));
               WebElement searchBtn = driver.findElement(By.xpath("html/body/div[3]/div[4]/div/div/div[4]/div/form/div[5]/div/button"));

               tourLoc.sendKeys("London, United Kingdom");
               checkIn.clear();
               checkIn.sendKeys("13/02/2017");
               Select dropdown = new Select(dropAdult);

               dropdown.selectByValue("1");

               Select tourType = new Select(dropTourType);
               tourType.selectByValue("197");
               searchBtn.click();

           }
          // if (childWindow.compareToIgnoreCase(parentWindow) !=0){
            //   System.out.println("Main Url "+driver.getCurrentUrl());

              // driver.switchTo().window(childWindow);
               //System.out.println("Child Url "+driver.getCurrentUrl());

//               driver.switchTo().window(parentWindow);
//               Assert.assertTrue(driver.getCurrentUrl().contains("http://phptravels.net/"));


           }
       }
    }
