package steps;

import org.openqa.selenium.WebDriver;
import pages.GoolgeHome;

/**
 * Created by nani on 2/16/2017.
 */
public class SearchSteps {
    WebDriver driver;
    GoolgeHome objHome;

    //constructor
    public SearchSteps(WebDriver driver){
        this.driver = driver;
        objHome = new GoolgeHome(driver);
    }

    public void searchQuery(String qTest){
        //open google
        objHome.visitGoogleHome();

        //enter text in the search box
        objHome.setSearchTextBox(qTest);

        //click on search button
        objHome.clickOnSearchButton();
    }
}
