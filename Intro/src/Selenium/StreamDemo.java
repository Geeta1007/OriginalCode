package Selenium;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//		click on column----------------------------
		driver.findElement(By.xpath("//tr/th[1]")).click();
//		driver.findElement(By.xpath("//tr/th[1]")).click();

//		capture all webelements into a list------------------------
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		
//		capture text of all webelement into new(original) list-----------------------------
		List<String> originalList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		
//		sort on the original list and store in sorted list--------------------------------
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
//		compare original vs sorted list-------------------------------------------
		Assert.assertTrue(originalList.equals(sortedList));
	
//		scan the name column with gettext "beans" and print the price of it-----------------(here s is referring list)
		List<String> reqItemPrice = list.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		System.out.println(reqItemPrice);
		reqItemPrice.forEach(q->System.out.println(q));
		
//		using pagination concept--------------------------------------------------------------------
		List<String> ItemPrice;
		do
		{
			List<WebElement> listOne = driver.findElements(By.xpath("//tr/td[1]"));
			ItemPrice = listOne.stream().filter(s->s.getText().contains("Tomato")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			ItemPrice.forEach(q->System.out.println(q));
			if(ItemPrice.size()<1)
			{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
			}while(ItemPrice.size()<1);
	
	
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String Price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return Price;
		
	}

}
