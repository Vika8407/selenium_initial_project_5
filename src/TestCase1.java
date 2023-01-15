import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCase1 {
    public static void main(String[] args) {
         /*
         Test Case 1: Validate Automation Exercise site logoGiven user
         navigates to “https://automationexercise.com/”
         Then user should see logo on top-left
          */

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Waiter.pause(2);

        WebElement logo = driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[1]/div/a/img"));

        if (logo.isDisplayed()) System.out.println("Logo location to the left validation is PASSED");
        else System.out.println("Logo location to the left validation is FAILED");



        Driver.quitDriver();
    }
}
