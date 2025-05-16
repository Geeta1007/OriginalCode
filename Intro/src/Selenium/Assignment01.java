package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
		
//-----------------------------------fellow code-----------------------------------------	
//		/ Navigate to the URL
//        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//
//        // Locate the first checkbox
//        WebElement firstCheckbox = driver.findElement(By.id("checkBoxOption1"));
//
//
//        // Check the checkbox
//        firstCheckbox.click();
//        System.out.println("First checkbox checked: " + firstCheckbox.isSelected());
//
//
//        // Uncheck the checkbox
//        firstCheckbox.click();
//        System.out.println("First checkbox unchecked: " + !firstCheckbox.isSelected());
//
//        // Get the count of checkboxes on the page
//        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        System.out.println("Total number of checkboxes: " + checkboxes.size());
//		
	}

}
