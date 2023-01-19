package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {
@BeforeClass
public void openbrowser() {
	Reporter.log("open the browser",true);
}
@BeforeMethod
public void logintoapp(){
	Reporter.log("log in the app",true);
}
@Test
public void verifytext() {
	Reporter.log("running actual test case",true);
}
@AfterMethod
public void logoutApp() {
	Reporter.log("Logout from the app");
}
@AfterClass
public void closebrowser() {
	Reporter.log("close browser",true);
}
}
