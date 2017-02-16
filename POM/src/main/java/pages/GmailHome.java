package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nani on 2/16/2017.
 */
/*
    Page Object Model
    Create Object Repository
 */
public class GmailHome {
    WebDriver driver;

    //constructor
    public GmailHome(WebDriver drv){
        this.driver = drv;
    }

    // Create the Objects
    By singupLink = By.linkText("Create account");

    // Open Singup page
    public  void clickOnCreateAccountLink(){
        driver.findElement(singupLink).click();
    }

}
