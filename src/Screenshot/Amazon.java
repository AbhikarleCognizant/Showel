package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Amazon {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("https://www.amazon.in/");
	TakesScreenshot s=(TakesScreenshot)p;
	File des = s.getScreenshotAs(OutputType.FILE);
	File src=new File("C:\\Users\\abhij\\OneDrive\\Desktop\\mock\\amazon.jpg");
	Files.copy(des, src);
	
}
}
