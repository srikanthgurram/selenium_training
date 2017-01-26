package net.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by srikanth on 26/1/17.
 */
public class HomePage {
    String baseUrl = "http://phptravels.net/";
    WebDriver driver;

    @BeforeClass
    public void testSetup(){
        System.setProperty("webdriver.chrome.driver", "/home/srikanth/Downloads/softwares/drivers/chromedriver");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test(priority = 0)
    public void verifyCountryButton(){
        String xpathExpression = "//div[@class='navbar-collapse collapse']/ul[2]/li[1]/a";
        WebElement countryLink = driver.findElement(By.xpath(xpathExpression));
        Assert.assertEquals(countryLink.getText(), "English");
        countryLink.click();
    }

    @Test(priority = 1)
    public void verifyCountrySelection(){
        //Select french from the dropdown
        String xpathExpression =
                "//div[@class='navbar-collapse collapse']/ul[2]/li[1]/ul/li[8]/a";
        WebElement countryLink = driver.findElement(By.xpath(xpathExpression));
        Assert.assertEquals(countryLink.getText(), "French");
        countryLink.click();
        Assert.assertEquals(driver.getCurrentUrl(), "http://phptravels.net/fr");
    }


}
