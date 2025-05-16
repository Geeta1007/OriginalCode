package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(2000);
//		List<WebElement> options = driver.findElements(By.className("ui-menu-item"));
		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));
//		System.out.print(options);
		
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("India"))
					{
				option.click();
				break;
					}
		}
		
		
		
	}

}
