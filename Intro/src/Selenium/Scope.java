package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		Selecting footerdriver-------------------------------------------------------------------------
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
//		Selecting particular column in footerdriver-----------------------------------------
		
		WebElement footdriverColOne = driver.findElement(By.xpath("(//div//table//ul)[1]"));
		System.out.println(footdriverColOne.findElements(By.tagName("a")).size());
		
//		Another way of writing above code----------------------------------------------------------------
		
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
//		click on each link in the column and check if the pages are opening-----------------------------------------
		

		List<WebElement> count = coloumndriver.findElements(By.tagName("a"));
		Actions a = new Actions(driver);

		for (int i = 1; i < count.size(); i++) 
		{
			a.moveToElement(count.get(i)).keyDown(Keys.CONTROL).click().build().perform();
		}
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
//		for (int j=0; j<window.size();j++)
//		{
//			String childID = it.next();
//			System.out.println(driver.switchTo().window(childID).getTitle());
//			
//		}
		
//		-------------------OR-------------------------------
		
		while(it.hasNext())
		{
			System.out.println(driver.switchTo().window(it.next()).getTitle());
		}
		
		
		
		
		
		
		
	}
}
