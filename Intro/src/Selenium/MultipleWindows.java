package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
//		Switching window---------------------------------------------------------------------------------------
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		driver.get("https://rahulshettyacademy.com");
		String courseName = driver.findElement(By.xpath("//div[@class='upper-box']/h2/a")).getText();
		driver.switchTo().window(parentID);
		WebElement name = driver.findElement(By.cssSelector("[name ='name']"));
		name.sendKeys(courseName);
		
//		taking screenshot----------------------------------------------------------------------------
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\mahes\\Screenshot.png"));
		FileUtils.copyFile(file, new File("Screenshot1.png"));
		
//		get height and width-------------------------------------------------------------------------
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

		
//		driver.quit();
		
		
		
		
	}

}
