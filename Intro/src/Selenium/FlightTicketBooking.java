package Selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlightTicketBooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
//		Country selection----------------------------------------------------------------
		
		driver.findElement(By.id("autosuggest")).sendKeys("in");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.className("ui-menu-item"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;
			}
		}
		
//		Travel option selection--------------------------------------------------------------
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
//		From and To selection-------------------------------------------------------------------
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@value='COK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='CJB']")).click();
		
//		Date selection-----------------------------------------------------------------------------------
		
		driver.findElement(By.cssSelector(".ui-state-active")).click();
		
//		Passenger selection----------------------------------------------------------------------------------
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		for(int j=0; j<3; j++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Thread.sleep(1000);
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByIndex(3);
		
//		Selecting discount checkbox----------------------------------------------------------------------------------
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
//		Click on search button------------------------------------------------------------------------------------------
		
		driver.findElement(By.cssSelector("input[id*='FindFlights']")).click();
	}

}
