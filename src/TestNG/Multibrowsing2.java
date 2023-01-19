package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowsing2 {
@Parameters("browsername")
@Test
public void TC(String browsername) {
	WebDriver driver=null;
	if(browsername.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browsername.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhij\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browsername.equals("Edge")){
		System.setProperty("webdriver.edge.driver", "C:\\Users\\abhij\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		
	}
	driver.get("https://www.facebook.com/");
}
}
