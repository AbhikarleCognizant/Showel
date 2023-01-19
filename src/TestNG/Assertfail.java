package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertfail {
@Test
public void g1() {
	Reporter.log("running g1",true);
	Assert.fail();//intentionally fail
	System.out.println("how are you");
}
@Test
public void G2() {
	Reporter.log("running the test case",true);
}
}
