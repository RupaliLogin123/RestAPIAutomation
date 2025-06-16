package EX005;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfter {
    @BeforeTest
    public void test(){
        System.out.println("before test");
    }
    @Test
    public void test1(){
        System.out.println("Test");

    }
}
