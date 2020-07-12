package Helper;

import POMElements.AddCategoryPOM;
public class AddCategoryHelper {
	AddCategoryPOM addcategorypom = new AddCategoryPOM();
	
	public void clickOnAdministration(){
		addcategorypom.administrationLinkElement().click();
	}
	
	public void enterUsername(String username){
		addcategorypom.usernameFieldElement().sendKeys(username);
	}
	
	public void enterPassword(String password){
		addcategorypom.passwordFieldElement().sendKeys(password);
	}
	
	public void clickOnLogin(){
		addcategorypom.loginButtonElement().click();
	}
	
	public void clickOnCategories(){
		addcategorypom.categoriesLinkElement().click();
	}
	
	public void clickOnAddNew(){
		addcategorypom.addnewLinkElement().click();
	}
	
	public void enterCategoryName(String newcategoryname){
		addcategorypom.addcategoryFieldElement().sendKeys(newcategoryname);
	}
	
	public void clickOnAddCategory(){
		addcategorypom.addCategoryButtonElement().click();
	}
	public void clickOnHomeLink(){
		addcategorypom.homeLinkElement().click();
	}
	public void clickOnElementToBeDeleted(){
		addcategorypom.deleteElement().click();
	}
	public void clickOnDeleteButton(){
		addcategorypom.deleteButtonElement().click();
	}

}
