package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Q8 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.linkText("Click Here")).click();
	  String window_1 = driver.getWindowHandle();
	  
	  Set<String> handles = driver.getWindowHandles();
	 
	  for(String handle : handles) {
		  if(!handle.equals(window_1)) {
			  driver.switchTo().window(handle);
			  String window_2 = driver.getTitle();
			  System.out.println(window_2);
			  break;
		  }
	  }
	  driver.switchTo().window(window_1);
	  String windoww_1 = driver.getTitle();
	  System.out.println(windoww_1);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/windows");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
