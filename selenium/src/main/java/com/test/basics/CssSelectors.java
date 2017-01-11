package com.test.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by srikanth on 11/1/17.
 */
public class CssSelectors {
    String baseUrl = "http://getbootstrap.com/examples/signin/";
    WebDriver driver;

    /**
     * step1: Open URL in chrome
     * step2: Enter Text in email, pwd
     * step3: select the checkbox
     * step4: click on Singin Button
     */

    @BeforeClass
    public void openBrowser(){
        // get the chromedriver instance
        System.setProperty("webdriver.chrome.driver",
                "/home/srikanth/Downloads/softwares/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @AfterClass
    public void quitBrowser(){
//        driver.quit();
    }

    @Test
    public void verifyLoginPage(){
        // enter text in email
        WebElement emailField = driver.findElement(
                By.cssSelector("input#inputEmail.form-control"));

        //enter text in pwd
        WebElement pwdField = driver.findElement(
                By.cssSelector("input#inputPassword.form-control"));

        // select the checkbox
        WebElement rememberCheckBox = driver.findElement(
                    By.cssSelector("div.checkbox input"));

        //click on the sign in button
        WebElement signInBtn = driver.findElement(
                By.cssSelector("button.btn.btn-lg.btn-primary.btn-block"));

        // actions
        emailField.sendKeys("user123@gmail.com");
        pwdField.sendKeys("Welcome123");
        rememberCheckBox.click();
        signInBtn.click();

    }
}
