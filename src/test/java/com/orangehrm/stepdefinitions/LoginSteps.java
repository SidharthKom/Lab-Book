package com.orangehrm.stepdefinitions;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import pac1.login_pageobjects;
 
public class LoginSteps {
	WebDriver driver;
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   	    
	    WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		    
	}
 
	@Given("Navigate to the URL")
	public void navigate_to_the_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}
 
	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
	}
 
	@When("Click on login Button")
	public void click_on_login_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
		
	}
 
	@Then("Login should be successful")
	public void login_should_be_successful() {
		String title=driver.getTitle();
		System.out.println("The Title is:"+title);
		if(title.equalsIgnoreCase("OrangeHRM"))
		{
			System.out.println("Login Suucessfull");
		}
		else
		{
			System.out.println("Login unSuucessfull");
		}
	}
	@Then("verify dashboard")
	public void verify_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
 
}