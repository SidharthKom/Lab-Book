package Webdriver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.time.Duration;
public class Lab4Test_qn8 {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeMethod
public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @AfterMethod
public void tearDown() {
    driver.quit();
  }
  @Test
  public void lab4() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://tutorialsninja.com/demo/index.php?");
    driver.manage().window().setSize(new Dimension(1552, 832));
    Assert.assertEquals(driver.getTitle(), "Your Store");
    System.out.println("The Title Your Store is verified");
    driver.findElement(By.linkText("Desktops")).click();
    driver.findElement(By.linkText("Mac (1)")).click();
    Assert.assertEquals(driver.getTitle(), "Mac");
    System.out.println("Title 'Mac' is verified");
    //driver.findElement(By.linkText("   -Mac (1)")).click();
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
   
   
    driver.findElement(By.name("search")).click();
    driver.findElement(By.name("search")).sendKeys("Monitors");
    driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
    driver.findElement(By.id("input-search")).click();
    driver.findElement(By.id("input-search")).clear();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
    driver.findElement(By.id("button-search")).click();
  }
}
