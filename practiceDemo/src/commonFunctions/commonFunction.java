package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonFunction {

	public WebDriver driver=null;
	public static Properties properties;

	public Properties loadProperty() throws IOException {

		FileInputStream fis = new FileInputStream("load.properties");
		properties = new Properties();
		properties.load(fis);
		return properties;
	}

	@BeforeSuite
	public WebDriver launchBrowser() throws IOException {
		loadProperty();
		String browserName = properties.getProperty("browser");
		String url = properties.getProperty("url");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	@AfterSuite
	public void tearDown() {
//		driver.quit();
	}

}
