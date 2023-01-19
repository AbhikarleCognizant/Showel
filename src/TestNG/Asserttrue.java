package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserttrue {
@Test
public void m1() {
	Reporter.log("This is true method of Assert class",true);
	Boolean acTresult=true;
	Assert.assertTrue(acTresult);
}
}
