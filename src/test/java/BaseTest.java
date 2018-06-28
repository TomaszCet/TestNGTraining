import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite
    public void method1(){
        System.out.println("Before Suite BaseTest Class");

    }

    @AfterSuite
    public void method2(){
        System.out.println("After Suite BaseTest Class");

    }

    @BeforeClass
    public void setUp(){
        System.out.println("Before BaseTest Class");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("After BaseTest Class");
    }

    @BeforeTest
    public void setUpTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void cleanUpTest(){
        System.out.println("After Test");
    }
}
