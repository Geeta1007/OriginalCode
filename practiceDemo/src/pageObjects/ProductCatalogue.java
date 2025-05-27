package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductCatalogue {

			
	@FindBy(css=".col-sm-10")
	public static List<WebElement> itemList;
	
	@FindBy(css=".ng-trigger")
	public static WebElement spinner;
	
	By productsBy = By.cssSelector(".col-sm-10");
	By addTocart = By.cssSelector(".card-body button:last-of-type");
	By toastMessage = By.cssSelector("#toast-container");
	
	
}
