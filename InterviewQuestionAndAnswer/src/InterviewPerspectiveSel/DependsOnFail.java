package InterviewPerspectiveSel;

import org.testng.annotations.Test;

public class DependsOnFail {

	@Test(timeOut = 2000)
	public void parentsPermission() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Permission given");
	}
	
	@Test(dependsOnMethods = "parentsPermission", alwaysRun = true)
	public void loveMarriage() {
		System.out.println("marriage happened");
	}
}
