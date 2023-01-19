package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
@Test
public void TC1() {
	String S1="hi";
	String S2="hello";
	SoftAssert s=new SoftAssert();
	s.assertEquals(S1, S2);
	System.out.println("running the test after failling");
	s.assertAll();
	
}
}
