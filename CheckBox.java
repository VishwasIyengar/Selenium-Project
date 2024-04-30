package Package_Vishwas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckBox {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testCheckBox() {
        // Open www.demoqa.com
        driver.get("https://demoqa.com/checkbox");

        // Locate checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]"));

        // Verify checkboxes are unchecked initially
        assertFalse(checkbox1.isSelected(), "Checkbox 1 should be unchecked initially");
        assertFalse(checkbox2.isSelected(), "Checkbox 2 should be unchecked initially");

        // Click on checkboxes
        checkbox1.click();
        checkbox2.click();

        // Verify checkboxes are checked after clicking
        assertTrue(checkbox1.isSelected(), "Checkbox 1 should be checked after clicking");
        assertTrue(checkbox2.isSelected(), "Checkbox 2 should be checked after clicking");

        // Click again to uncheck
        checkbox1.click();
        checkbox2.click();

        // Verify checkboxes are unchecked after clicking again
        assertFalse(checkbox1.isSelected(), "Checkbox 1 should be unchecked after clicking again");
        assertFalse(checkbox2.isSelected(), "Checkbox 2 should be unchecked after clicking again");
    }

    @AfterClass
    public void tearDown() 
    {
        // Close the browser
        driver.quit();
    }
}