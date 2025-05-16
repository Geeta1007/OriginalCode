package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@Parameters({"number"})
	@Test(groups= {"smoke"})
	public void testOne(String num)
	{
		System.out.println("Hello..day1");
		System.out.println(num);
	}
	@Parameters({"number"})
	@Test
	public void testTwo(String num)
	{
		System.out.println("Welcome...day1");
		System.out.println(num);
	}
	@Test(dataProvider="getData")
	public void testThree(String username, String password)
	{
		System.out.println("GoodDay...day1");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "FirstUsername";
		data[0][1] = "FirstPassword";
		data[1][0] = "SecondUsername";
		data[1][1] = "SecondPassword";
		data[2][0] = "ThirdUsername";
		data[2][1] = "ThirdPassword";
		return data;
	}
	
	
	
	
	
	
	
	
	
	
}
