package com.test.adv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by srikanth on 5/2/17.
 */
public class Alerts {
    String baseUrl = "http://www.globalsqa.com/demo-site/alertbox/#Simple%20Alert%20Box";
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
    public void verifyAlerts() throws InterruptedException {
        //Click on the button to display the alert
        WebElement section = driver.findElement(By.cssSelector("div.single_tab_div.resp-tab-content.resp-tab-content-active"));
        WebElement tryItBtn = section.findElement(By.tagName("button"));
        tryItBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(2000);
        // handle the alerts
        driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().accept();

    }
}
