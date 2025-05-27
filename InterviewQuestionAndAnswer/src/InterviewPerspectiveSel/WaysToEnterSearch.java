package InterviewPerspectiveSel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToEnterSearch {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		
//		using keys------------------------------------------------------------
//		searchBox.sendKeys("hello"+Keys.ENTER);
		
//		using \n----------------------------------------------------------
		searchBox.sendKeys("hello \n");
		
//		using submit-------------------------------------------------------------
//		searchBox.sendKeys("hello");
//		searchBox.submit();
				
//		using Robot----------------------------------------------------------------
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_H);
//		robot.keyRelease(KeyEvent.VK_H);
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
//		or--------------------------------
//		searchBox.sendKeys("hi");
		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
