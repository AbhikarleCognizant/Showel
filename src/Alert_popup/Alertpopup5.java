package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alertpopup5 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\abhij\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver d=new EdgeDriver();
	d.get("http://omayo.blogspot.com/");
	d.findElement(By.xpath("//input[@id='prompt']")).click();
	Alert l=d.switchTo().alert();
	//l.accept();
	//l.dismiss();
	//String text = l.getText();
	//System.out.println(text);
	l.accept();
	
}
}
