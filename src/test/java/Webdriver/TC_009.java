package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_009 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/window");
		
		Thread.sleep(5000);
		driver.findElement(By.id("home")).click();
		Thread.sleep(5000);
		String pwindow = driver.getWindowHandle();
		
		System.out.println("Parent window: "+ pwindow);
		
		System.out.println("url is: "+ driver.getCurrentUrl());
		
		driver.findElement(By.id("multi")).click();
		Set<String> mwindows = driver.getWindowHandles();
		for(String cwindow:mwindows)
		{
			driver.switchTo().window(cwindow);
			System.out.println("url is: "+ driver.getCurrentUrl());
		}
	}

}
