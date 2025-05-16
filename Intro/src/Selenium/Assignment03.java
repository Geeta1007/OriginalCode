package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		To get rid of "change your password" pop up while executing-----------------------------------------------
		
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("password_manager_enabled", false);
		Map<String, Object> profile = new HashMap<String, Object>();
		profile.put("password_manager_leak_detection", false);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);
		
		
		WebDriver driver = new ChromeDriver(options);

//		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		First page - filling login details---------------------------------------------------------------------------------------------
		driver.findElement(By.cssSelector("#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
//		Second page selecting items-----------------------------------------------------------------------------------------------------
		WebElement staticDropdown = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.className("btn-info")).click();
//		Alternate for above one----------------------------------------------------
//		driver.findElement(By.xpath("//app-card[2]//div[1]//div[2]//button[1]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']")));
		String[] reqItems = { "Samsung Note 8", "iphone X" };
		getItems(driver, reqItems);
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
//		Third page --placing order---------------------------------------------------------------------------------------------------------
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.cssSelector("#country")).sendKeys("Chennai");
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='checkbox2']")));
//		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Close']")));
//		driver.findElement(By.xpath("//button[text()='Close']")).click();
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Purchase']")));
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText().split("×")[1]);
	}

	
	public static void getItems(WebDriver driver, String[] reqItems) 
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));
		for (int i = 0; i < products.size(); i++) 
		{
			String temp = products.get(i).getText().trim();
			List<String> itemList = Arrays.asList(reqItems);

			if (itemList.contains(temp)) 
			{
				j++;
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

				if (j == reqItems.length) 
				{
					break;
				}
			}
		}

	}
}


