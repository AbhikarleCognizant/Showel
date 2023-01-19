package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.get("https://demo.guru99.com/test/delete_customer.php");
	//enter customer id
	o.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
	//click on submit button
	o.findElement(By.xpath("//input[@name='submit']")).click();
	//first of all we need to switch the control of selenium from webpage to popup
	Alert alt = o.switchTo().alert();
	//click on ok button
	//alt.accept();
	//click on cancel button
	//alt.dismiss();
	//get text on alert
	String text = alt.getText();
	System.out.println(text);
	
}
}
