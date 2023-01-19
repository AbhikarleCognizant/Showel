package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
@Test
public void TC1() {
	Reporter.log("this is test case1",true);
}
@Test
public void TC2() {
	Reporter.log("this is test case2",true);
	Assert.fail();
}
@Test
public void TC3() {
	Reporter.log("this is test case3");
	Assert.fail();
}
}
