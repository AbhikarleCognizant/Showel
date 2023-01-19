package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertnot_equals {
@Test
public void h1() {
	Reporter.log("Hi,hello",true);
	String expT="Hi";
	String actT="Hello";
	Assert.assertNotEquals(expT, actT);
}
}
