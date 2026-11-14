import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dopdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(15000L); // Wait for 5 seconds to allow the page to load completely

//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[id='wrapper']"))));
//
//        WebElement originDropdown = driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_originStation1']"));
//        Select originSelect = new Select(originDropdown);
//        originSelect.selectByVisibleText("Bengaluru (BLR)");

       driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click(); //date selevtion
    }
}
