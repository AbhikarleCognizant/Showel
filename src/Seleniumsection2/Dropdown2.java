package Seleniumsection2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver o=new ChromeDriver();
	o.navigate().to("https://www.justmarriage.in/");
	WebElement profile = o.findElement(By.xpath("//select[@id='familist']"));
	Select s=new Select(profile);
	s.selectByValue("Son");
}
}
