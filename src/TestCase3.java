import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase3 {
    public static void main(String[] args) {

        /*
           Test Case 3: Validate Automation Exercise site SUBSCRIPTION formGiven user navigates to “https://automationexercise.com/”
   Then user should see heading2 as “SUBSCRIPTION”
   And user should see and email input box with “Your email address” placeholder
   And user should see arrow submit button
   And user should see “Get the most recent updates from our site and be updated your self...”
   text under the email input box

         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement heading2 = driver.findElement(By.cssSelector(".single-widget>h2"));
        if (heading2.isDisplayed()) System.out.println("Heading validation PASSED");
        else System.out.println("Heading validation is FAILED");

        WebElement email= driver.findElement(By.id("susbscribe_email"));
        if (email.isDisplayed()) System.out.println("Email validation is PASSED");
        else System.out.println("Email validation FAILED");


        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        if ( submitButton.isDisplayed()) System.out.println("Submit button validation PASSED");
        else System.out.println(" Submit button validation FAILED");

        WebElement text = driver.findElement(By.cssSelector(".searchform>p"));
        if ( text.isDisplayed()) System.out.println("Text validation PASSED");
        else System.out.println("Text validation FAILED");



        Driver.quitDriver();


}
}
