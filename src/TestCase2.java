import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {

        /*

      Test Case 2: Validate Automation Exercise site header itemsGiven user navigates to “https://automationexercise.com/”
      Then validate all below header items are displayed and enabled and their text is as below
      Home
      Products
      Cart
      Signup / Login
      Test Cases
      API Testing
      Video Tutorials
      Contact us
         */

        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Waiter.pause(2);

        List<WebElement> headers = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']"));

        String[] expectedText = {"Home", "Products", "Cart", "Signup / Login", "Test Cases", "API Testing", "Video Tutorials", "Contact us" };

        for (int i = 0; i < headers.size(); i++) {
            System.out.println(headers.get(i).getText().equals(expectedText[i]));
            System.out.println(headers.get(i).isDisplayed());
            System.out.println(headers.get(i).isEnabled());

        }

        Driver.quitDriver();


    }
}
