import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Demo2Test extends BaseTest {

    @BeforeClass
    public void setUp(){
        System.out.println("Before Class 2");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("After Class 2");
    }

    @BeforeMethod
    public void beforeeveryMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterEveryMethod(){
        System.out.println("After Method");
    }

    @Test
    public void addNumbersTest(){
        Demo demoObj = new Demo();
        Assert.assertEquals(demoObj.addNumberrs(2,3),5);
    }

    @Test
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

    @Test
    public void addNumbersSoftAssertsTest(){
        SoftAssert sa = new SoftAssert();
        Demo demoObj = new Demo();
        sa.assertEquals(demoObj.addNumberrs(1,2),2);
        System.out.println("Po pierwszej asercji");
        sa.assertEquals(demoObj.addNumberrs(1,2),3);
        System.out.println("Po drgiej asercji");
//        nie wywali sie nawet gdy failuje coś
//        assertAll sprawdza czy wszystko ok
//        sa.assertAll();
    }
}
