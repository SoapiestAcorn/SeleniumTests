package googleSearchTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static googleSearchTests.GoogleSearchSetup.driver;

public class GoogleSearchTests {

    @Test(priority = 1)
    public void testGoogleSearchForAmazon() {

        // Go to Google.ca
        driver.get("https://www.google.ca");
        Reporter.log("Google.ca opened");

        // Enter Amazon in search box
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Amazon");
        searchBox.submit();
        Reporter.log("Amazon searched");

        // Click on Amazon link
        WebElement amazonLink = driver.findElement(By.className("LC20lb"));
        amazonLink.click();
        Reporter.log("Amazon link clicked");

        //Expected Result: User should be on amazon.ca
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("amazon.ca"), "Failed - User is not on amazon.ca");
        Reporter.log("Passed - User is on amazon.ca");

    }

    @Test(priority = 2)
    public void testGoogleSearchForFacebook() {

        // Go to Google.ca
        driver.get("https://www.google.ca");

        // Enter Facebook in search box
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Facebook");
        searchBox.submit();

        // Click on Facebook link
        WebElement facebookLink = driver.findElement(By.className("LC20lb"));
        facebookLink.click();

        // Expected Result: User should be on facebook.com
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("facebook.com"), "Failed - User is not on facebook.com");

    }

}
