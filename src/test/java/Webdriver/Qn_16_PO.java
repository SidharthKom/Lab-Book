package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Qn_16_PO {
	WebDriver driver;
	
	public Qn_16_PO(WebDriver driver3) {
		this.driver = driver3;
	}
	
	@FindBy(css = "span.caret")//	By account = By.cssSelector("span.caret");
	WebElement account;

	@FindBy(linkText = "Register")
	WebElement register;//	By register = By.linkText("Register");

	@FindBy(name="firstname")//	By firstname_1 = By.name("firstname");
	WebElement firstname_1;
	
	@FindBy(name="lastname")//	By lastname_1 = By.name("lastname");
	WebElement lastname_1;
	
	@FindBy(name="email")//	By email_1 = By.name("email");
	WebElement email_1;
	
	@FindBy(name="telephone")//	By number_1 = By.name("telephone");
	WebElement number_1;
	
	@FindBy(name="password")//	By password_1 = By.name("password");	
	WebElement password_1;
	
	@FindBy(name="confirm")//	By confpass_1 = By.name("confirm");
	WebElement confpass_1;
	
	@FindBy(name="agree")//	By newlet = By.name("agree");
	WebElement newlet;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")//	By confirm = By.cssSelector("input.btn.btn-primary");
	WebElement confirm;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement sucess;
	
	
	public void accountreg() {
		account.click();//driver.findElement(account).click();
		register.click();//driver.findElement(register).click();
	}
	public void registeruser(String firstname, String lastname, String email, String phone, String password, String confpass ) {
		firstname_1.sendKeys(firstname);//driver.findElement(firstname_1).sendKeys(firstname);
		lastname_1.sendKeys(lastname);//driver.findElement(lastname_1).sendKeys(lastname);
		email_1.sendKeys(email);//driver.findElement(email_1).sendKeys(email);
		number_1.sendKeys(phone);//driver.findElement(number_1).sendKeys(String.valueOf(phone));
		password_1.sendKeys(password);//driver.findElement(password_1).sendKeys(password);
		confpass_1.sendKeys(confpass);//driver.findElement(confpass_1).sendKeys(confpass);
		newlet.click();//driver.findElement(newlet).click();
		confirm.click();//driver.findElement(confirm).click();
	}
	public void sucess()
	{
		String text = sucess.getText();
		Assert.assertEquals(text, "Your Account Has Been Created!");
		System.out.println("Account Created message Verified!");
	}

}
