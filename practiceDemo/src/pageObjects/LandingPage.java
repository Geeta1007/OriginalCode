package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
			
	@FindBy(id="userEmail")
	public static WebElement usermail;
	
	@FindBy(id="userPassword")
	public static WebElement passwordEle;
	
	@FindBy(id="login")
	public static WebElement login;
	
	@FindBy(css="[class*='flyInOut']")
	public static WebElement errorMessage;
	
	}
	
