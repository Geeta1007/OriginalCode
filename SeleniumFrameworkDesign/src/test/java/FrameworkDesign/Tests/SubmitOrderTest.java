package FrameworkDesign.Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import FrameworkDesign.AbsrtactComponents.OrdersPage;
import FrameworkDesign.PageObjects.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameworkDesign.TestComponents.BaseTest;

public class SubmitOrderTest extends BaseTest {

	String productName = "ADIDAS ORIGINAL";

	@Test(dataProvider = "getData", groups = "Purchase")
	public void SubmitOrder(HashMap<String, String> input) throws IOException, InterruptedException {

		String countryName = "India";
		String successMessage = "Thankyou for the order.";

		// Step 1: Login and add product to cart
		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));
		productCatalogue.addingProductToCart(input.get("product"));

		// Step 2: Verify product in cart
		CartPage cartPage = productCatalogue.goToCart();
		boolean match = cartPage.crossCheckProduct(input.get("product"));
		Assert.assertTrue(match);

		// Step 3: Checkout process
		CheckOutPage checkOut = cartPage.goToCheckOut();
		checkOut.fillingCardDetails("1111222233334444", "293", "GeetaKishor");
		checkOut.countrySelection(countryName);
		ConfirmationPage confirmationPage = checkOut.sumbitOrder();

		// Step 4: Verify order success message
		boolean orderMsg = confirmationPage.orderSuccessMessage(successMessage);
		Assert.assertTrue(orderMsg);
	}

	@Test(dependsOnMethods = { "SubmitOrder" })
	public void OrderHistoryTest() {
		ProductCatalogue productCatalogue = landingPage.loginApplication("Geeta@gmail.com", "Pass@1007");
		OrdersPage ordersPage = productCatalogue.goToOrders();
		ordersPage.verifyOrdersProduct(productName);
	}

	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data = getJsonDataToMap(
				System.getProperty("user.dir") + "//src//test//java//FrameworkDesign//Data//PurchaseOrder.json");
		return new Object[][] { { data.get(0) }, { data.get(1) } };
	}
}