import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExecution {
    @Test(priority = 2)
    public void addNumbersTest(){
        Demo demoObj = new Demo();
        Assert.assertEquals(demoObj.addNumberrs(2,3),5);
    }

    @Test(priority = 1)
    public void addStringsTest(){
        Demo demoObj = new Demo();
        Assert.assertEquals(demoObj.addStrings("Hello","World"), "Hello World");
    }

    @Test
    public void getArrayTest(){
        Demo demoObj = new Demo();
        int[] expectedArray = {1,2,3};
        Assert.assertEquals(demoObj.getArray(),expectedArray);
    }
}
