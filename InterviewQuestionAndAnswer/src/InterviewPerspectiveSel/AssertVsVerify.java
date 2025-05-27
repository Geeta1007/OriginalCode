package InterviewPerspectiveSel;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVsVerify {

	@Test
	public void assertTest() {
		//Hard assertion
		System.out.println("Before Hard assertion");
		Assert.fail(); //Assert.assertEquals(false, true); 
		System.out.println("After Hard assertion");
	}
	
	@Test
	public void verifyTest() {
		//Soft assertion
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Before soft assertion");
		softAssert.fail();
		System.out.println("After soft assertion");
	}

}
