package Package_Vishwas;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Buttons 
{
	WebDriver driver;
    @BeforeMethod
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
    }
    
    @Test
    public void testButtonAutomation() {
        // Open demoqa.com
        driver.get("https://demoqa.com/buttons");

        // Find buttons by their XPath
        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        WebElement rightClickButton = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double Click Me']"));

        // Perform button interactions
        clickButton.click();
        rightClickButton.click(); // Note: Right-click emulation may not work on all browsers by default
        doubleClickButton.click(); // Note: Double-click emulation may not work on all browsers by default

        // Wait for a moment to observe the actions (optional)
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        
        driver.quit();
    }
}
