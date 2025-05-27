package InterviewPerspectiveSel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndDown {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();
		
//		using JavaScriptexecutor----------------------------
//		scroll to some position------------------------------------
		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("window.scroll(0,450)", "");
//		Thread.sleep(2000);
//		executor.executeScript("window.scroll(0,-450)", "");
		
//		scroll to bottom of the page--------------------------------------------
//		executor.executeScript("window.scroll(0, document.body.scrollHeight)", "");
//		Thread.sleep(2000);
//		executor.executeScript("window.scroll(0, 0)", "");
		
//		go to specific element position----------------------------------
//		WebElement link = driver.findElement(By.linkText("online tool"));
//		executor.executeScript("arguments[0].scrollIntoView(true);", link);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
	}

}
