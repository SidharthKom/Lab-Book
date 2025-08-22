package Webdriver;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Qn_15 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String firstname, String lastname, String email, String phone, String password, String confpass) {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  Qn_15_PO obj_14 = new Qn_15_PO(driver);
	  obj_14.accountreg();
	  obj_14.registeruser(firstname, lastname, email, phone, password, confpass);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() throws IOException, CsvException {
	  String[][] data1 = new String[1][6];
//	    String projectpath_2 = System.getProperty("user.dir");
//	    File file_2 = new File(projectpath_2+"\\details.csv");
//	    FileInputStream fs_2 = new FileInputStream(file_2);
//	    XSSFWorkbook workbook_2 = new XSSFWorkbook(fs_2);
//	    XSSFSheet worksheet_2 = workbook_2.getSheetAt(0);
//	    int rowcount = worksheet_2.getPhysicalNumberOfRows();
//	    int colcount = 6;
//	    System.out.println("Rows:"+ rowcount);
	  String csvFile = "C:\\Users\\geeta\\eclipse-workspace\\Selenium\\Qn11_details.csv";
	    CSVReader csvReader = new CSVReader(new FileReader(csvFile));
//	    DataFormatter formatter = new DataFormatter();
	    List<String[]> data = csvReader.readAll();
	    for(int i=0;i<data.size();i++) {
	    	data1[i][0] = data.get(i)[0];
	    	data1[i][1] = data.get(i)[1];
	    	data1[i][2] = data.get(i)[2];
	    	data1[i][3] = data.get(i)[3];
	    	data1[i][4] = data.get(i)[4];
	    	data1[i][5] = data.get(i)[5];
	    	
	    	}
	    return data1;
  }
}
