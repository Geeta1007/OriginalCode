import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v135.emulation.Emulation;
import org.openqa.selenium.devtools.v135.fetch.Fetch;
import org.openqa.selenium.devtools.v135.network.Network;
import org.openqa.selenium.devtools.v135.network.model.ConnectionType;
import org.openqa.selenium.devtools.v135.network.model.Request;
import org.openqa.selenium.devtools.v135.network.model.Response;

import com.google.common.collect.ImmutableList;

public class NetworkSpeed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		web driver interface do not expose dev tools.
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		devTools.send(Network.emulateNetworkConditions(false, 3000, 20000, 10000, Optional.of(ConnectionType.ETHERNET), Optional.empty(), Optional.empty(), Optional.empty()));
		
//		when the condition is true below will be triggered
		devTools.addListener(Network.loadingFailed(), loadingFailed->
				{
					System.out.println(loadingFailed.getErrorText());
					System.out.println(loadingFailed.getTimestamp());
				});
		
		long startTime = System.currentTimeMillis();
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.linkText("Browse Products")).click();
		driver.findElement(By.linkText("Selenium")).click();
		driver.findElement(By.cssSelector(".add-to-cart")).click();
		System.out.println(driver.findElement(By.cssSelector("p")).getText());

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		//15217 1516
		driver.close();
		
	}

}
