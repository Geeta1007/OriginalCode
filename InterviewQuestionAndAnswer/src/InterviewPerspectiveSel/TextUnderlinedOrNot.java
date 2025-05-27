package InterviewPerspectiveSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement text = driver.findElement(By.linkText("தமிழ்"));
		
		String beforeHovering = text.getCssValue("text-decoration");
		System.out.println(beforeHovering);
		
		Actions action = new Actions(driver);
		action.moveToElement(text).perform();
		
		String afterHovering = text.getCssValue("text-decoration");		
		System.out.println(afterHovering);
		
		
	}
}
