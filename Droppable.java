package Package_Vishwas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Droppable 
{
	WebDriver driver;
	Actions actions;

	@Test
	@BeforeClass
	public void setUp() 
	{   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Selenium3\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    	actions = new Actions(driver);
	}
	
	@Test
	public void TestDroppable()
	{
		driver.get("https://demoqa.com/droppable");
        
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
       
        actions.dragAndDrop(draggable, droppable).build().perform();
        
        String droppableText = droppable.getText();
        assert droppableText.equals("Dropped!");
	}

    @AfterClass
    public void tearDown() 
    {       
        driver.quit();
	}
}
