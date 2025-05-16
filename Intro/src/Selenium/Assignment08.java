package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment08 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("ind");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("autocomplete")).getDomProperty("value"));
		
	}

}
