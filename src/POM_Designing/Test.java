package POM_Designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	//call first pom class
	Login_page l=new Login_page(d);
	l.enterUn();
	l.enterPwd();
	l.clickLoginbtn();
	//call second pom class
	Homepage h=new Homepage(d);
	h.verifytext();
}
}
