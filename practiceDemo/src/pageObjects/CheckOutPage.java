package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckOutPage{

	
	@FindBy(xpath="(//form//div//div//div//input[@type='text'])[1]")
	public static WebElement cardRowDetails;
	
	@FindBy(xpath="(//form//div//div//div//input[@type='text'])[2]")
	public static WebElement cvvRowDetails;
	
	@FindBy(xpath="(//form//div//div//div//input[@type='text'])[3]")
	public static WebElement nameRowDetails;
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	public static WebElement countryRowDetails;
	
	@FindBy(xpath="//section//button[@type='button']")
	public static List<WebElement> countryCollection;
	
	@FindBy(css=".action__submit")
	public static WebElement sumbit;	
		
	@FindBy(xpath="(//button[contains(@class, 'ta-item')])[2] ")
	public static WebElement selectCountry;
	
	By countryDisplay = By.xpath("(//button[contains(@class, 'ta-item')])[2] ");
	
}