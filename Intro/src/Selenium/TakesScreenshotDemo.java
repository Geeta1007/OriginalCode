package Selenium;



import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(03));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		driver.switchTo().alert().accept();
		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C://Users//mahes//OneDrive//Documents//sample.jpg");

//		FileHandler.copy(sourceFile, destinationFile); 
		FileUtils.copyFile(sourceFile, destinationFile);
		
	
		
		
	}

}
