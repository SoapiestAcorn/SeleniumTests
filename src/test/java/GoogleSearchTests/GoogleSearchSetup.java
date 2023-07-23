package GoogleSearchTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class GoogleSearchSetup {
    public static WebDriver driver;

    @BeforeSuite
    public static void setup() {
        // Setup WebDriver - will run before every class in the suite
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AlexYoung\\OneDrive - PQA\\Documents\\Browser Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public static void teardown() {
        // Close WebDriver
            driver.quit();
        }
    }
