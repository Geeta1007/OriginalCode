package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWaysBrowser {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Hello");
		
		//Refresh command
//		driver.navigate().refresh();
		
		//Get current URL
//		driver.get(driver.getCurrentUrl());
		
		//JavaScriptExecutor
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("history.go(0)"); //history.go(0), location.reload()
		
		//Robot class
		Robot robot = new Robot();		
		//when fn lock is disabled
//		robot.keyPress(KeyEvent.VK_5);
//		robot.keyRelease(KeyEvent.VK_5);
		
		//when fn lock is enabled
		 robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_R);
         robot.keyRelease(KeyEvent.VK_R);
         robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		
		
	}

}
