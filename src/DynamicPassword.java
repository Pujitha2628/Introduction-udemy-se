import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicPassword {

    public static void main(String[] args) throws InterruptedException {

        String name = "rahul";
        String password = "rahulshettyacademy";
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//*[@id='inputUsername']")).sendKeys(name);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath( "//*[text()='Sign In']")).click();

        Thread.sleep(2000);

        System.out.println(driver.findElement(By.tagName("p")).getText());

        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

        driver.findElement(By.xpath("//button[normalize-space()='Log Out']")).click();


    }

    public static String getPassword(WebDriver driver) {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
       driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
       driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        String passwordText =driver.findElement(By.cssSelector("form p")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.

        String[] passwordArray = passwordText.split("'");

// String[] passwordArray2 = passwordArray[1].split("'");

// passwordArray2[0]

        String password = passwordArray[1].split("'")[0];

        return password;

//0th index - Please use temporary password

//1st index - 'rahulshettyacademy' to Login.



//0th index - rahulshettyacademy

//1st index - to Login.


    }
}
