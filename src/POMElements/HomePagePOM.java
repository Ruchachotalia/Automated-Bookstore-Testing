package POMElements;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import Helper.WebsiteStartup;

public class HomePagePOM {

	private WebElement productDropdownElement;
	private WebElement searchFieldElement;
	private WebElement searchButtonElement;
	private WebElement homeElement;
	private WebElement advancedSearchElement;
	private WebElement shoppingCartElement;
	private WebElement databasebookElement;
	private WebElement aspdatabasesElement;
	private WebElement jspdevelopmentElement;
	
	public WebElement dropdownElement(){
		String xp_productDropdown = "/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select";
		productDropdownElement = WebsiteStartup.driver.findElement(By.xpath(xp_productDropdown));
		return productDropdownElement;
	}

	public WebElement searchFieldElement(){
		
	String xp_searchField = "/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[2]/td/input";
	searchFieldElement = WebsiteStartup.driver.findElement(By.xpath(xp_searchField));
	return searchFieldElement;
	}
	
	public WebElement searchButtonElement(){
		
		String xp_searchButton = "/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input";
		searchButtonElement = WebsiteStartup.driver.findElement(By.xpath(xp_searchButton));
		return searchButtonElement;
	}
	
	public WebElement homeButtonElement(){
		
		String xp_Home = "/html/body/table[2]/tbody/tr/td/a[1]";
		homeElement = WebsiteStartup.driver.findElement(By.xpath(xp_Home));
		return homeElement;
	}
	public WebElement advancedSearchElement(){
		String xp_advancedSearch = "/html/body/table[5]/tbody/tr/td[1]/p/a";
		advancedSearchElement = WebsiteStartup.driver.findElement(By.xpath(xp_advancedSearch));
		return advancedSearchElement;
	}
	public WebElement shoppingCartLinkElement(){
		String xp_shoppingcart = "/html/body/table[2]/tbody/tr/td/a[3]";
		shoppingCartElement = WebsiteStartup.driver.findElement(By.xpath(xp_shoppingcart));
		return shoppingCartElement;
	}
	public WebElement databaseBooksElement(){
		String xp_databasebooks = "/html/body/table[5]/tbody/tr/td[3]/table[2]/tbody/tr[1]/td/a";
		databasebookElement = WebsiteStartup.driver.findElement(By.xpath(xp_databasebooks));
		return databasebookElement;
	}
	public WebElement aspDatabaseBookElement(){
		String xp_aspdatabaseBook = "/html/body/table[5]/tbody/tr/td[3]/table[2]/tbody/tr[4]/td/a";
		aspdatabasesElement = WebsiteStartup.driver.findElement(By.xpath(xp_aspdatabaseBook));
		return aspdatabasesElement;
	}
	public WebElement jspDevelopmentBookElement(){
		String xp_jspDevelopment = "/html/body/table[5]/tbody/tr/td[3]/table[2]/tbody/tr[7]/td/a";
		jspdevelopmentElement = WebsiteStartup.driver.findElement(By.xpath(xp_jspDevelopment));
		return jspdevelopmentElement;
	}
}
