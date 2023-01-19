package Alert_popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://www.amazon.in/");
	o.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("shoes under 3000",Keys.ENTER);
	o.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	o.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
	Set<String> allwindow = o.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(allwindow);
	String mainid = al.get(0);
	System.out.println(mainid);
	o.switchTo().window(al.get(1));
	String scid = al.get(1);
	System.out.println(scid);
	String title = o.getTitle();
	System.out.println(title);
}
}
