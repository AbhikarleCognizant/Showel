package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	//implicit wait(global wait)
	o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//maximize the browser
	o.manage().window().maximize();
	//bydefault sel focus is on main webpage so we need to switch it
	// switch to 1st iframe
	o.switchTo().frame("packageListFrame");
	//for our confirmation takje any element on 1st frame and print it
	String t1 = o.findElement(By.xpath("//h2[text()='Packages']")).getText();
	System.out.println(t1);
	 //switch from 1st frame tom main webpage
	o.switchTo().defaultContent();
	 //now jump from main webpage to 2nd frame
	o.switchTo().frame("packageFrame");
	 //take any element and print it
	 String t2 = o.findElement(By.xpath("//span[text()='ActiveSession']")).getText();
	 System.out.println(t2);
	//aghain control goes to main webpage 
	 o.switchTo().defaultContent();
	//now we need to switch control towards 3rd frame
	 o.switchTo().frame("classFrame");
	//take one element and print it
	 String t3 = o.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
	 System.out.println(t3);
	
	
}
}
