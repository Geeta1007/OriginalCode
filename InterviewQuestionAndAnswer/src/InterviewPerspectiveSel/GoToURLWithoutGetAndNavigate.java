package InterviewPerspectiveSel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToURLWithoutGetAndNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location='https://www.google.com'");
	}

}
