package Alert_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hiddendivision_element2 {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\abhij\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver f=new EdgeDriver();
	f.get("https://chercher.tech/java/pop-ups-selenium-webdriver");
	f.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	f.findElement(By.xpath("//a[@class='closesubscribe']")).click();
	
}
}
