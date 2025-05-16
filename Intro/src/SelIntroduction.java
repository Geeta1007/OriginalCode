import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/mahes/OneDrive/Desktop/Geetha/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit(); 
		
		/* //Firefox launch
		//geckodriver
		System.setProperty("webdriver.gecko.driver", "C:/Users/mahes/OneDrive/Desktop/Geetha/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://mvnrepository.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
				//driver.quit(); */
		
		/* //MicrosoftEdge launch
		//msedgedriver
		//System.setProperty("webdriver.msedge.driver", "C:/Users/mahes/OneDrive/Desktop/Geetha/msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("https://mvnrepository.com/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.close();
				//driver.quit(); */
		
		
	}

}
