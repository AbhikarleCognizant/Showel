package page_factorytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage2 {
@FindBy(xpath = "(//h3[@class='rc-GlobalFooter_column_header lohp-rebrand'])[3]")private WebElement text;
public Homepage2(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public String verifytext() {
	String acttext=text.getText();
	return acttext;
}
}
