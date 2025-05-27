package InterviewPerspectiveSel;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver; 
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C://Users//mahes//OneDrive//Documents//screenshot.png");
		
		FileHandler.copy(sourceFile, destinationFile);
		
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		Robot robot = new Robot();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screenSize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		File destination = new File("C://Users//mahes//OneDrive//Documents//RobotScreenshot.png");
		ImageIO.write(source, "png", destination);
	}

}
