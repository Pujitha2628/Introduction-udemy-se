import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    driver.findElement(By.xpath("//input[contains(@id,'input')]")).sendKeys("hello");
    driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("welcome");
    driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

     driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();

        driver.findElement(By.xpath("(//h1[text()='Rahul Shetty Academy'])[1]")).getText();
        Assert.assertEquals(driver.findElement(By.xpath("(//h1[text()='Rahul Shetty Academy'])[1]")).getText(),"Rahul Shetty Academy");
//
//       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("okokok");
//        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("honey");
//        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
//       driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("qwert");
//       driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("7847787878");
//
//       driver.findElement(By.cssSelector(".reset-pwd-btn")).click();






//        driver.get("https://github.com/login ");
//        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("abc123");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pujitha");
//
//        //driver.findElement(By.name("password")).sendKeys("Pujitha");
//
//        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
//        System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
//        //driver.findElement(By.linkText("password_reset")).click();-doubt-not finding elem
//        driver.findElement(By.xpath("//a[@href='/password_reset']")).click();
    }
}
