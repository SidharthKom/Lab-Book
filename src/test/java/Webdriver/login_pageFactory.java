package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_pageFactory {
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement uname;
	@FindBy(name="password")
	WebElement pword;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	//By uname =By.name("username");
	//By pword = By.name("password");
	//By loginbutton = By.xpath("//button[@type='submit']");
	
	public void enterusername(String username) {
		uname.sendKeys(username);
	}
	public void enterpassword(String password) {
		pword.sendKeys(password);
	}
	public void clickonlogin() {
		loginbutton.click();
	}

}
