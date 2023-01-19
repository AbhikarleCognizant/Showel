package Paramitrization;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\abhij\\OneDrive\\Documents\\datasheet.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demo.actitime.com/login.do");
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	//enter un
	String un = sh.getRow(0).getCell(0).getStringCellValue();
	d.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	//enter pwd
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	d.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	//click on login btn
	d.findElement(By.xpath("//div[text()='Login ']")).click();
	
}
}
