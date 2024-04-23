package Package_Vishwas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class RegistrationForm
	{
	    WebDriver driver;
	    @BeforeMethod
	    public void setUp() 
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
	    }
	    @Test
	    public void testRegistrationForm() 
	    {
	        WebElement firstNameInput = driver.findElement(By.id("firstName"));
	        firstNameInput.sendKeys("John");

	        WebElement lastNameInput = driver.findElement(By.id("lastName"));
	        lastNameInput.sendKeys("Doe");

	        WebElement phoneNumberInput = driver.findElement(By.id("phoneNumber"));
	        phoneNumberInput.sendKeys("9611075397");
	        
	        WebElement emailInput = driver.findElement(By.id("email"));
	        emailInput.sendKeys("vvishwas083@gmail.com");
	        
	        WebElement countryInput = driver.findElement(By.id("country"));
	        countryInput.sendKeys("India");
	        
	        WebElement cityInput = driver.findElement(By.id("city"));
	        cityInput.sendKeys("Bengaluru");

	        WebElement sendButton = driver.findElement(By.id("send"));
	        sendButton.click();
	    }	    

	    @AfterMethod
	    public void tearDown() 
	    {
	        driver.quit();
	    }
	}
