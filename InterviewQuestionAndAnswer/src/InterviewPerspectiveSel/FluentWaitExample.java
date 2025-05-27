package InterviewPerspectiveSel;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.net/login");

		WebElement username = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.id("submitBTN"));
		username.sendKeys("user@phptravels.com");
		password.sendKeys("demouser");
		login.click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);

		WebElement profile = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(By.xpath("//span[normalize-space()='My Profile']"));
			}
		});
		profile.click();

	}

}
