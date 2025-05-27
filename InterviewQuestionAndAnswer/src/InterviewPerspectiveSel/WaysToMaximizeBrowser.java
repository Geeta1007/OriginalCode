package InterviewPerspectiveSel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaysToMaximizeBrowser {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub



//		using ChromeOptions----------------------------------------
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--start-maximized");
//		WebDriver driver = new ChromeDriver(options);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		using Maximize--------------------------------------------
//		driver.manage().window().maximize();
		
//		using SetSize dimension-------------------------------------------------
		Dimension dimension =new Dimension(1920, 1080);
		driver.manage().window().setSize(dimension);		

		
		
	}

}
