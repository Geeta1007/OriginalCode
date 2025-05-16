package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Geeta");
		driver.findElement(By.name("email")).sendKeys("gee1007@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("pass@123");
		driver.findElement(By.className("form-check-input")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']/option[2]")).click();
//		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
//		Select abc = new Select(dropdown);
//		abc.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[min='1000-01-01']")).sendKeys("10-07-1994");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text = driver.findElement(By.cssSelector(".alert-success")).getText();
		String[] text1 = text.split("×");
		String output = text1[1];
		System.out.println(output);
		
			
	}

}
