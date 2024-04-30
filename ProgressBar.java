package Package_Vishwas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProgressBar {
    WebDriver driver;

    @BeforeClass
    public void setUp() 
    {
        // Set up WebDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testProgressBar() {
        // Open www.demoqa.com
        driver.get("https://demoqa.com/progress-bar");

        // Find the Progress Bar element
        WebElement progressBar = driver.findElement(By.id("progressBar"));

        // Get the initial width of the Progress Bar
        String initialWidth = progressBar.getCssValue("width");

        // Trigger an action that causes the Progress Bar to progress
        // For example, clicking a button
        WebElement startButton = driver.findElement(By.id("startStopButton"));
        startButton.click();

        // Wait for the Progress Bar to progress
        // For simplicity, you can use Thread.sleep(), but using explicit waits is recommended
        try {
            Thread.sleep(5000); // Wait for 5 seconds (adjust as needed)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the final width of the Progress Bar
        String finalWidth = progressBar.getCssValue("width");

        // Verify that the Progress Bar has progressed
        assert !initialWidth.equals(finalWidth) : "Progress Bar did not progress";
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}