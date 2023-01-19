package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_equals {
@Test
public void v1() {
	Reporter.log("running test case v1",true);
	String expcT="hello";
	String actT="hello";
	//using assert class method
	Assert.assertEquals(expcT, actT);
}
}
