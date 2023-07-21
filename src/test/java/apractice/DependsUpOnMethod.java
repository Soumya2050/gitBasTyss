package apractice;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependsUpOnMethod {
	
	@Test
	public void dependsUpOnMethod1() {

		Reporter.log("dependsUpOnMethod1 hiii",true);
	}
	@Test
	public void dependsUpOnMethod2() {
		Assert.fail();
		Reporter.log("dependsUpOnMethod2 hiii",true);
		
	}
	
	@Test
	public void dependsUpOnMethod3() {
		Reporter.log("dependsUpOnMethod3 hiii",true);
	}
	@Test(dependsOnMethods = "dependsUpOnMethod2")
	public void dependsUpOnMethod4() {
		Reporter.log("dependsUpOnMethod4 hiii",true);
	}
}
