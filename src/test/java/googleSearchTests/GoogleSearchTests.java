package googleSearchTests;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleSearchTests extends GoogleSearchSetup {

    @Test(priority = 1,
            description = "Validate that Google searching Amazon and clicking Amazon link should redirect user to amazon.ca ")

    public void testGoogleSearchForAmazon() {

        // Go to Google.ca
        driver.get("https://www.google.ca");
        test.log(Status.INFO, "Step 1: Go to google.ca");

        // Enter Amazon in search box
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Amazon");
        searchBox.submit();
        test.log(Status.INFO, "Step 2: Google search for Amazon");

        // Click on Amazon link
        WebElement amazonLink = driver.findElement(By.className("LC20lb"));
        amazonLink.click();
        test.log(Status.INFO, "Step 3: Click on Amazon link");

        //Expected Result: User should be on amazon.ca
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("amazon.ca"), "Failed - User is not on amazon.ca");
        test.log(Status.PASS, "Expected Result: User is on amazon.ca - PASS");
    }

    @Test(priority = 2)
    public void testGoogleSearchForFacebook() {

        driver.get("https://www.google.ca");
        test.log(Status.INFO, "Step 1: Go to google.ca");

        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Facebook");
        searchBox.submit();
        test.log(Status.INFO, "Step 2: Google search for Facebook");

        // Click on Facebook link
        WebElement facebookLink = driver.findElement(By.className("LC20lb"));
        facebookLink.click();
        test.log(Status.INFO, "Step 3: Click on Facebook link");

        // Expected Result: User should be on facebook.com
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("facebook.com"), "Failed - User is not on facebook.com");
        test.log(Status.PASS, "Expected Result: User is on facebook.com - PASS");
    }

}
