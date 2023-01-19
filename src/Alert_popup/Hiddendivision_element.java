package Alert_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivision_element {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver i=new ChromeDriver();
	i.get("https://www.flipkart.com/");
	i.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
}
}
