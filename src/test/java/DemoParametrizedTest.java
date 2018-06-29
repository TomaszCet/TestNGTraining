import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParametrizedTest {

    @BeforeClass
    @Parameters({"browser","platform"})
    public void setUp( String browser, String platform){
        System.out.println("Setup");
        System.out.println("param 1: browser " + browser);
        System.out.println("param 2: platform " + platform);
    }

    @Test
    @Parameters({"browser"})
    public void method1(String  browser){
        System.out.println("browser " + browser);
    }
}
