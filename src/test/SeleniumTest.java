package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeleniumTest {
    WebDriver driver;

    @Test
    public void journey()  {
        driver.get("http://a.testaddressbook.com");

        // Add your first name and last name to the strings below

        // Use these variables to populate the fields below

        String username = "user@example.com";
        String password = "password";
        String firstName = "";
        String lastName = "";
        String streetAddress = "123 Main";
        String secondaryAddress = "Apt 1";
        String city = "Somewhere";
        String state = "TX";
        String zipCode = "78700";
        String fileLocation = "lib/smiley.gif";
        String birthday = "01/01/1980";
        String age = "38";
        String website = "http://example.com";
        String phone = "5128675309";
        String note = "This person is nice.";

        // Navigate to Sign In Page

        // Submit Sign In Form

        // Navigate to Address List Page

        // Navigate to New Address Page

        // Fill Out New Address Form & Submit

            // First Name, Last Name, Street Address, Secondary Address & City

            // State (use Select class)

            // Zip Code, Country, Birthday, Age, Website

            // Upload File

            // Phone, Interest, Note

            // Submit Form

        // This gets the ID from URL to be used later

        String id = getID();

        // Navigate to Edit Address Page

        // Edit the First Name with newName and Submit

        String newName = "Jack";

        // Navigate to Address List Page

        // Get list of Destroy Link elements

        // Iterate over the list to click the one matching the id we found above

        // Accept Alert

        // Wait for link to go away

    }

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "lib/drivers/chromedriver");

        ChromeOptions chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);
    }

    @After
    public void teardown() {
        driver.quit();
    }

    private String getID() {
        String url = driver.getCurrentUrl();
        String pattern = "\\d+$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(url);
        m.find();
        try {
            return m.group(0);
        } catch(Exception e) {
            return null;
        }
    }
}