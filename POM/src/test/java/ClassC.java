import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nani on 2/20/2017.
 */
public class ClassC {
    @Test
    public void test1FromClassC(){
        Assert.assertTrue(false);
    }

    @Test
    public void test2FromClassA(){
        Assert.assertTrue(false);
    }

    @Test
    public void test3FromClassA(){
        Assert.assertTrue(true);
    }
    @Test
    public void test4FromClassA(){
        Assert.assertTrue(true);
    }
}
