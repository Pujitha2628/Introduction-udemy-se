import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get(" https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();    //back to rahulshetty
        driver.navigate().forward();    //forward to google
    }
}
