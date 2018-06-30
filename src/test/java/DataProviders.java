import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

    public class DataProviders {

        @BeforeMethod
        public void beforeMethod(){
            System.out.println("Before Method");
        }

        @DataProvider(name="inputs")
        public Object[][] getData() {
            return new Object[][] {
                    {"bmw", "m3"},
                    {"audi", "a6"},
                    {"benz", "c300"}
            };
        }

        @Test(dataProvider="inputs")
        public void testMethod1(String input1, String input2) {
            System.out.println("Input 1: " + input1);
            System.out.println("Input 2: " + input2);
        }

}
