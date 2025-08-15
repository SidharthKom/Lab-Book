package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.cssSelector("a.login")).click();
		driver.findElement(By.name("email_create")).sendKeys("at@gmail.com");
		driver.findElement(By.name("email_create")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Sidharth");
		driver.findElement(By.id("customer_lastname")).sendKeys("K");
		driver.findElement(By.name("passwd")).sendKeys("chakaboga");
		driver.findElement(By.name("newsletter")).click();
		
		
		WebElement dropdays = driver.findElement(By.cssSelector("select#days"));
		Select selday = new Select(dropdays);
		selday.selectByVisibleText("2 ");
		WebElement dropmonth = driver.findElement(By.cssSelector("select#months"));
		Select selmon = new Select(dropmonth);
		selmon.selectByVisibleText("May ");
		WebElement dropyear = driver.findElement(By.cssSelector("select#years"));
		Select selyear = new Select(dropyear);
		selyear.selectByVisibleText("2002 ");
		driver.findElement(By.name("submitAccount")).click();
		

		
	}

}
