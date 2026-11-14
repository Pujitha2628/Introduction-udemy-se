import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import javax.swing.*;

public class MouseActions {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
       Actions a= new Actions(driver);

       a.moveToElement(driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        a.moveToElement(driver.findElement(By.cssSelector("div[id='nav-link-accountList']"))).build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("div[id='nav-link-accountList']"))).contextClick().build().perform();

    }



}
