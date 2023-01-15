import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestCase4 {
    public static void main(String[] args) {

        /*
        Test Case 4: Validate Automation Exercise site footerGiven user navigates to “https://automationexercise.com/”
    Then user should see “Copyright © 2021 All rights reserved” text in the footer
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement footer = driver.findElement(By.cssSelector("#footer > div.footer-bottom > div > div > p"));
        if (footer.isDisplayed()) System.out.println("Footer validation PASSED");
        else System.out.println("Footer validation is FAILED");

        Driver.quitDriver();
    }
}
