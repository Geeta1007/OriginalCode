package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.className("paxinfo")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
//	int i =1;
//	while(i<6)
//	{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		i++;
//	}
	
	for(int j=1;j<6;j++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		driver.findElement(By.className("buttonN")).click();
	
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		
		//get the count of checkboxs present in the screen
		
		System.out.println(driver.findElements(By.cssSelector("input[id*='ctl00_mainContent_chk']")).size());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());	
	
	
	
	
	
	}
		
}
