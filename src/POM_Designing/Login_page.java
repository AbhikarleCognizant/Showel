package POM_Designing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
@FindBy(xpath="//input[@id='username']")private WebElement un;
@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
public Login_page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//getters and setters
public void enterUn(){
	un.sendKeys("admin");
}
public void enterPwd() {
	pwd.sendKeys("manager");
}
public void clickLoginbtn() {
	loginBtn.click();
}

}
