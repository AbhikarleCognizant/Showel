package page_factorytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
@FindBy(xpath = "//td[text()='Enter Time-Track']")private WebElement text;
public Homepage1(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public String VerifyText() {
	String acTtext=text.getText();
	return acTtext;
}

}
