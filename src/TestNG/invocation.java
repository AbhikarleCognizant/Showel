package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocation {
@Test(invocationCount = 8)
public void TC1() {
	Reporter.log("this is test1",true);
}
}
