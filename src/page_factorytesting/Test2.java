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

public class Test2 {
	Sheet sh;
	WebDriver driver;
	Loginpage2 l;
	Homepage2 h;
	
	
@BeforeClass
public void Openbrowser() throws Throwable {
	FileInputStream f=new FileInputStream("C:\\Users\\abhij\\OneDrive\\Documents\\Coursera.xlsx");
	sh=WorkbookFactory.create(f).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://in.coursera.org/?authMode=login");
	l=new Loginpage2(driver);
	h=new Homepage2(driver);
}
	@BeforeMethod
	public void Openapp() {
		String emailid=sh.getRow(0).getCell(0).getStringCellValue();
		l.Enterun(emailid);
		String passward=sh.getRow(0).getCell(1).getStringCellValue();
		l.Enterpwd(passward);
		l.clickloginbtn();
	}
	@Test
	public void verifytext() {
		Reporter.log("running the test case2",true);
		String exptext=sh.getRow(0).getCell(2).getStringCellValue();
		String acttext=h.verifytext();
		Assert.assertEquals(exptext, acttext);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("close the app",true);
	}
	@AfterClass
	public void closebrowser() {
		Reporter.log("close the browser",true);
	}
}
