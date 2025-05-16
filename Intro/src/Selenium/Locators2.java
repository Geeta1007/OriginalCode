package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "Geeta";
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		String password = getpassword(driver);
//		Locators2 L = new Locators2();
//		String password = L.getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("input#chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
//		System.out.println(driver.findElement(By.cssSelector("p")).getText());
//		System.out.println(driver.findElement(By.xpath("//p")).getText());
		Assert.assertEquals((driver.findElement(By.cssSelector("p")).getText()), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class=login-container] h2")).getText());
		Assert.assertEquals((driver.findElement(By.cssSelector("div[class=login-container] h2")).getText()), "Hello "+ name +",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn')][2]")).click();
		String message = driver.findElement(By.xpath("//form/p")).getText();
		String[] word1 = message.split("'");
		String pass = word1[1].split("'")[0];
		return pass;	
	}
	
}
