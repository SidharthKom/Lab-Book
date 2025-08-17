package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T_008 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		Thread.sleep(3000);
		driver.findElement(By.id("accept")).click();
		Alert salert = driver.switchTo().alert();
		System.out.println("The Message: "+salert.getText());
		salert.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(3000);
		Alert calert = driver.switchTo().alert();
		System.out.println("Confirm alert: "+calert.getText());
		calert.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("prompt"));
		Alert palert = driver.switchTo().alert();
		System.out.println("Prompt Alert: "+palert.getText());
		palert.sendKeys("Hiii");
		Thread.sleep(3000);
		palert.accept();
	}
}
