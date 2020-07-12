package Helper;
import POMElements.ShoppingCartPOM;
import POMElements.HomePagePOM;
public class ShoppingCartHelper {
	ShoppingCartPOM shoppingcartpom = new ShoppingCartPOM();
	HomePagePOM homepagepom = new HomePagePOM();
	
	public void clickOnShoppingCartLink(){
		homepagepom.shoppingCartLinkElement().click();
	}
	public String shoppingCartEmptyMessage(){
		String emptycardmessage = shoppingcartpom.emptyCartMessageElement().getText();
		return emptycardmessage;
	}
	public void clickOnDatabaseBook(){
		homepagepom.databaseBooksElement().click();
	}
	public void clickOnASPDatabaseBook(){
		homepagepom.aspDatabaseBookElement().click();
	}
	public void clickOnJSPDevBook(){
		homepagepom.jspDevelopmentBookElement().click();
	}
	public void clickOnAddToShoppingCart(){
		shoppingcartpom.addtoCartElement().click();
	}
	// ------------------------------GETTING INDIVIDUAL PRICE OF BOOK---------------------------------//
	public double getPriceOfBook1(){
		String priceOfBook1InString = shoppingcartpom.getPriceofBook1().getText().substring(1);
		double priceOfBook1 = Double.parseDouble(priceOfBook1InString);
		return priceOfBook1;
	}
	public double getPriceOfBook2(){
		String priceOfBook2InString = shoppingcartpom.getPriceofBook2().getText().substring(1);
		double priceOfBook2 = Double.parseDouble(priceOfBook2InString);
		return priceOfBook2;
	}
	public double getPriceOfBook3(){
		String priceOfBook3InString = shoppingcartpom.getPriceofBook3().getText().substring(1);
		double priceOfBook3 = Double.parseDouble(priceOfBook3InString);
		return priceOfBook3;
	}
	// -------------------------------GETTING THE QUANTITY OF BOOK------------------------------//
	public int getQuantityOfBook1(){
		String quantityOfBook1InString = shoppingcartpom.getQuantityofBook1TextField().getAttribute("value");
		int quantitybook1 = Integer.parseInt(quantityOfBook1InString);
		return quantitybook1;
	}
	public int getQuantityOfBook2(){
		String quantityOfBook2InString = shoppingcartpom.getQuantityofBook2TextField().getAttribute("value");
		int quantitybook2 = Integer.parseInt(quantityOfBook2InString);
		return quantitybook2;
	}
	public int getQuantityOfBook3(){
		String quantityOfBook3InString = shoppingcartpom.getQuantityofBook3TextField().getAttribute("value");
		int quantitybook3 = Integer.parseInt(quantityOfBook3InString);
		return quantitybook3;
	}
	// ---------------------GET COST OF BOOK (COST = PRICE * QUANTITY)----------------------------//
	public double costOfBook1(){
		String bookcost1InString = shoppingcartpom.getTotalCostBook1().getText().substring(1);
		double bookcost1 = Double.parseDouble(bookcost1InString);
		return bookcost1;
	}
	public double costOfBook2(){
		String bookcost2InString = shoppingcartpom.getTotalCostBook2().getText().substring(1);
		double bookcost2 = Double.parseDouble(bookcost2InString);
		return bookcost2;
	}
	public double costOfBook3(){
		String bookcost3InString = shoppingcartpom.getTotalCostBook3().getText().substring(1);
		double bookcost3 = Double.parseDouble(bookcost3InString);
		return bookcost3;
	}
	// ------------------------GET TOTAL COST OF ALL BOOKS ADDED TO SHOPPING CART------------------//
	public double finalCostOfCart(){
		String costOfcartInString = shoppingcartpom.getFinalCostofAllBooks().getText().substring(8);
//		return costOfcartInString;
		double finalcost = Double.parseDouble(costOfcartInString);
		return finalcost;
		
	}
	public void clearQuantityField1(){
		shoppingcartpom.getQuantityWhileAdding().clear();
	}
	public void clearQuantityField2(){
		shoppingcartpom.getQuantityWhileAdding().clear();
	}
	public void clearQuantityField3(){
		shoppingcartpom.getQuantityWhileAdding().clear();
	}
	public void addValueWhileAddingToCart(String quantityofbooks){
		shoppingcartpom.getQuantityWhileAdding().sendKeys(quantityofbooks);
	}
	public void enterValueInQuantityField1(String quantity1){
		shoppingcartpom.getQuantityofBook1TextField().sendKeys(quantity1);
	}
	public void enterValueInQuantityField2(String quantity2){
		shoppingcartpom.getQuantityofBook2TextField().sendKeys(quantity2);
	}
	public void enterValueInQuantityField3(String quantity3){
		shoppingcartpom.getQuantityofBook3TextField().sendKeys(quantity3);
	}
}
