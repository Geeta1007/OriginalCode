package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href*='nested']")).click();
		System.out.println(driver.findElements(By.tagName("frame")).size());
//		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
//		Alternate for above one-------------------------------
		driver.switchTo().frame("frame-top");
//		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
//		Alternate for above one-------------------------------
		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
		
		
	}

}
