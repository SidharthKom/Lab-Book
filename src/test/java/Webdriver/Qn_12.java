package Webdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Qn_12 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties prob_1 = new Properties();
		FileInputStream fis_1 = new FileInputStream("C:\\Users\\geeta\\eclipse-workspace\\Selenium\\configuration\\config.properties");
		prob_1.load(fis_1);
		String url = prob_1.getProperty("url");
		String monitor = prob_1.getProperty("monitor");
		String mac = prob_1.getProperty("mac");
		String store = prob_1.getProperty("store");
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Assert.assertEquals(driver.getTitle(), store);
	    System.out.println("The Title Your Store is verified");
	    driver.findElement(By.linkText("Desktops")).click();
	    driver.findElement(By.linkText("Mac (1)")).click();
	    Assert.assertEquals(driver.getTitle(), mac);
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
	    driver.findElement(By.name("search")).sendKeys(monitor);
	    driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
	    driver.findElement(By.id("input-search")).click();
	    driver.findElement(By.id("input-search")).clear();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"description\"]")).click();
	    driver.findElement(By.id("button-search")).click();
	}

}
