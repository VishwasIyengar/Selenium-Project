package Package_Vishwas;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test; 

public class PracticeForms
{
	WebDriver driver;
	
    @BeforeClass
    public void setUp() 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
    }
    
    @Test
    public void testPracticeFormAutomation() throws InterruptedException 
    {
    		    	
    	WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Doe");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("john.doe@example.com");

        WebElement genderRadioButton = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]"));
        genderRadioButton.click(); ///div[2]/div[1]/label//

        WebElement mobileNumberInput = driver.findElement(By.id("userNumber"));
        mobileNumberInput.sendKeys("1234567890");

        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirthInput.sendKeys("01 Jan 1990");
        
        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys("\n"); // Press Enter to select
        
        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
        try 
        {
        	hobbiesCheckbox.click();
        } 
        catch (Exception e) 
        {           
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].click();", hobbiesCheckbox);
        }
        
        
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("123 Street, City, Country");
        
        WebElement stateDropdown = driver.findElement(By.id("state"));
        stateDropdown.click(); // Assuming it's a custom dropdown that opens on click  
        WebElement ncrOption = driver.findElement(By.xpath("//div[@id='state']//div[text()='NCR']"));
        try 
        {
        	ncrOption.click();
        } 
        catch (Exception e) 
        {           
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ncrOption);
        }
        
        // Select City
        WebElement cityDropdown = driver.findElement(By.id("city"));
        cityDropdown.click(); // Assuming it's a custom dropdown that opens on click
        WebElement ncrOption1 = driver.findElement(By.xpath("//div[@id='city']//div[text()='Delhi']"));
        ncrOption1.click();
       
        WebElement submitInput = driver.findElement(By.id("submit"));
        submitInput.click();
        
        Thread.sleep(6000);
    }
    
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
}

