package pageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

	
	@FindBy(css=".cartSection h3")
	public static List<WebElement> cartProduct;
	
	@FindBy(css=".totalRow button")
	public static WebElement checkOut;
	
	}
	
