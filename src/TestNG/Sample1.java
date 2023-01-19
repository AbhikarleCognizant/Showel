package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
@Test
public void TC4() {
	Reporter.log("running test case 4",true);
}
@Test
public void TC5() {
	Reporter.log("running test case 5",true);
}
@Test
public void TC6() {
	Reporter.log("running test case 6",true);
}
}
