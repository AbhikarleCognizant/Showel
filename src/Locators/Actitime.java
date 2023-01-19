package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter user name
	driver.findElement(By.id("username")).sendKeys("admin");
	//enter passward
	driver.findElement(By.name("pwd")).sendKeys("manager");
	//click on login btn
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	String expT="actiTIME - Login";
	String actT = driver.getTitle();
	System.out.println(actT);
	if(expT.equals(actT)) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is failed");
	}

}
}
