package TestCases;
import POMElements.HomePagePOM;

import java.util.List;
import java.util.Stack;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.Select;

import Helper.AddCategoryHelper;
import Helper.WebsiteStartup;
public class TestAddCategory {
	Stack<String> dropdownvalues = new Stack<String>();
	AddCategoryHelper addcategoryhelper = new AddCategoryHelper();
	HomePagePOM homepagepom = new HomePagePOM();
	
	WebDriver driver = null;
	public TestAddCategory( WebDriver driver){
		this.driver  = driver;
	}
	public void VerificationOfAdminRights(String newlyAddedCategory, String username, String password ){
		
		addcategoryhelper.clickOnAdministration();
		addcategoryhelper.enterUsername(username);
		addcategoryhelper.enterPassword(password);
		addcategoryhelper.clickOnLogin();
		addcategoryhelper.clickOnCategories();
		addcategoryhelper.clickOnAddNew();
		addcategoryhelper.enterCategoryName(newlyAddedCategory);
		addcategoryhelper.clickOnAddCategory();
		addcategoryhelper.clickOnHomeLink();
		
//		Verifying if newly added category is present in dropdown
		Select categoryDropdown = new Select(homepagepom.dropdownElement());
		List<WebElement> allDropdownOptions = categoryDropdown.getOptions();
		for(int iterations = 0 ; iterations<allDropdownOptions.size(); iterations++){
			dropdownvalues.push(allDropdownOptions.get(iterations).getText());	
		}
		
		try{
			Assert.assertTrue(dropdownvalues.contains(newlyAddedCategory));
			System.out.println("Category added should be listed in drop down menu: PASSED");
		}
		catch(Error er){
			System.out.println("Category added should be listed in drop down menu: FAILED");
		}
		
		//Reverting back entry TearDown
		addcategoryhelper.clickOnAdministration();
		addcategoryhelper.clickOnCategories();
		addcategoryhelper.clickOnElementToBeDeleted();
		addcategoryhelper.clickOnDeleteButton();
		WebsiteStartup.driver.switchTo().alert().accept();
		addcategoryhelper.clickOnHomeLink();
		
//		Closing the driver
		WebsiteStartup.driver.close();
		
	}

}
