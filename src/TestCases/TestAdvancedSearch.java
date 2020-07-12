package TestCases;
import Helper.AdvancedSearchHelper;
import Helper.WebsiteStartup;
import POMElements.SearchProductsPOM;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class TestAdvancedSearch {
	int testcases_passed = 0;
	int testcases_failed = 0;
	int totaltestcases = 0;
	AdvancedSearchHelper advancedSearchHelper = new AdvancedSearchHelper();
	SearchProductsPOM searchproductspom = new SearchProductsPOM();
	WebDriver driver = null;
	public TestAdvancedSearch( WebDriver driver){
		this.driver  = driver;
	}
	public void VerificationOfAdvancedSearch(){
		
//		Clicking on advanced search
		advancedSearchHelper.clickOnAdvancedSearch();
		
//		Verifying if advanced page search was opened
		try{
			Assert.assertTrue(searchproductspom.formOfSearchProductsElement().isDisplayed());
			System.out.println("Advanced Search page should open up: PASSED");
			System.out.println();
			testcases_passed++;
		}
		catch(Error er){
			System.out.println("Advanced Search page should open up: FAILED");
			System.out.println();
			testcases_failed++;
		}
		
//		Selecting databases as category, price > 10, price < 30, order by product ascending and clicking on search
		advancedSearchHelper.selectCategory("Databases");
		advancedSearchHelper.enterValueInPriceMoreThanTextField("10");
		advancedSearchHelper.enterValueInLessThanTextField("30");
		advancedSearchHelper.selectValueOfColumn("Product");
		advancedSearchHelper.selectValueofDirection("Ascending");
		advancedSearchHelper.clickOnSearchButton();
		
//		Verifying if SQL and MySQL is displayed.
		String expectedSearchResult = "MySQL and mSQL";
		String actualSearchResult = advancedSearchHelper.searchResults1();
		try{
			Assert.assertEquals(expectedSearchResult, actualSearchResult);
			System.out.println("MySQL and mSQL should be displayed: PASSED");
			System.out.println();
			testcases_passed++;
		}
		catch(Error er){
			System.out.println("MySQL and mSQL should be displayed: FAILED");
			System.out.println();
			testcases_failed++;
		}
		
//		Verifying if he price of book is greater than 10 and less than 30.
		double bookPrice = advancedSearchHelper.priceOfBookResult();
		
		try{
			Assert.assertTrue(bookPrice > 10 && bookPrice < 30);
			System.out.println(" Verify if the price is greater than 10 and less than 30 : PASSED");
			System.out.println();
			testcases_passed++;
		}
		catch(Error er){
			System.out.println("Verify if the price is greater than 10 and less than 30 : FAILED");
			System.out.println();
			testcases_failed++;
		}
		
//		Clicking on browser back button
		WebsiteStartup.driver.navigate().back();
		
//		Clearing the fields
		advancedSearchHelper.clearPriceGreaterThanTextField();
		advancedSearchHelper.clearPriceLessThanTextField();
		
//		Selecting databases as category, price > 10, price < 1000, order by price descending and clicking on search
		advancedSearchHelper.selectCategory("Databases");
		advancedSearchHelper.enterValueInPriceMoreThanTextField("10");
		advancedSearchHelper.enterValueInLessThanTextField("1000");
		advancedSearchHelper.selectValueOfColumn("Price");
		advancedSearchHelper.selectValueofDirection("Descending");
		advancedSearchHelper.clickOnSearchButton();
		
//		Verifying if search results displays 5 products
		String actualResult = advancedSearchHelper.noOfProductsFound();
		try{
			Assert.assertEquals("5", actualResult);
			System.out.println("Verify if search results display 5 products: PASSED");
			System.out.println();
			testcases_passed++;
		}
		catch(Error er){
			System.out.println("Verify if search results display 5 products: FAILED");
			System.out.println();
			testcases_failed++;
		}
		

//		Verifying if prices are displayed in descending order
		
		
//		Calculating total test cases passed and failed
		System.out.println();
		System.out.println("Test cases passed: "+testcases_passed);
		System.out.println();
		System.out.println("Test cases failed: "+testcases_failed);
		System.out.println();
		totaltestcases = testcases_passed + testcases_failed;
		System.out.println("Total Test cases executed: "+totaltestcases);
		
//		Closing the driver
		WebsiteStartup.driver.close();
		
	}
}
