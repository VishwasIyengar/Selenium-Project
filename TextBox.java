package Package_Vishwas;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TextBox 
{
    WebDriver driver;
    @BeforeMethod
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
    }
    
    @Test
    public void testTextBoxAutomation() 
    {
        driver.get("https://demoqa.com/text-box");
        
        
        WebElement FullNameField = driver.findElement(By.id("userName"));
        WebElement EmailField = driver.findElement(By.id("userEmail"));
        WebElement CurrentAddressField = driver.findElement(By.id("currentAddress"));
        WebElement PermanentAddressField = driver.findElement(By.id("permanentAddress"));
        
        
        FullNameField.sendKeys("John Doe");
        EmailField.sendKeys("johndoe@example.com");
        CurrentAddressField.sendKeys("123 Main Street, Anytown, USA");
        PermanentAddressField.sendKeys("456 Elm Street, Othertown, USA");
    }
    @AfterMethod
    public void tearDown() 
    {
        driver.quit();
    }
}
	    
    

