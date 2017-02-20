import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nani on 2/20/2017.
 */
public class ClassB {
    @Test
    public void test1FromClassB(){
        Assert.assertTrue(true);
    }

    @Test
    public void test2FromClassB(){
        Assert.assertTrue(true);
    }

    @Test
    public void test3FromClassB(){
        Assert.assertTrue(false);
    }
    @Test
    public void test4FromClassB(){
        Assert.assertTrue(false);
    }
}
