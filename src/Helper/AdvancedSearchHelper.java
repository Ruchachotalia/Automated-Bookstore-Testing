package Helper;

import org.openqa.selenium.support.ui.Select;
import POMElements.HomePagePOM;
import POMElements.SearchProductsPOM;

public class AdvancedSearchHelper {
	
	SearchProductsPOM searchproductspom = new SearchProductsPOM();
	HomePagePOM homepageElements = new HomePagePOM();
	
	public void selectCategory(String category_choice){
		Select dropdownCategory = new Select(searchproductspom.categoryDropdownElement());
		dropdownCategory.selectByVisibleText(category_choice);
	}
	public void enterValueInkeywordTextField(String keyword_value){
		searchproductspom.keywordValueElement().sendKeys(keyword_value);
	}
	public void enterValueInPriceMoreThanTextField(String pricemorethan_value){
		searchproductspom.priceMorethanElement().sendKeys(pricemorethan_value);
	}
	public void enterValueInLessThanTextField(String pricelessthan_value){
		searchproductspom.priceLessthanElement().sendKeys(pricelessthan_value);
	}
	public void selectValueOfColumn(String valueofcolumn){
		Select columnDropdown = new Select(searchproductspom.selectColumnElement());
		columnDropdown.selectByVisibleText(valueofcolumn);
	}
	public void selectValueofDirection(String valueofdirection){
		Select directionDropdown = new Select(searchproductspom.selectDirectionElement());
		directionDropdown.selectByVisibleText(valueofdirection);
	}
	public void selectRecordsPerPage(String valueofrecords){
		Select recordsDropdown = new Select(searchproductspom.selectRecordsElement());
		recordsDropdown.selectByVisibleText(valueofrecords);
	}
	public void clickOnSearchButton(){
		searchproductspom.searchButtonElement().click();
	}
	public void clickOnAdvancedSearch(){
		homepageElements.advancedSearchElement().click();
	}
	public String searchResults1(){
		String actualSearchResult = searchproductspom.searchResult1().getText();
		return actualSearchResult;
	}
	public double priceOfBookResult(){
		String wholeString = searchproductspom.priceOfBook().getText();
		String priceOfBookInString = wholeString.substring(23, 28);
		double bookPrice = Double.parseDouble(priceOfBookInString);
//		if(actualPrice.contains("$")){
//			int startPoint = actualPrice.indexOf("$");
//		System.out.println("5 begins from: " +startPoint);
//			int endpoint = actualPrice.lastIndexOf("6");
//			System.out.println("End point is: " +endpoint);
//			
//			System.out.println(price);
//		}
		return bookPrice;
	}
	public void clearPriceLessThanTextField(){
		searchproductspom.priceLessthanElement().clear();
	}
	public void clearPriceGreaterThanTextField(){
		searchproductspom.priceMorethanElement().clear();
	}
	public String noOfProductsFound(){
		String totalString = searchproductspom.noOfProducts().getText().trim();
		
		//Logic to find number of products and find the substring within the whole sentence.
		
//		if(totalString.contains("5 products found")){
//			int startPoint = totalString.indexOf("5");
//			System.out.println("5 begins from: " +startPoint);
//			int endpoint = totalString.lastIndexOf("d.");
//			System.out.println("End point is: " +endpoint);
//		}
		
		String noOfProducts = totalString.substring(164, 165).trim();
		return noOfProducts;
	}

}
