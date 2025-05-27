import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v135.network.Network;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import com.google.common.collect.ImmutableList;

public class ConsoleLogsCapture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		driver.findElement(By.linkText("Cart")).click();
		driver.findElement(By.id("exampleInputEmail1")).clear();
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("2");

		LogEntries entries = driver.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs = entries.getAll();
		
		for (LogEntry L : logs)
		{
			if(L.getMessage().contains("ERROR"))
			{
				System.out.println(L.getMessage());
			}
			
		}
		driver.close();
	}

}
