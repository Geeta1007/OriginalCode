package Selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Geeta");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshetty");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000); // to make page stable
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Geeta");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9524404502");
		driver.findElement(By.xpath("//button[contains(@class,'btn')][2]")).click();
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Geeta");
		driver.findElement(By.cssSelector("input[type*='word']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.cssSelector("input#chkboxTwo")).click();
		driver.findElement(By.cssSelector(".submit")).click();
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
