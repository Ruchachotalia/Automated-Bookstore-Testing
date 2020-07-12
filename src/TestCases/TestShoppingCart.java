package TestCases;
import org.openqa.selenium.WebDriver;
import Helper.BookSearchHelper;
import Helper.ShoppingCartHelper;
import Helper.WebsiteStartup;
import org.junit.Assert; 

public class TestShoppingCart {
	
	WebDriver driver = null;
	public TestShoppingCart( WebDriver driver){
		this.driver  = driver;
	}
	ShoppingCartHelper shoppingcarthelper = new ShoppingCartHelper();
	BookSearchHelper booksearchhelper = new BookSearchHelper();
	
	public void verificationOfShoppingCart(){
		
		// Verifying that the correct message is displayed when shopping cart is empty
		shoppingcarthelper.clickOnShoppingCartLink();
		String actualmessage = shoppingcarthelper.shoppingCartEmptyMessage();
		String expectedmessage = "Shopping Cart is empty";
		try{
			Assert.assertEquals(expectedmessage, actualmessage);
		}
		catch(Error er){
			
		}
		
		// Adding books to shopping cart
		booksearchhelper.clickHomeButton();
		shoppingcarthelper.clickOnDatabaseBook();
		shoppingcarthelper.clickOnAddToShoppingCart(); //Book 1 added to shopping cart
		
		booksearchhelper.clickHomeButton();
		shoppingcarthelper.clickOnASPDatabaseBook();
		shoppingcarthelper.clickOnAddToShoppingCart(); //Book 2 added to shopping cart
		
		booksearchhelper.clickHomeButton();
		shoppingcarthelper.clickOnJSPDevBook();
		shoppingcarthelper.clearQuantityField3();
		shoppingcarthelper.addValueWhileAddingToCart("2");
		shoppingcarthelper.clickOnAddToShoppingCart(); //Book 3 added to shopping cart
		
		// Verifying the individual price of each book with its quantity.
		
		double price1 = shoppingcarthelper.getPriceOfBook1();
		int quantity1 = shoppingcarthelper.getQuantityOfBook1();
		double expectedcostofbook1 = shoppingcarthelper.costOfBook1();
		double actualcostofbook1 = price1 * quantity1;
		try{
			Assert.assertTrue(expectedcostofbook1 == actualcostofbook1);
			System.out.println("Cost of book 1 matches: PASSED");
		}
		catch(Error er){
			System.out.println("Cost of book 1 matches: FAILED");
		}
		
		double price2 = shoppingcarthelper.getPriceOfBook2();
		int quantity2 = shoppingcarthelper.getQuantityOfBook2();
		double expectedcostofbook2 = shoppingcarthelper.costOfBook2();
		double actualcostofbook2 = price2 * quantity2;
		try{
			Assert.assertTrue(expectedcostofbook2 == actualcostofbook2);
			System.out.println("Cost of book 2 matches: PASSED");
		}
		catch(Error er){
			System.out.println("Cost of book 2 matches: FAILED");
		}
		
		
		double price3 = shoppingcarthelper.getPriceOfBook3();
		int quantity3 = shoppingcarthelper.getQuantityOfBook3();
		double expectedcostofbook3 = shoppingcarthelper.costOfBook3();
		double actualcostofbook3 = price3 * quantity3;
		try{
			Assert.assertTrue(expectedcostofbook3 == actualcostofbook3);
			System.out.println("Cost of book 3 matches: PASSED");
		}
		catch(Error er){
			System.out.println("Cost of book 3 matches: FAILED");
			System.out.println(price3);
			System.out.println(quantity3);
			System.out.println(expectedcostofbook3);
			System.out.println(actualcostofbook3);
		}
		
		
		double actualfinalprice = shoppingcarthelper.finalCostOfCart();
		double expectedactualprice = (actualcostofbook1 + actualcostofbook2 + actualcostofbook3);
		try{
			Assert.assertTrue(actualfinalprice == expectedactualprice);
			System.out.println("Expected and final cost of the books match : PASSED");
		}
		catch(Error er){
			System.out.println("Expected and final cost of the books match : FAILED");
		}
		
//		Closing webdriver
		WebsiteStartup.driver.close();
		
	}
}
