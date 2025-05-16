package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,580)");

		System.out.println(driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println(driver.findElements(By.cssSelector(".table-display th")).size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(1)")).getText());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(2)")).getText());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3) td:nth-child(3)")).getText());

//		WebElement table=driver.findElement(By.id("product"));
//		System.out.println(table.findElements(By.tagName("tr")).size());
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//		List<WebElement> secondrow=driver.findElement(By.id("product")).findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//		System.out.println(secondrow.get(0).getText());
//		System.out.println(secondrow.get(1).getText());
//		System.out.println(secondrow.get(2).getText());
		
//		---------------------------------fellow code-------------------------------------------------------------------------------------------------
		
//		List<WebElement> tableData = driver.findElements(By.cssSelector("table[name='courses'] td"));
//		int dataRowNumber = 2;
//		int totalRows = driver.findElements(By.cssSelector("table[name='courses'] tr")).size();
//		System.out.println(totalRows);
//		int columns = driver.findElements(By.cssSelector("table[name='courses'] th")).size();
//		System.out.println(columns);
//		int start = dataRowNumber * columns;
//		for (int i = start; i < start + columns; i++) 
//		{
//			System.out.println(tableData.get(i).getText());
//		}

}
}


