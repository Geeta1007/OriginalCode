package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String rdate = "10";
		String rmonth = "7";
		String ryear = "1994"; 
		String[] expectedList = {rmonth, rdate, ryear};
		
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='‹']")).click();
		driver.findElement(By.xpath("//button[text()='‹']")).click();
		driver.findElement(By.xpath("//button[text()='‹']")).click();
		driver.findElement(By.xpath("//button[text()='"+ryear+"']")).click();
		driver.findElement(By.xpath("(//abbr)[7]")).click();
//		-----------------------------------OR--------------------------------------------------
//		List<WebElement> elements = driver.findElements(By.cssSelector(".react-calendar__tile"));
//		elements.get(Integer.parseInt(rmonth) - 1).click();
//		----------------------------------------------------------------------------------------
		driver.findElement(By.xpath("//abbr[text()='"+rdate+"']")).click();
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for (int i=0; i<actualList.size(); i++)
		{
			System.out.println(actualList.get(i).getDomAttribute("value"));
			Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);		
			
		}
			
		
	}

}
