import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class InterviewThree {

    @BeforeMethod
    public void test(){
        System.out.println("This is before method");

    }
    @BeforeClass
    public void test1(){
        System.out.println("This is before class");

    }
    @BeforeTest
    public void test2(){
        System.out.println("This is before Test");

    }
}
