package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://nxtgenaiacademy.com/alertandpopup/");
	h.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
	Alert alt = h.switchTo().alert();
	//alt.accept();
	String text = alt.getText();
	System.out.println(text);
}
}
