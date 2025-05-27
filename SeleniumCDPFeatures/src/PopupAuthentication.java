import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		Predicate<URI> URIPredicate = URI-> URI.getHost().contains("httpbin.org");
		((HasAuthentication)driver).register(URIPredicate, UsernameAndPassword.of("foo", "bar"));
		driver.get("http://httpbin.org/basic-auth/foo/bar");
		
//		we can use below one instead of above three lines // http://username:password@SiteURL
		
//		driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");
		
//		--------------------Another example-------------------------------------------------------------------
		
//		driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
	}

}
