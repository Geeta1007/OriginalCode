package Selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Potato", "Walnuts", "Cashews"};
//		String[] itemsNeeded = {"Brocolli", "Walnuts"};

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(3000);
//		System.out.println(itemsNeeded.length);
		int j=0;
		for(int i=0;i<=products.size();i++)
		{
			String name = products.get(i).getText().split("-")[0].trim();
//			Thread.sleep(1000);
			List<String> veggies = Arrays.asList(itemsNeeded); 
			
			
			if(veggies.contains(name))
			{
				j++;
//				Thread.sleep(1000);
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); //do not go with text based path, need to add more waiting time
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click(); 
//				Thread.sleep(3000);

				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
		
	}

}
