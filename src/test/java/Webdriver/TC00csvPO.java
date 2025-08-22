package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC00csvPO {
	WebDriver driver;
	public TC00csvPO(WebDriver driver4) {
		this.driver= driver4;		
	}
	By uname = By.name("username");
	By pword = By.name("password");
	By sbmit = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public void account_15(String username, String password) {
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pword).sendKeys(password);
		driver.findElement(sbmit).click();
	}

}
