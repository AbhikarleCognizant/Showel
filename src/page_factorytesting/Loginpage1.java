package page_factorytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
@FindBy(xpath = "//input[@id='username']")private WebElement un;
@FindBy(xpath = "//input[@name='pwd']")private WebElement pwd;
@FindBy(xpath = "//div[text()='Login ']")private WebElement loginbtn;
public Loginpage1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void Enterun(String username) {
	un.sendKeys(username);
}
public void Enterpwd(String passward) {
	pwd.sendKeys(passward);
}
public void clickloginbtn() {
	loginbtn.click();
}
}
