package SCroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursera {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.coursera.org/");
	JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,3000);");
	Thread.sleep(4000);
	jse.executeScript("window.scrollBy(0,-1000);");
}
}
