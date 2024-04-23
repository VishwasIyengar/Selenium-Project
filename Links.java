package Package_Vishwas;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Links 
{
	WebDriver driver;
	
    @BeforeMethod
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");
    }
    
    @Test
    public void testLinkAutomation() {
        // Open demoqa.com
        driver.get("https://demoqa.com/links");
        
        WebElement homeLink = driver.findElement(By.xpath("//a[text()='Home']"));
        WebElement dynamicLink = driver.findElement(By.xpath("//a[text()='Dynamic Link']"));
        
        homeLink.click();
        
        driver.navigate().back();
        
        dynamicLink.click();
               
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() 
    {       
        driver.quit();
    }
}
