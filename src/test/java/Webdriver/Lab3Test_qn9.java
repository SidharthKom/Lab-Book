package Webdriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
public class Lab3Test_qn9 {
	
  private WebDriver driver;
  JavascriptExecutor js;
  
  @Parameters("browser") 
@BeforeMethod
public void setUp(String browser) {
	if(browser.equalsIgnoreCase("chrome"))
  	{
	  System.out.println("This is Chrome test");
  	
  	WebDriverManager.chromedriver().setup();
  	driver = new ChromeDriver();
  	}
  	else if(browser.equalsIgnoreCase("edge"))
  	{
  		System.out.println("This is edge test");
	  	
	  	WebDriverManager.edgedriver().setup();
	  	driver = new EdgeDriver();
  	}
	driver.get("https://tutorialsninja.com/demo/index.php?");
  }
  
@AfterMethod
public void tearDown() {
    driver.quit();
  }
  @Test
  public void lab3() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.manage().window().setSize(new Dimension(1552, 832));
    driver.findElement(By.linkText("Desktops")).click();
    driver.findElement(By.linkText("Mac (1)")).click();
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".button-group > button:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".button-group > button:nth-child(1)")).click();
  }
}
