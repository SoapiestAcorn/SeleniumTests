package GoogleSearchTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static GoogleSearchTests.GoogleSearchSetup.driver;

public class GoogleAmazon {

    @Test(priority = 1)
    public void testGoogleAmazon() {
        // Go to Google.ca
        driver.get("https://www.google.ca");

        // Enter Google in search box
        WebElement searchBox = driver.findElement(By.className("gLFyf"));
        searchBox.sendKeys("Amazon");
        searchBox.submit();

        // Click on Amazon link
        WebElement amazonLink = driver.findElement(By.className("LC20lb"));
        amazonLink.click();

        //Expected Result: User should be on amazon.ca
        String expectedResult = driver.getCurrentUrl();
        Assert.assertTrue(expectedResult.contains("amazon.ca"), "Failed - User is not on amazon.ca");

    }
}
