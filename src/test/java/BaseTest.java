import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

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

}
