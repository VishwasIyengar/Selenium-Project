package Package_Vishwas;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

	public class PracticeForm 
	{
		WebDriver driver;
		
	    @BeforeMethod
	    public void setUp() 
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://demoqa.com/automation-practice-form");
	    }
	    public void testPracticeFormAutomation() 
	    {
	    	driver.get("https://demoqa.com/automation-practice-form");

	    	driver.findElement(By.id("firstName")).sendKeys("John");
	    	driver.findElement(By.id("lastName")).sendKeys("Doe");
	    	driver.findElement(By.id("userEmail")).sendKeys("johndoe@example.com");
	    	driver.findElement(By.xpath("//label[text()='Male']")).click();
	    	driver.findElement(By.id("userNumber")).sendKeys("1234567890");
	    	driver.findElement(By.id("dateOfBirthInput")).sendKeys("01 Jan 1990");
	    	driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	    	driver.findElement(By.xpath("//label[text()='Sports']")).click();
	    	driver.findElement(By.id("currentAddress")).sendKeys("123 Main Street, Anytown, USA");

        
	    	driver.findElement(By.id("react-select-3-input")).sendKeys("NCR");
	    	driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);

        
	    	driver.findElement(By.id("react-select-4-input")).sendKeys("Delhi");
	    	driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);

        
	    	driver.findElement(By.id("submit")).click();

        	try 
        	{
        		Thread.sleep(3000);
        	}
        	catch (InterruptedException e)
        	{
        		e.printStackTrace();
        	}
	    }
	    @AfterClass
	    public void tearDown() 
	    {
	        driver.quit();
	    }
	}
