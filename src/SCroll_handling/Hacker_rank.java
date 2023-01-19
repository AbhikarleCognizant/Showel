package SCroll_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hacker_rank {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver .get("https://www.hackerrank.com/products/main/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,3000);");
	Thread.sleep(4000);
	j.executeScript("window.scrollBy(0,-1000);");
}
}
