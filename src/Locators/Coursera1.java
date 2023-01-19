package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coursera1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver h=new ChromeDriver();
	h.get("https://www.coursera.org/learn/python-data");
	String text = h.findElement(By.xpath("//span[text()='Data Structure']")).getText();
	System.out.println(text);
}
}
