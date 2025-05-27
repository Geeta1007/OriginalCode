import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v135.emulation.Emulation;

public class setGeoLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		web driver interface do not expose dev tools.
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
//		if the methods are not available in selenium server, we can customize the command like below
		Map<String, Object> geoLocation = new HashMap<String, Object>();
		geoLocation.put("latitude", 40);
		geoLocation.put("longitude", 3);
		geoLocation.put("accuracy", 1);
				
		driver.executeCdpCommand("Emulation.setGeolocationOverride", geoLocation);
		
		driver.get("https://www.edge.com/");
		driver.findElement(By.name("q")).sendKeys("facebook", Keys.ENTER);
		Thread.sleep(5000);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		String text = driver.findElement(By.cssSelector(".default-ltr-cache-l1j3pp-StyledContainer")).getText();
		System.out.println(text);
		
		
		
		
		
		
	}

}
