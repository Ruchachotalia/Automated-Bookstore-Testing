package TestCases;
import Helper.BookSearchHelper;
import Helper.WebsiteStartup;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class TestBookCategory {
	int testcases_passed = 0;
	int testcases_failed = 0;
	int total_testcases = 0;
	double passing_percentage = 0;
	
	BookSearchHelper booksearchHelper = new BookSearchHelper();
	WebDriver driver = null;
	
	public TestBookCategory( WebDriver driver){
		this.driver  = driver;
	}
	
	public void VerificationOfBookCategory(){
		
		//Selecting a value from dropdown
		booksearchHelper.selectProduct("Programming");
		
		// Clicking on search button
		booksearchHelper.clickSearchButton();
		
		//Test 1:
		//Verifying if 13 products were found
		String expectedSearchText = "13 products found.";
		String actualSearchText = booksearchHelper.searchResultsDisplayed();
		try{
			Assert.assertTrue(actualSearchText.contains(expectedSearchText));
			System.out.println("Search results should be displayed showing -- 13 products found : PASSED");
			System.out.println("");
			testcases_passed++;
		}
		catch(Error e) {
			System.out.println("Search results should be displayed showing -- 13 products found : FAILED");
			System.out.println("");
			testcases_failed++;
		}
			
		//Clicking on last button
		booksearchHelper.clickLastButton();
		
		//Test 2:
		// Verifying if C# programming book is the last book.
		String actualBookSearchText = booksearchHelper.bookSearchTextStringResult();
		String expectedBookSearchText = "C# - Programming";
		try{
		Assert.assertEquals(expectedBookSearchText, actualBookSearchText);
		System.out.println("C# - Programming should be displayed on the last page : PASSED");
		System.out.println("");
		testcases_passed++;
		}
		catch(Error e) {
			System.out.println("C# - Programming should be displayed on the last page : FAILED");
			System.out.println("");
			testcases_failed++;
			
		}
				
		// Verifying if the price of C# book is $34.99
		try{
			Assert.assertTrue(booksearchHelper.bookPriceText().contains("$34.99"));
			System.out.println("");
			System.out.println("The price of the book should be displayed as $34.99 : PASSED");
			System.out.println("");
			testcases_passed++;
			
		}
		catch(Error e) {
			System.out.println("The price of the book should be displayed as $34.99 : FAILED");
			System.out.println("");
			testcases_failed++;
		}
		
		
		//Navigating back to home page and verifying if home page was displayed
		booksearchHelper.clickHomeButton();
		String expectedHome_Url = "http://examples.codecharge.com/store/Default.php";
		String actualHome_Url = WebsiteStartup.driver.getCurrentUrl();
		try{
			Assert.assertEquals(expectedHome_Url, actualHome_Url);
			System.out.println("Home page should be displayed : PASSED");
			System.out.println("");
			testcases_passed++;
		}
		
		catch(Error e) {
			System.out.println("Home page should be displayed : FAILED");
			System.out.println("");
			testcases_failed++;
		}
		
		// Selecting programming from dropdown and entering C# in text field. 
		booksearchHelper.selectProduct("Programming");
		booksearchHelper.enterValueSearchField("C#");
		booksearchHelper.clickSearchButton();
		
		//Verifying if only 1 search result is displayed. 
		String actualSearchResultText = booksearchHelper.searchResultsDisplayed();
		String expectedSearchResultText = "1 products found.";
		try{
			Assert.assertEquals(expectedSearchResultText, actualSearchResultText);
			System.out.println("Search results should be displayed showing -- 1 products found. : PASSED");
			System.out.println("");
			testcases_passed++;
		}
		catch(Error e){
			System.out.println("Search results should be displayed showing -- 1 products found. : FAILED");
			System.out.println("");
			testcases_failed++;
		}
		
		
		//Verifying if only 1 result, C# programming is displayed. 
		
		
		//Calculation of test cases passed and failed: 
		System.out.println("Test cases passed: " +testcases_passed);
		System.out.println("");
		System.out.println("Test cases failed: " +testcases_failed);
		System.out.println("");
		total_testcases = testcases_passed + testcases_failed;
		System.out.println("Total test cases run: " +total_testcases);
		
		/* FACING DIVSION ERRORS*/
		
//		passing_percentage = (testcases_passed)/(total_testcases)*100;
//		System.out.println("");
//		System.out.println(+passing_percentage+ "% of the test cases passed.");
		
		
		//Closing the browser
		WebsiteStartup.driver.close();		
		
}
}
