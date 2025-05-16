package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstoreWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://instore.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='header__secondary-links']/div[@class='header__icon-list']/a[2]")).click();
		driver.findElement(By.id("customer[email]")).sendKeys("geethuvolley@gmail.com");
		driver.findElement(By.id("customer[password]")).sendKeys("9942160180");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='page-header--small']")).getText());
		List<WebElement> orders = driver.findElements(By.className("account__order-table-item"));
		System.out.println(orders.size());
		
		driver.findElement(By.linkText("Addresses")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='account__address-details']")).getText());
		
		
	}

}
