package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcommerceCartEffOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		String[] itemsNeeded = { "Carrot", "Brocolli", "Walnuts", "Potato", "Cashews" };
		getItems(driver, itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@fdprocessedid='t1utn']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("India");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		
		
	}

	public static void getItems(WebDriver driver, String[] itemsNeeded) 
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) 
		{
			String name = products.get(i).getText().split("-")[0].trim();
			List<String> itemName = Arrays.asList(itemsNeeded);
			if (itemName.contains(name)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) 
				{
					break;
				}
			}
		}

	}
}
