package Package_Vishwas;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TextBox
{
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://demoqa.com/text-box"); 	    	        	    
  }
  
  @Test
  public void f() 
  {
	  WebElement FullNameField = driver.findElement(By.id("userName"));
      FullNameField.sendKeys("Vishwas Iyengar");
      WebElement EmailField = driver.findElement(By.id("userEmail"));
      EmailField.sendKeys("vishwassv1995@gmail.com");
      WebElement CurrentAddressField = driver.findElement(By.id("currentAddress"));
      CurrentAddressField.sendKeys("abc");
      WebElement PermanentAddressField = driver.findElement(By.id("permanentAddress"));
      PermanentAddressField.sendKeys("abc");
      WebElement submitButton = driver.findElement(By.id("submit"));
      submitButton.click(); 
  }

  @AfterMethod
  public void tearDown() 
  {
      driver.quit();
  }
}
