package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Q7 {
	WebDriver driver;
  @Test
  public void f() {
	  List<WebElement> rows = driver.findElements(By.cssSelector("#table1 tbody tr"));
	  for(WebElement row:rows) {
		  List<WebElement> cells = row.findElements(By.tagName("td"));
		  String lastname = cells.get(0).getText();
		  String firstname = cells.get(1).getText();
		  System.out.println(firstname+" "+lastname);
		  
		  if(firstname.equalsIgnoreCase("Jason")) {
			  String email = cells.get(2).getText();
			  System.out.println("email: "+ email);
		  }
		  
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/tables");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }

}
