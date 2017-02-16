package steps;

import org.openqa.selenium.WebDriver;
import pages.GmailHome;
import pages.GmailSignup;
import pages.GoolgeHome;

/*
    * Step1: Go to Google.com (PAGE 1)
    * Step2: Click on GMAIL link (PAGE 2)
     * Step3: Click on 'Create Account' link in Gmail Sign in page
     * Step4: Fill the form (PAGE 3)
 */

public class SignupSteps {
    WebDriver driver;
    GoolgeHome objHome;
    GmailHome objGmailHome;
    GmailSignup objGmailSignUp;

    // constructor
    public SignupSteps(WebDriver driver){
        this.driver = driver;
        //get the instance of Google home page
        objHome = new GoolgeHome(driver);
        objGmailHome = new GmailHome(driver);
        objGmailSignUp = new GmailSignup(driver);
    }


    //Steps
    public void openGoogleSingUpPage(){
        // open google url
        objHome.visitGoogleHome();
        // click on gmail link
        objHome.clickOnGmailLink();
        // click on create account link
        objGmailHome.clickOnCreateAccountLink();
    }

    // fill up the sign up form
    public void fillSignUpForm(String firstName, String lastName) {
        //fill first name field
        objGmailSignUp.setFirstName(firstName);
        //fill last name field
        objGmailSignUp.setLastName(lastName);
    }

}
