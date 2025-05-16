package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		we need to manually import this package--(import static org.openqa.selenium.support.locators.RelativeLocator.*;)--------------------
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement editBox = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(editBox)).getText());
		WebElement passwordLabel = driver.findElement(By.xpath("//label[text()='Password']"));
		System.out.println(driver.findElement(with(By.tagName("input")).below(passwordLabel)).getText());
		
		WebElement dobBox = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
		driver.findElement(with(By.tagName("input")).below(dobBox)).click();
		
		WebElement IceCreamlabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(IceCreamlabel)).click();
		
		
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
		driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).click();
		
		
		
	}

}
