package JavaInterviewQuesAndAns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		String date = "10";
		String month = "7";
		String year = "1994";
		String[] expectedList = { month, date, year };
		driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='‹']")).click();
		driver.findElement(By.xpath("//button[text()='‹']")).click();
		driver.findElement(By.xpath("//button[text()='‹']")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElement(By.xpath("(//abbr)[7]")).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < actualList.size(); i++) {
			System.out.println(actualList.get(i).getDomAttribute("value"));
			Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);
		}
	}
}
