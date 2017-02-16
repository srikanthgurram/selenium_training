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
public class GoolgeHome {
    WebDriver driver;
    public GoolgeHome(WebDriver drv){
        this.driver = drv;
        PageFactory.initElements(driver, this);
    }

    String baseUrl = "https://www.google.co.in";

    ///Objects in Page Factory
    @FindBy(how = How.LINK_TEXT, using = "Gmail")
    WebElement gmailLink;

    @FindBy(how = How.ID, using = "lst-ib")
    WebElement searchBar;

    @FindBy(how = How.ID, using = "_fZl")
    WebElement searchButton;

    /*


    // Objects in POM
    By gmailLink = By.linkText("Gmail");
    By searchBar = By.id("lst-ib");
    By searchButton = By.id("_fZl");

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

    */

    //open gmail page
    public void visitGoogleHome(){
        driver.get(baseUrl);
    }

    public void clickOnGmailLink(){
        gmailLink.click();
    }

    public void setSearchTextBox(String text){
        searchBar.clear();
        searchBar.sendKeys(text);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }
}
