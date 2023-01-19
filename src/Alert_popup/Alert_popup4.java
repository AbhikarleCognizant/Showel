package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://nxtgenaiacademy.com/alertandpopup/");
	o.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
	Alert alt = o.switchTo().alert();
	//alt.dismiss();
	String text = alt.getText();
	System.out.println(text);
	
}
}
