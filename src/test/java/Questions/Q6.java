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

public class Q6 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)")).click();
	  WebElement checkbox1 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
	  WebElement checkbox2 = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
	  if(checkbox1.isSelected()&& checkbox2.isSelected()) {
		  System.out.println("Both Checkboxes are ticked");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
