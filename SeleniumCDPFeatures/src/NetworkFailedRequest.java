import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v135.emulation.Emulation;
import org.openqa.selenium.devtools.v135.fetch.Fetch;
import org.openqa.selenium.devtools.v135.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v135.network.Network;
import org.openqa.selenium.devtools.v135.network.model.ErrorReason;
import org.openqa.selenium.devtools.v135.network.model.Request;
import org.openqa.selenium.devtools.v135.network.model.Response;

public class NetworkFailedRequest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		web driver interface do not expose dev tools.
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		Optional<List<RequestPattern>> pattern = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*=BadGuy"),Optional.empty(),Optional.empty())));
		devTools.send(Fetch.enable(pattern, Optional.empty()));
		
		devTools.addListener(Fetch.requestPaused(), request->
		{
			devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED ));
		});
		
				
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink='/library']")).click();
		Thread.sleep(3000);
		
//		driver.quit();
		
	}

}
