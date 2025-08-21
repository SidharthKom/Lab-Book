package Webdriver;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC0012_TestNG2_pagefactory {
	WebDriver driver;
	String projectpath = System.getProperty("user.dir");
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException, IOException {
		String title=driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("The Title is:"+title);
		Thread.sleep(5000);
		//Assert.assertEquals(title, "Amazon");
		ExtentReports extent = new ExtentReports();
		String reportpath = projectpath+"\\Augreport.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(reportpath);
		extent.attachReporter(spark);
		ExtentTest test =extent.createTest("Verify the Title of the page");
		
		if(title.equals("orangehrm")) {
			test.pass("title matched");
		}
		else
		{	test.fail("title not matched");
			
			File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String dest = projectpath+"\\screenshot1.png";
			File detfile = new File(dest);
			FileUtils.copyFile(scr, detfile);
			test.addScreenCaptureFromPath(dest);
		}
		extent.flush();
		Thread.sleep(3000);
		
		login_pageFactory obj = PageFactory.initElements(driver,login_pageFactory.class);
		obj.enterusername(username);
		obj.enterpassword(password);
		obj.clickonlogin();
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "sid", "admin123" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
