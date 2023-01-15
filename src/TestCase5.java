import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase5 {
    public static void main(String[] args) {
       /*
        Test Case 5: Validate Automation Exercise site Test Cases pageGiven user navigates to “https://automationexercise.com/”
        When user clicks on “Test Cases” header item
        Then validate user is navigated to “Test Cases” page successfully by it’s title and url
        Expected URL = https://automationexercise.com/test_cases
        Expected Title = Automation Practice Website for UI Testing - Test Cases

        */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        driver.findElement(By.xpath("((//ul/li)[5])"));
        if (driver.getCurrentUrl().equals("https://automationexercise.com/test_cases")) System.out.println(" URL validation PASSED");
        else System.out.println("URL validation is FAILED");

        if(driver.getTitle().equals("Automation Practice Website for UI Testing - Test Case") )System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        Driver.quitDriver();


    }
}
