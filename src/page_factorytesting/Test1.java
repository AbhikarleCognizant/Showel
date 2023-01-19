package page_factorytesting;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	Sheet sh;
	WebDriver driver;
	Loginpage1 l;
	Homepage1 h;
	
	@BeforeClass
	public void OpenBrowser()throws Throwable{
		FileInputStream fis=new FileInputStream("C:\\Users\\abhij\\OneDrive\\Documents\\Actitime.xlsx");
		sh=WorkbookFactory.create(fis).getSheet("sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		//all objects we need to create
		l=new Loginpage1(driver);
		h=new Homepage1(driver);
	}
	@BeforeMethod
	public void openapp() {
		String username=sh.getRow(0).getCell(0).getStringCellValue();
		l.Enterun(username);
		String passward=sh.getRow(0).getCell(1).getStringCellValue();
		l.Enterpwd(passward);
		l.clickloginbtn();
	}
	@Test
	public void VerifyText() {
		Reporter.log("running the test case",true);
		String expTtext=sh.getRow(0).getCell(2).getStringCellValue();
		String acTtext=h.VerifyText();
		Assert.assertEquals(expTtext, acTtext);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from app",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close the browser",true);
	}
}
