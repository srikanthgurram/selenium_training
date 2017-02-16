package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nani on 2/16/2017.
 */
public class GmailSignup {
    WebDriver driver;

    public GmailSignup(WebDriver drv){
        this.driver = drv;
    }
    // Objects
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");

    //Methods
    // fill the first name field
    public void setFirstName(String fName){
        driver.findElement(firstName).click();
        driver.findElement(firstName).sendKeys(fName);
    }

    //fill the last name field
    public void setLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }

}
