package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.hc.client5.http.classic.HttpClient;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.xpath("//li/a"));
		
		SoftAssert sa = new SoftAssert();
		
		for(WebElement link: links)
		{
			String list = link.getDomAttribute("href");
			if (list == null || list.isEmpty() || list.startsWith("#") || list.startsWith("javascript")) 
			{
			 continue;
			}

	        HttpURLConnection conn= (HttpURLConnection)new URL(list).openConnection();

			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			sa.assertTrue(respCode<400, respCode +" " + link.getText() +" is a broken link");
			
//			if(respCode>=400)
//			{
//				System.out.println(respCode +" " + link.getText() +" is a broken link");
//				Assert.assertTrue(false);
//			}
			
		
		}
		sa.assertAll();
				
				
				
//		Used to fetch details from network tab-------------------------------------------------------
//		HttpURLConnection conn =(HttpURLConnection)new URL(list).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int respCode = conn.getResponseCode();
//		System.out.println(respCode);
		
	}

}
