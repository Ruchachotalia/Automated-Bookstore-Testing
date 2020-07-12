package POMElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Helper.WebsiteStartup;

public class SearchProductsPOM {
	private WebElement categorydropdown;
	private WebElement keywordvalue;
	private WebElement pricemorethanvalue;
	private WebElement pricelessthanvalue;
	private WebElement selectcolumn;
	private WebElement selectdirection;
	private WebElement selectrecordsvalue;
	private WebElement searchbutton;
	private WebElement searchproductform;
	private WebElement searchResults1;
	private WebElement priceOfBook;
	private WebElement noofproducts;
	
	public WebElement categoryDropdownElement(){
		String xp_categorydropdown = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[1]/td[2]/select";
		categorydropdown = WebsiteStartup.driver.findElement(By.xpath(xp_categorydropdown));
		return categorydropdown;
	}
	public WebElement keywordValueElement(){
		String xp_keywordvalue = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td/input";
		keywordvalue = WebsiteStartup.driver.findElement(By.xpath(xp_keywordvalue));
		return keywordvalue;
		
	}
	public WebElement priceMorethanElement(){
		String xp_pricemorethanvalue = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input";
		pricemorethanvalue = WebsiteStartup.driver.findElement(By.xpath(xp_pricemorethanvalue));
		return pricemorethanvalue;
		
	}
	public WebElement priceLessthanElement(){
		String xp_pricelessthanvalue = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[4]/td/input";
		pricelessthanvalue = WebsiteStartup.driver.findElement(By.xpath(xp_pricelessthanvalue));
		return pricelessthanvalue;
		
	}
	public WebElement selectColumnElement(){
		String xp_selectcolumn = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select[1]";
		selectcolumn = WebsiteStartup.driver.findElement(By.xpath(xp_selectcolumn));
		return selectcolumn;
		
	}
	public WebElement selectDirectionElement(){
		String xp_selectdirection = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[5]/td/select[2]";
		selectdirection = WebsiteStartup.driver.findElement(By.xpath(xp_selectdirection));
		return selectdirection;
		
	}
	public WebElement selectRecordsElement(){
		String xp_selectrecordsvalue = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[6]/td/select";
		selectrecordsvalue = WebsiteStartup.driver.findElement(By.xpath(xp_selectrecordsvalue));
		return selectrecordsvalue;
		
	}
	public WebElement searchButtonElement(){
		String xp_searchbutton = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form/table[2]/tbody/tr[7]/td/input";
		searchbutton = WebsiteStartup.driver.findElement(By.xpath(xp_searchbutton));
		return searchbutton;
	}
	public WebElement formOfSearchProductsElement(){
		String xp_formofsearchproducts = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form";
		searchproductform = WebsiteStartup.driver.findElement(By.xpath(xp_formofsearchproducts));
		return searchproductform;
	}
	public WebElement searchResult1(){
		String xp_searchresult1 = "/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/b/a";
		searchResults1 = WebsiteStartup.driver.findElement(By.xpath(xp_searchresult1));
		return searchResults1;
	}
	public WebElement priceOfBook(){
		String xp_priceOfBook = "/html/body/table[5]/tbody/tr/td/table[2]/tbody/tr[1]/td[2]";
		priceOfBook = WebsiteStartup.driver.findElement(By.xpath(xp_priceOfBook));
		return priceOfBook;
	}
	public WebElement noOfProducts(){
		noofproducts = WebsiteStartup.driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td"));
		return noofproducts;
	}
	

}
