package Helper;
import POMElements.HomePagePOM;
import POMElements.SearchPagePOM;
import org.openqa.selenium.support.ui.Select;

public class BookSearchHelper {
	HomePagePOM homepageElements = new HomePagePOM();
	SearchPagePOM searchpageElements = new SearchPagePOM();
	
	public void selectProduct(String choice){
		
		Select dropdown = new Select(homepageElements.dropdownElement());
		dropdown.selectByVisibleText(choice);
	}
	
	public void enterValueSearchField(String search_value){
		
		homepageElements.searchFieldElement().sendKeys(search_value);
	}
	
	public void clickSearchButton(){
		
		homepageElements.searchButtonElement().click();

	}
	
	public String searchResultsDisplayed(){
		
		String actualSearchResultText = searchpageElements.searchResultElement().getText().toString();
		return actualSearchResultText;
	}
	
	public String bookSearchTextStringResult(){
		String actualBookSearchText = searchpageElements.bookSearchResultTextElement().getText().toString();
		return actualBookSearchText;
	}
	
	public void clickLastButton(){
		
		searchpageElements.lastButtonElement().click();
	}
	
	public String bookPriceText(){
		String actualBookPrice = searchpageElements.bookSearchResultTextElement().getText().toString();
		return actualBookPrice;
	}
	
	public void clickHomeButton(){
		homepageElements.homeButtonElement().click();
	}

}
