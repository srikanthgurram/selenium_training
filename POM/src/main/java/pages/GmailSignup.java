package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nani on 2/16/2017.
 */
public class GmailSignup {
    WebDriver driver;
    public GmailSignup(WebDriver drv){
        this.driver = drv;
        PageFactory.initElements(driver, this);
    }

/*
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

    */

    // Page Factory
    @FindBy(how = How.ID, using = "FirstName")
    WebElement firstName;

    @FindBy(how = How.ID, using = "LastName")
    WebElement lastName;

    public void setFirstName(String fName){
        firstName.click();
        firstName.sendKeys(fName);
    }

    public void setLastName(String lName){
        lastName.sendKeys(lName);
    }


}
