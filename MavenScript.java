package Package_Vishwas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class MavenScript 
	{
	    WebDriver driver;
	    @BeforeMethod
	    public void setUp() 
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://demoqa.com/registration");
	    }
	    @Test
	    public void verifyTitle()
	    {
	    	String actualDriver = driver.getTitle();
	    	String expectedTitle = "Tools QA - Selenium Training";
	    	
	    	Assert.assertEquals(actualDriver, expectedTitle);
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
	    public void testCheckBoxAutomation() 
	    {	        
	        driver.get("https://demoqa.com/checkbox");
	     
	        WebElement checkBox = driver.findElement(By.xpath("//input[@id='tree-node']"));
	        
	        if (!checkBox.isSelected()) 
	        {	            
	            checkBox.click();
	        }
	    }
	    
	    public void testRadioButtonAutomation() 
	    {
	        // Open demoqa.com
	        driver.get("https://demoqa.com/radio-button");

	        // Find the radio button element by its XPath
	        WebElement yesRadioButton = driver.findElement(By.xpath("//label[@for='yesRadio']"));
	        WebElement impressiveRadioButton = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));

	        // Click the radio button to select it
	        yesRadioButton.click();

	        // Wait for a moment to observe the change (optional)
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

