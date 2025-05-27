package seleniumGrid;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleDemoGrid {

	@Test
	public void openPageGoogle() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("chrome");
//		caps.setPlatform(Platform.WIN8);
//		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		
		// that URI should be from "Started Selenium Hub 4.31.0 (revision 4ae8fc9f8a): http://192.168.31.248:4444" from cmd
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.31.248:4444").toURL(), caps); 
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("q")).sendKeys("Gmail");
		driver.close();
		
	}
}

