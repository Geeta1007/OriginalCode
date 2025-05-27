package ExcelDataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	
	@Test(dataProvider="driveTest")
	public void testCaseDrive(String greetings, String communication, int id)
	{
		System.out.println(greetings);
		System.out.println(communication);
		System.out.println(id);
	}
	
	
	@DataProvider(name="driveTest")
	public Object[][] getData()
	{
		Object[][] data = {{"Hello", "text", 10}, {"Welcome", "message", 20}, {"Bye", "call", 30}};
		return data;
	}
}
