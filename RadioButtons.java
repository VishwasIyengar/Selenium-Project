package Package_Vishwas;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class RadioButtons 
{
	WebDriver driver;
    @BeforeMethod
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
    }
    
    @Test
    public void testRadioButtonAutomation() 
    {
        
        driver.get("https://demoqa.com/radio-button");
       
        WebElement yesRadioButton = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        WebElement impressiveRadioButton = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        
        yesRadioButton.click();
      
        try 
        {
            Thread.sleep(2000);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        impressiveRadioButton.click();
    }
    
    @AfterMethod
    public void tearDown() 
    {
        driver.quit();
    }
}
