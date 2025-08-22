package Webdriver;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC00CSV {
		WebDriver driver;
	 String projectpath=System.getProperty("user.dir");
	@Test(dataProvider = "dp")
	  public void f(String username, String password) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  TC00csvPO obj15 = new TC00csvPO(driver);
		  obj15.account_15(username,password);
		  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		  /* return new Object[][] {
	      new Object[] { "Admin", "admin123" },
	      new Object[] { "pooja", "admin123" },
	    */
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws IOException, CsvException {
	  String[][] data1 = new String[3][2];
//	    String projectpath_2 = System.getProperty("user.dir");
//	    File file_2 = new File(projectpath_2+"\\details.csv");
//	    FileInputStream fs_2 = new FileInputStream(file_2);
//	    XSSFWorkbook workbook_2 = new XSSFWorkbook(fs_2);
//	    XSSFSheet worksheet_2 = workbook_2.getSheetAt(0);
//	    int rowcount = worksheet_2.getPhysicalNumberOfRows();
//	    int colcount = 6;
//	    System.out.println("Rows:"+ rowcount);
	  String csvFile = "C:\\Users\\geeta\\eclipse-workspace\\Selenium\\details.csv";
	    CSVReader csvReader = new CSVReader(new FileReader(csvFile));
//	    DataFormatter formatter = new DataFormatter();
	    List<String[]> data = csvReader.readAll();
	    for(int i=0;i<data.size();i++) {
	    	data1[i][0] = data.get(i)[0];
	    	data1[i][1] = data.get(i)[1];
	    	
	    	}
	    return data1;
    
  }
}
