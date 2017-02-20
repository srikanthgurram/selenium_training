import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by nani on 2/20/2017.
 */


public class ClassA
{
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "driver_path"})
    public void setup(String browserName, String driverPath){
        System.out.println("-----------------------------------------");
        System.out.println("Browser Name: "+browserName);
        System.out.println("Driver path: "+driverPath);
        System.out.println("-----------------------------------------");

        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nani\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();

        }else if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\nani\\Downloads\\gekodriver.exe");
            driver = new FirefoxDriver();

        }else if(browserName.equalsIgnoreCase("ie")){
            System.setProperty("webdriver.internetExplorer.driver", "C:\\Users\\nani\\Downloads\\iedriver.exe");
            driver = new InternetExplorerDriver();
        }


        //driver.manage().window().maximize();
//        driver.get(baseUrl);


    }

    @Test
    public void test1FromClassA(){
        Assert.assertTrue(true);
    }

    @Test
    public void test2FromClassA(){
        Assert.assertTrue(true);
    }

    @Test
    public void test3FromClassA(){
        Assert.assertTrue(false);
    }
    @Test
    public void test4FromClassA(){
        Assert.assertTrue(false);
    }
}
