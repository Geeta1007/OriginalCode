package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
//		switching to frame--------------------------
		
//		driver.switchTo().frame(0); //----based on index (but works with frame name, frame id as well)
		System.out.println(driver.findElements(By.tagName("iframe")).size()); //-----to find how many frames present 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));  //----based on webElement
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
//		switching back to driver---------------------------
		
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("a[href*='accepted']")).click();
	}

}
