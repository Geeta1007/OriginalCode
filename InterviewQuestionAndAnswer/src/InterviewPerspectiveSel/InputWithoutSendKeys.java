package InterviewPerspectiveSel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendKeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));

//		Using javasccriptExecutor--------------------------------------------
		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("document.getElementsByName('q')[0].value='Bangalore'", "");
//		executor.executeScript("arguments[0].value='Chennai'", searchBox);

//		using robot----------------------------------------------------------
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);

	}

}
