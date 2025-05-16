package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.className("blinkingText")).click();
		Set<String> window = driver.getWindowHandles(); //-------------now it has knowledge of parentID and childID
		Iterator<String> it =window.iterator();  // used to move from one tab to another
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		String EmailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].split("with")[0].trim();
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(EmailID);

	
		
	}

}
