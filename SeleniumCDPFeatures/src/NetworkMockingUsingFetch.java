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
import org.openqa.selenium.devtools.v135.network.model.Request;
import org.openqa.selenium.devtools.v135.network.model.Response;

public class NetworkMockingUsingFetch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		web driver interface do not expose dev tools.
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), request->
		{
			if(request.getRequest().getUrl().contains("shetty"))
			{
				String mockedUrl = request.getRequest().getUrl().replace("=shetty", "=BadGuy");
				System.out.println(mockedUrl);
				
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(mockedUrl), Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(), Optional.empty()));
			}
			else
			{
				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()), Optional.of(request.getRequest().getMethod()), Optional.empty(), Optional.empty(), Optional.empty()));
			}
		});
				
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("button[routerlink='/library']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		
//		driver.close();
		
	}

}
