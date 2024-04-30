package Package_Vishwas;
import java.util.Set;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BrowserWindowTest 
{
     WebDriver driver;

    @BeforeClass
    public void setUp() 
    {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
    }

    @Test
    public void testBrowserWindows() 
    {
        // Open www.demoqa.com
        driver.get("https://www.demoqa.com/browser-windows");

        // Click on New Tab button
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();

        // Switch to the new tab
        switchToNewWindow();

        // Verify the title of the new tab
        assert driver.getTitle().equals("ToolsQA");

        // Close the new tab
        driver.close();

        // Switch back to the original tab
        switchToOriginalWindow();

        // Click on New Window button
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        // Switch to the new window
        switchToNewWindow();

        // Verify the title of the new window
        assert driver.getTitle().equals("ToolsQA");

        // Close the new window
        driver.close();

        // Switch back to the original window
        switchToOriginalWindow();
    }

    private void switchToNewWindow() 
    {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) 
        {
            driver.switchTo().window(handle);
        }
    }

    private void switchToOriginalWindow() 
    {
        String originalHandle = driver.getWindowHandle();
        driver.close();
        driver.switchTo().window(originalHandle);
    }

    @AfterClass
    public void tearDown() 
    {
        // Close the browser
        driver.quit();
    }
}



