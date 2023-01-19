package page_factorytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
@FindBy(xpath ="//input[@id='email']")private WebElement email;
@FindBy(xpath ="//input[@id='password']")private WebElement pwd;
@FindBy(xpath = "//button[@class='_6dgzsvq css-1af0gyj']")private WebElement loginbtn;
public Loginpage2(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void Enterun(String emailid) {
	email.sendKeys(emailid);
}
public void Enterpwd(String passward) {
	pwd.sendKeys(passward);
}
public void clickloginbtn() {
	loginbtn.click();
}

}
