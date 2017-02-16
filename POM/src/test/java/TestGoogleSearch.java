import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import steps.SearchSteps;

/**
 * Created by nani on 2/16/2017.
 */
public class TestGoogleSearch {
    WebDriver driver;

    @BeforeClass
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nani\\Downloads\\chromedriver.exe");
        //open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void verifySearchButton() {
        //make sure google page is opened
//        Assert.assertEquals(driver.getTitle(),"Google");
        SearchSteps steps = new SearchSteps(driver);
        steps.searchQuery("Hello");

    }

}
