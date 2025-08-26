package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Q5 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
	  Alert jsalert = driver.switchTo().alert();
	  jsalert.accept();
	  Thread.sleep(5000);
	  String disp = driver.findElement(By.id("result")).getText();
	  assertEquals("You successfully clicked an alert",disp);
	  System.out.println("Message verified");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }



}
