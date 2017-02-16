package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nani on 2/16/2017.
 */
public class GoolgeHome {
    WebDriver driver;
    String baseUrl = "https://www.google.co.in";

    public GoolgeHome(WebDriver drv){
        this.driver = drv;
    }
    // Objects
    By gmailLink = By.linkText("Gmail");
    By searchBar = By.id("lst-ib");
    By searchButton = By.id("_fZl");

    //open gmail page
    public void visitGoogleHome(){
        driver.get(baseUrl);
    }
    //open gmail sign in page
    public void clickOnGmailLink(){
        driver.findElement(gmailLink).click();
    }

    //enter text in the search box
    public void setSearchTextBox(String text){
        driver.findElement(searchBar).clear();
        driver.findElement(searchBar).sendKeys(text);
    }

    // click search button after entrering the text
    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
    }
}
