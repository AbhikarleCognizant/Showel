package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts {
@Test//1 main method
//test case
public void TC1() {
	Reporter.log("I ts my first program in Test ng",true);
}
@Test(timeOut = 60000)
public void TC2() {
	Reporter.log("it is my second program in TestNG",true);
}
}
