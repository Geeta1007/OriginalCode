package Selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
		driver.findElement(By.cssSelector("[type='search']")).sendKeys("go");
		
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> reqList = veggies.stream().filter(veggie->veggie.getText().contains("go")).collect(Collectors.toList());
		
		Assert.assertEquals(veggies.size(), reqList.size());
		
		
	}

}
