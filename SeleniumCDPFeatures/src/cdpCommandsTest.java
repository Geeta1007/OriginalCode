import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v135.emulation.Emulation;

public class cdpCommandsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		web driver interface do not expose dev tools.
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
//		if the methods are not available in selenium server, we can customize the command like below
		Map deviceMatrics = new HashMap();
		deviceMatrics.put("width", 600);
		deviceMatrics.put("height", 1000);
		deviceMatrics.put("deviceScaleFactor", 50);
		deviceMatrics.put("mobile", true);
				
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMatrics);
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.className("navbar-toggler-icon")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Library")).click();
		
		
		
		
		
		
		
		
	}

}
