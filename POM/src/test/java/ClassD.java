import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nani on 2/20/2017.
 */
public class ClassD {
    @Test
    public void test1FromClassD(){
        Assert.assertTrue(false);
    }

    @Test
    public void test2FromClassD(){
        Assert.assertTrue(false);
    }

    @Test
    public void test3FromClassD(){
        Assert.assertTrue(true);
    }
    @Test
    public void test4FromClassD(){
        Assert.assertTrue(true);
    }
}
