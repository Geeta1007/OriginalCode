package InterviewPerspectiveSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> checkBoxs = driver.findElements(By.xpath("//label/input[@type='checkbox']"));
		for (WebElement checkBox : checkBoxs) {
			checkBox.click();
		}
		
	}

}
