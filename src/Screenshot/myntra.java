package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class myntra {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver y=new ChromeDriver();
	y.get("https://www.myntra.com/");
	TakesScreenshot ts=(TakesScreenshot)y;
	File desk = ts.getScreenshotAs(OutputType.FILE);
	File src=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\myntra.jpg");
	Files.copy(desk, src);
	
}
}
