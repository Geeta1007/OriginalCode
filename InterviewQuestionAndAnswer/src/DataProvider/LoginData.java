package DataProvider;

import org.testng.annotations.DataProvider;

public class LoginData {

	@DataProvider
	public String[][] loginData() {
		return new String[][] {
	        {"admin", "admin123", "chrome"},
	        {"user", "user123", "firefox"},
	        {"guest", "guest123", "edge"}
	};
}
}
