package com.cucumberrunner;

import org.openqa.selenium.WebDriver;

import com.pages.BasketPage;
import com.pages.BillingPage;
import com.pages.CategoryPage;
import com.pages.DeliveryPage;
import com.pages.HomePage;
import com.pages.LoginRegisterPage;
import com.pages.OrderConfirmationPage;
import com.pages.PaymentPage;
import com.pages.ProductDetailsPage;
import com.pages.ProductListingPage;
import com.pages.SearchResultsPage;
import com.pages.StoreResultsPage;
import com.pages.StoreSearchPage;
import com.utility.SystemLibrary;

public class AbstractMain {
	public static WebDriver driver;
	public static SystemLibrary systemlib = new SystemLibrary();
	public static BasketPage basketPage = new BasketPage();
	public static BillingPage billingPage = new BillingPage();
	public static CategoryPage categoryPage = new CategoryPage();
	public static DeliveryPage deliveryPage = new DeliveryPage();
	public static HomePage homePage = new HomePage();
	public static LoginRegisterPage loginRegisterPage = new LoginRegisterPage();
	public static OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
	public static PaymentPage paymentPage = new PaymentPage();
	public static ProductDetailsPage productDetailsPage = new ProductDetailsPage();
	public static ProductListingPage productListingPage = new ProductListingPage();
	public static SearchResultsPage searchResultsPage = new SearchResultsPage();
	public static StoreResultsPage storeResultsPage = new StoreResultsPage();
	public static StoreSearchPage storeSearchPage = new StoreSearchPage();
}
