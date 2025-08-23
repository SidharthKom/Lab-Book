package Webdriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.time.Duration;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qn_13
{
	login_pageobjects obj;

	WebDriver driver;
	 String projectpath=System.getProperty("user.dir")  ;
  @Test(dataProvider = "dp")
  public void Test(String username, String password) throws InterruptedException, IOException, ParserConfigurationException, SAXException {

	  
	  String title=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("The Title is:"+title);
		Thread.sleep(3000);
		
		Qn_13_PO obj = new Qn_13_PO(driver);
		obj.enterusername(username);
		obj.enterpassword(password);
		obj.clickonlogin();
		
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() throws IOException {
	  
	 return new Object[][]
			 {
		 new Object[] {"Admin", "admin123"},
		 new Object[] {"aaaaa", "aaaaaa"}
			 };
    
    }
}