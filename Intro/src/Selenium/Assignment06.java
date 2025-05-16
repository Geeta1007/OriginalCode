package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		option selected in checkbox example--------------------------------------------------------------------
		
		driver.findElement(By.id("checkBoxOption3")).click();
		String name = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(name);
		
//		option selected in dropdown example-------------------------------------------------------------------------
		
		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		staticdropdown.click();		
		dropdown.selectByVisibleText(name);
		
//		option entered in switch to alert example------------------------------------------------------------------------
		
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(name))
		{
			System.out.println("got the alert message sucessfully");
		}
		else
		{
			System.out.println("Error");
		}
		driver.switchTo().alert().accept();

		
		
		
	}

}
