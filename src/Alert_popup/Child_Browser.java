package Alert_popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver l=new ChromeDriver();
	l.get("https://www.flipkart.com/");
	l.manage().window().maximize();
	//click on cancel button
	l.findElement(By.xpath("//button[text()='✕']")).click();
	//search any mobile
	l.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles under 20000",Keys.ENTER);
	l.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//click on 1st phone
	l.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	//switch the control
	Set<String> allwindows = l.getWindowHandles();
	//create object of arraylist
	ArrayList<String> al=new ArrayList<String>(allwindows);
	//print main window id
	String mainid = al.get(0);
	System.out.println(mainid);
	//switch to child window
	l.switchTo().window(al.get(1));
	//print session id
	String cwind = al.get(1);
	System.out.println(cwind);
	String title = l.getTitle();
	System.out.println(title);
	
}
}
