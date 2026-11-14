import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class e2e {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        selectValue(driver, wait, By.id("ctl00_mainContent_ddl_originStation1"), "DEL");

        By destinationSelect = By.id("ctl00_mainContent_ddl_destinationStation1");
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(
                destinationSelect, By.cssSelector("option[value='MAA']")));
        selectValue(driver, wait, destinationSelect, "MAA");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("ctl00_mainContent_view_date1"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#ui-datepicker-div td[data-handler='selectDay'] a"))).click();


        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

        {


            System.out.println("its disabled");

            Assert.assertTrue(true);


        }

        else

        {

            Assert.assertTrue(false);

        }

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();


        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000L);

        for(int i=1;i<5;i++)

        {

            driver.findElement(By.id("hrefIncAdt")).click();

        }


        driver.findElement(By.id("btnclosepaxoption")).click();

        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("ctl00_mainContent_btn_FindFlights"))).click();

// driver.findElement(By.xpath("//input[@value='Search']")).click();

// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
    }

    private static void selectValue(WebDriver driver, WebDriverWait wait, By locator, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "const select = arguments[0];" +
                        "const value = arguments[1];" +
                        "if (![...select.options].some(option => option.value === value)) {" +
                        "  throw new Error('Option not found: ' + value);" +
                        "}" +
                        "select.value = value;" +
                        "select.dispatchEvent(new Event('input', { bubbles: true }));" +
                        "select.dispatchEvent(new Event('change', { bubbles: true }));",
                wait.until(ExpectedConditions.presenceOfElementLocated(locator)), value);
    }
}
