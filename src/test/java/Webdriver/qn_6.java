package Webdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qn_6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.cssSelector("span.caret")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.name("email")).sendKeys("sidkom@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcdefg");
		driver.findElement(By.cssSelector("input.btn")).click();
		
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		
		WebElement show = driver.findElement(By.id("input-limit"));
		Select selshow = new Select(show);
		selshow.selectByVisibleText("25");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();
		
		driver.findElement(By.linkText("Specification")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[1]")).click();
		
		String mess = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText().trim();
		if(mess.contains("Success: You have added Apple Cinema 30\" to your wish list!")) {
			System.out.println("Message Verified! for Apple Cinema 30");
		}
		else
			System.out.println("verification failed");
		
		driver.findElement(By.name("search")).sendKeys("Mobile");
		driver.findElement(By.cssSelector("i.fa.fa-search")).click();
		
		driver.findElement(By.cssSelector("input#description")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[1]/a/img")).click();
		
		driver.findElement(By.name("quantity")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.name("quantity")).sendKeys("3");
		driver.findElement(By.cssSelector("button#button-cart.btn.btn-primary.btn-lg.btn-block")).click();
		
		String messa = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText().trim();
		if(messa.contains("Success: You have added HTC Touch HD to your shopping cart!")) {
			System.out.println("Message Verified! for HTC Touch HD");
		}
		else
			System.out.println("verification failed");
		
		driver.findElement(By.cssSelector("button.btn.btn-inverse.btn-block.btn-lg.dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
		String prod = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")).getText().trim();
		if(prod.contains(prod)) {
			System.out.println("Item Verified! for HTC Touch HD");
		}
		else
			System.out.println("verification failed");
		
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.cssSelector("span.caret")).click();
		driver.findElement(By.linkText("Logout")).click();
		String title = driver.getTitle();
		if(title.contains("Account Logout")) {
			System.out.println("Title Verified");
			
		}
		else
			System.out.println("Title Verification failed");
		
		driver.findElement(By.linkText("Continue")).click();
		
		
}
}


