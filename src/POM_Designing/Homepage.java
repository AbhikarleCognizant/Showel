package POM_Designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(xpath ="//td[text()='Enter Time-Track']")private WebElement text;
public Homepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void verifytext() {
	String exptext = "Enter Time-Track";
	String acttext = text.getText();
	System.out.println(acttext);
	if(acttext.equals(exptext)) {
		System.out.println("TC is pass");
	}
	else {
		System.out.println("test case is fail");
	}
}
}
