package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\abhij\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver d=new EdgeDriver();
	d.get("https://www.flipkart.com/");
	d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	//WebElement plus = d.findElement(By.xpath("//a[@class='_21ljIi']"));
	//Actions act=new Actions(d);
	//act.moveToElement(plus).perform();
	WebElement target = d.findElement(By.xpath("(//div[@class='xtXmba'])[5]"));
	Actions act=new Actions(d);
	act.click(target).perform();
}
}
