import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Grupy {

    @BeforeTest
    public void setUp(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void cleanUp(){
        System.out.println("After Test");
    }

    @Test(groups = {"add"})
    public void addNumbersTest(){
        Demo demoObj = new Demo();
        Assert.assertEquals(demoObj.addNumberrs(2,3),5);
        System.out.println("addNumbers");
    }

    @Test(groups = {"add","get"})
    public void addStringsTest(){
        Demo demoObj = new Demo();
        Assert.assertEquals(demoObj.addStrings("Hello","World"), "Hello World");
        System.out.println("addStrings");

    }

    @Test(groups = {"get"})
    public void getArrayTest(){
        Demo demoObj = new Demo();
        int[] expectedArray = {1,2,3};
        Assert.assertEquals(demoObj.getArray(),expectedArray);
        System.out.println("getArray");

    }

}
