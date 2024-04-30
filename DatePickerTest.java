package Package_Vishwas;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DatePickerTest 
{
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
    public void pickDate()
    {
        // Open www.demoqa.com
        driver.get("https://demoqa.com/date-picker");

        // Find date picker input field and click on it to open the calendar
        WebElement datePickerInput = driver.findElement(By.id("datePickerMonthYearInput"));
        datePickerInput.click();

        // Select desired date (e.g., April 26, 2024)
        WebElement desiredDateandTime = driver.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]"));
        desiredDateandTime.click();
    }

    @AfterClass
    public void tearDown() 
    {
        // Close the browser
        driver.quit();
    }
}
