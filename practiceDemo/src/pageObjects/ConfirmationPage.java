package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConfirmationPage {
	
	@FindBy(tagName="h1")
	public static WebElement orderMessage;
	
}
