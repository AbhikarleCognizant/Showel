package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhij\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver k=new ChromeDriver();
	k.get("https://jqueryui.com/resources/demos/droppable/default.html");
	//xpath of element 1
	WebElement ele1 = k.findElement(By.xpath("//div[@id='draggable']"));
	//xpath of element 2
	WebElement ele2 = k.findElement(By.xpath("//div[@id='droppable']"));
	//create object of action class
	Actions act=new Actions(k);
	//perform drag and drop method
	act.dragAndDrop(ele1, ele2).perform();
	
}
}
