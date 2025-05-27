package InterviewPerspectiveSel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']/span[2]")).click();
		
		driver.findElement(By.id("j_idt88:j_idt100")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101']/div/a")).click();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span[2]")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Gee");
		alert3.accept();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt106']/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt109']/span[2]")).click();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt111']/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']/div/a[2]")).click();
		
	}

}
