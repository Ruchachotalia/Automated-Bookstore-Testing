package TestCases;

import org.openqa.selenium.WebDriver;
//import TestCases.TestAddCategory;
import Helper.WebsiteStartup;
//import TestCases.TestBookCategory;
//import TestCases.TestAdvancedSearch;
import TestCases.TestShoppingCart;

public class TestRunner {
	
	 public static void main(String[] args) throws InterruptedException {
		 testBookSearchResults();
	}
	 private static WebDriver driver = null;
	 
	    public static void testBookSearchResults(){
	    	
	    	WebsiteStartup.setup();
	        
//	        TestBookCategory testCategory = new TestBookCategory(driver);
//	        testCategory.VerificationOfBookCategory();
//	        
//	        TestAdvancedSearch testAdvancedSearch = new TestAdvancedSearch(driver);
//	        testAdvancedSearch.VerificationOfAdvancedSearch();
	        
//	        TestAddCategory testaddcategory = new TestAddCategory(driver);
//	        testaddcategory.VerificationOfAdminRights("Big Data", "admin", "admin");
	    	
	    	TestShoppingCart testshoppingcart = new TestShoppingCart(driver);
	    	testshoppingcart.verificationOfShoppingCart();
	        
	    }
	

}
