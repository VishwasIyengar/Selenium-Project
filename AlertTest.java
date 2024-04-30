package Package_Vishwas;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertTest {

     WebDriver driver;

    @BeforeTest
    public void setUp() 
    {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
    }
    @Test
    public void testAlerts() {
        // Open www.demoqa.com
        driver.get("https://www.demoqa.com/alerts");

        // Simple Alert
        WebElement simpleAlertButton = driver.findElement(By.id("alertButton"));
        simpleAlertButton.click();
        handleAlert();

        // Confirmation Alert
        WebElement confirmationAlertButton = driver.findElement(By.id("confirmButton"));
        confirmationAlertButton.click();
        handleAlert();

        // Prompt Alert
        WebElement promptAlertButton = driver.findElement(By.id("timerAlertButton"));
        promptAlertButton.click();
        handlePromptAlert("Vishwas Iyengar");

        // Verify prompt alert result
        WebElement promptResult = driver.findElement(By.id("promptConfirmation"));
        assert promptResult.getText().equals("You entered: Vishwas Iyengar");
    }

    private void handleAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    private void handlePromptAlert(String input) {
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(input);
        promptAlert.accept();
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
