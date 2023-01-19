package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver p=new ChromeDriver();
	p.get("https://nxtgenaiacademy.com/alertandpopup/");
	p.findElement(By.xpath("//button[@name='alertbox']")).click();
	Alert alt = p.switchTo().alert();
	//alt.accept();
	String text = alt.getText();
	System.out.println(text);
}
}
