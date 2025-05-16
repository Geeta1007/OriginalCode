package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL", "number"})
	@Test
	public void WebLoginCarLoan(String urlname, String num)
	{
		System.out.println("WebLoginCar...day4");
		System.out.println(urlname);
		System.out.println(num);

	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCar...day4");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void afmethod()
	{
		System.out.println("I am aftermethod in day4...day4");
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("I am after class in day4...day4");
	}
	@AfterTest
	public void lateExecute()
	{
		System.out.println("I will execute last and I am After test...day4");
	}
	
	@Test(groups= {"smoke"})
	public void APILoginCarLoan()
	{
		System.out.println("APILoginCar...day4");
	}
	
	@AfterSuite
	public void afsuite()
	{
		System.out.println("I am suite and I will be the last...day4");
	}
}
