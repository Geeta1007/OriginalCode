package ParameterClassExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IncorrectPassword {

	
	@Test
	@Parameters({"username", "password"})
	public void IncorrectPasswordLogin(String uName, String pWord) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		
		WebElement username = driver.findElement(By.id("userEmail"));
		WebElement password = driver.findElement(By.id("userPassword"));
		WebElement login  = driver.findElement(By.id("login"));
		
		username.sendKeys(uName);
		password.sendKeys(pWord);
		login.click();
		
	}

}
