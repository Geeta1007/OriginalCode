package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	public void testThree()
	{
		System.out.println("Bye..day2");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first...day2");
	}
	
	
}
