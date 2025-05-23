package FrameworkDesign.TestComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import FrameworkDesign.PageObjects.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingPage;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop = new Properties();
//		C:\Users\mahes\eclipse-workspace\SeleniumFrameworkDesign\src\main\java\FrameworkDesign\Resources\GlobalData.properties
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//main//java//FrameworkDesign//Resources//GlobalData.properties");
//		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String browserName = System.getProperty("browser")!=null ? System.getProperty("browser") : prop.getProperty("browser");
		
		//System.getProperty("browser") -- related with Jenkins
		 
		if(browserName.contains("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless"))
			{
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension (1400,900));
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

	public List<HashMap<String, String>> getJsonDataToMap(String FilePath) throws IOException
	{
//	  Read Json to string-----------------------------------------------
		String jsonContent = 	FileUtils.readFileToString(new File(FilePath), StandardCharsets.UTF_8);	
	  
//	  String to HashMap---Jackson databind---here data will have the map, map1 details-------------------------------------------------
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
	    });
		return data;
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";		
	
	}
	
	@BeforeMethod (alwaysRun=true) //to get rid of grouping concept and make it run irrespective of any condition declared in testNG xml 
	public LandingPage launchApplication() throws IOException 
	{
		driver = initializeDriver();
		landingPage = new LandingPage(driver);
		landingPage.goTo();
		return landingPage;
	}
	@AfterMethod (alwaysRun=true)
	public void tearDown()
	{
		driver.close();
	}
	
}
