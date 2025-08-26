package Questions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Q4 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.cssSelector("select.form-select")).click();
	  Select opt = new Select(driver.findElement(By.cssSelector("select.form-select")));
	  opt.selectByVisibleText("Two");
	  Thread.sleep(3000);
	  String option = opt.getFirstSelectedOption().getText();
	  assertEquals("Two", option);
	  System.out.println("Selected option verified");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver= new ChromeDriver();
	  driver.get("https://www.selenium.dev/selenium/web/web-form.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


 
}
