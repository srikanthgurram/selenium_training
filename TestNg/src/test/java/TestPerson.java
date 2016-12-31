import org.testng.annotations.*;

/**
 * Created by srikanth on 31/12/16.
 */
public class TestPerson {
//    @BeforeTest
//    @AfterTest
//    @BeforeGroups
//    @AfterGroups

    Person p;
    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before Class");
        p = new Person("name",10,10);
        System.out.println("object P is created");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method is called");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is called");
    }

    @Test(priority = 1,enabled = true)
    public void VerifyPerson() {
        p.name = "obama";
        p.age = 44;
        p.weight = 88.5;
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.weight);
    }

    @Test(priority = 2, enabled = false)
    public void VerifyPerson2() {
        p.name = "bush";
        p.age = 88;
        p.weight = 98.5;
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.weight);
    }

    @Test(priority = 0)
    public void VerifyPerson3() {
        p.name = "clinton";
        p.age = 77;
        p.weight = 60.5;
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(p.weight);
    }
}
