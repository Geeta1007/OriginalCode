package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname)
	{
		System.out.println("WebLoginHome..day3");
	}
	
	@Test(timeOut=4000)
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome...day3");
	}
	@AfterClass
	public void afclass()
	{
		System.out.println("I am after class in day3...day3");
	}
	@BeforeSuite
	public void bfsuite() {
		System.out.println("I am suite and I will be the no.1..day3");
	}
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("I am beforemethod in day...day3");
	}
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("I am before class in day3...day3");
	}
	
	@Test(groups={"smoke"})
	public void MobileSignInHomeLoan()
	{
		System.out.println("Mobile SignIn Home...day3");
	}
	
	@Test(dependsOnMethods={"WebLoginHomeLoan","MobileSignInHomeLoan"})
	public void MobileSignOutHomeLoan()
	{
		System.out.println("Mobile SignOut Home...day3");
	}
	
	@Test(enabled=false)
	public void APILoginHomeLoan()
	{
		System.out.println("APILoginHome...day3");
	}
}
