package GoogleSearchTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSuiteSetup {
    private static WebDriver driver;

    @BeforeSuite
    public static void setup() {
        // Setup WebDriver - will run before every class in the suite
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex Young\\Documents\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public static void teardown() {
        // Close the WebDriver
        if (driver != null) {
            driver.quit();
        }
    }

}
