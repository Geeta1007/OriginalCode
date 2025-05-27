package InterviewPerspectiveSel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://google.com");
		
		driver.navigate().to("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Dhoni"+Keys.ENTER);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
