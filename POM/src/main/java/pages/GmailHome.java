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
/*
    Page Object Model
    Create Object Repository
 */
public class GmailHome {
    WebDriver driver;

    public GmailHome(WebDriver drv){
        this.driver = drv;
        PageFactory.initElements(driver, this);
    }

    /*
    //constructor

    // Create the Objects
    By singupLink = By.linkText("Create account");

    // Open Singup page
    public  void clickOnCreateAccountLink(){
        driver.findElement(singupLink).click();
    }

*/
    //Page Factory
    @FindBy(how = How.LINK_TEXT, using = "Create account")
    WebElement signUpLink;

    public  void clickOnCreateAccountLink(){
        signUpLink.click();
    }

}
