package DataProvider;


import org.testng.annotations.Test;

public class TestLogin {

	@Test(dataProvider = "loginData", dataProviderClass= LoginData.class)
	public void testLoginWithBrowser(String username, String password, String browser) {
	    System.out.println("User: " + username + " | Browser: " + browser);
}
}