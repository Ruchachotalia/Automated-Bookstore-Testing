package POMElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Helper.WebsiteStartup;

public class SearchPagePOM {
	private WebElement searchResultTextElement;
	private WebElement lastButtonElement;
	private WebElement bookSearchTextElement;
	private WebElement bookPriceElement;

	public WebElement lastButtonElement(){
		
		String xp_lastButton = "/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[21]/td/a[3]";
		lastButtonElement = WebsiteStartup.driver.findElement(By.xpath(xp_lastButton));
		return lastButtonElement;
	}
	
	public WebElement searchResultElement(){
		
	String xp_SearchResult = "/html/body/table[5]/tbody/tr/td";
	searchResultTextElement = WebsiteStartup.driver.findElement(By.xpath(xp_SearchResult));
	return searchResultTextElement;
	
	}
	
	public WebElement bookSearchResultTextElement(){
		String xp_bookSearchResult = "/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[5]/td[2]/b/a";
		bookSearchTextElement = WebsiteStartup.driver.findElement(By.xpath(xp_bookSearchResult));
		return bookSearchTextElement;
	}
	public WebElement priceofbookElement(){
		String xp_BookPrice = "/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[5]/td[2]/text()";
		bookPriceElement = WebsiteStartup.driver.findElement(By.xpath(xp_BookPrice));
		return bookPriceElement;
	}
}
