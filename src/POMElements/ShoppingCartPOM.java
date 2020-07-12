package POMElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import Helper.WebsiteStartup;

public class ShoppingCartPOM {
	private WebElement shoppingcartemptymsg;
	private WebElement addtocart;
	private WebElement quantityfield;
	private WebElement book1;
	private WebElement quantitybook1;
	private WebElement costBook1;
	private WebElement book2;
	private WebElement quantitybook2;
	private WebElement costBook2;
	private WebElement book3;
	private WebElement quantitybook3;
	private WebElement costBook3;
	private WebElement finalcost;
	private WebElement quantitybookgeneric;
	
	public WebElement emptyCartMessageElement(){
		String xp_emptycartmsg = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/p";
		shoppingcartemptymsg = WebsiteStartup.driver.findElement(By.xpath(xp_emptycartmsg));
		return shoppingcartemptymsg;
	}
	public WebElement addtoCartElement(){
		String cssSelector_addtocart = "input[name='Insert1']";
		addtocart = WebsiteStartup.driver.findElement(By.cssSelector(cssSelector_addtocart));
		return addtocart;
	}
	public WebElement quantityTextField(){
		String xp_quantity = "/html/body/table[5]/tbody/tr/td/form/form/p[1]/input";
		quantityfield = WebsiteStartup.driver.findElement(By.xpath(xp_quantity));
		return quantityfield;
	}
	// --------------------------------XPATH of PRICES----------------------------------------------------------------//
	public WebElement getPriceofBook1(){
		String xp_book1 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[2]";
		book1 = WebsiteStartup.driver.findElement(By.xpath(xp_book1));
		return book1;
	}
	public WebElement getPriceofBook2(){
		String xp_book2 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[3]/td[2]";
		book2 = WebsiteStartup.driver.findElement(By.xpath(xp_book2));
		return book2;
	}
	public WebElement getPriceofBook3(){
		String xp_book3 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[4]/td[2]";
		book3 = WebsiteStartup.driver.findElement(By.xpath(xp_book3));
		return book3;
	}
	// -------------------------------XPATH of QUANTITY FIELD---------------------------------------------------------//
	public WebElement getQuantityofBook1TextField(){
		String xp_quantity1 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[3]/input";
		quantitybook1 = WebsiteStartup.driver.findElement(By.xpath(xp_quantity1));
		return quantitybook1;
	}
	public WebElement getQuantityofBook2TextField(){
		String xp_quantity2 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[3]/td[3]/input";
		quantitybook2 = WebsiteStartup.driver.findElement(By.xpath(xp_quantity2));
		return quantitybook2;
	}
	public WebElement getQuantityofBook3TextField(){
		String xp_quantity3 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[4]/td[3]/input";
		quantitybook3 = WebsiteStartup.driver.findElement(By.xpath(xp_quantity3));
		return quantitybook3;
	}
	public WebElement getQuantityWhileAdding(){
		String xp_quantitygeneric = "/html/body/table[5]/tbody/tr/td/form/form/p[1]/input";
		quantitybookgeneric = WebsiteStartup.driver.findElement(By.xpath(xp_quantitygeneric));
		return quantitybookgeneric;
	}
	// ---------------------------------XPATH of TOTAL COST--------------------------------------------------------------//
	public WebElement getTotalCostBook1(){
		String xp_totalcostbook1 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[4]";
		costBook1 = WebsiteStartup.driver.findElement(By.xpath(xp_totalcostbook1));
		return costBook1;
	}
	public WebElement getTotalCostBook2(){
		String xp_totalcostbook2 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[3]/td[4]";
		costBook2 = WebsiteStartup.driver.findElement(By.xpath(xp_totalcostbook2));
		return costBook2;
	}
	public WebElement getTotalCostBook3(){
		String xp_totalcostbook3 = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[4]/td[4]";
		costBook3 = WebsiteStartup.driver.findElement(By.xpath(xp_totalcostbook3));
		return costBook3;
	}
	
	// ------------------------XPATH OF FINAL COST -------------------------------------------///
	public WebElement getFinalCostofAllBooks(){
		String xp_finalcost = "/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/p";
		finalcost = WebsiteStartup.driver.findElement(By.xpath(xp_finalcost));
		return finalcost;
	}
}
