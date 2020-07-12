package POMElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Helper.WebsiteStartup;

public class AddCategoryPOM {
	
	private WebElement administration;
	private WebElement usernamefield;
	private WebElement passwordfield;
	private WebElement loginbutton;
	private WebElement categorieslink;
	private WebElement addnewlink;
	private WebElement addcategoryfield;
	private WebElement addbutton;
	private WebElement homeLink;
	private WebElement deletedLink;
	
	public WebElement administrationLinkElement(){
//		String classname_administration = "TopMenuLink";
		String xp_administration = "/html/body/table[2]/tbody/tr/td/a[4]";
//		administration = WebsiteStartup.driver.findElement(By.className(classname_administration));
		administration = WebsiteStartup.driver.findElement(By.xpath(xp_administration));
		return administration;
	}
	
	public WebElement usernameFieldElement(){
		String cssSelector_usernamefield = "input[name='login']";
		usernamefield = WebsiteStartup.driver.findElement(By.cssSelector(cssSelector_usernamefield));
		return usernamefield;
	}
	
	public WebElement passwordFieldElement(){
		String cssSelector_passwordfield = "input[name='password']";
		passwordfield = WebsiteStartup.driver.findElement(By.cssSelector(cssSelector_passwordfield));
		return passwordfield;
	}
	
	public WebElement loginButtonElement(){
		String cssSelector_passwordfield = "input[name='DoLogin']";
		loginbutton = WebsiteStartup.driver.findElement(By.cssSelector(cssSelector_passwordfield));
		return loginbutton;
	}
	
	public WebElement categoriesLinkElement(){
		String xp_categorieslink = "/html/body/table/tbody/tr/td/table[2]/tbody/tr[1]/td/a";
		categorieslink = WebsiteStartup.driver.findElement(By.xpath(xp_categorieslink));
		return categorieslink;
	}
	
	public WebElement addnewLinkElement(){
		String xp_addnewlink = "/html/body/table/tbody/tr/td/table[2]/tbody/tr[5]/td/a";
		addnewlink = WebsiteStartup.driver.findElement(By.xpath(xp_addnewlink));
		return addnewlink;
	}
	
	public WebElement addcategoryFieldElement(){
		String cssSelector_addcategoryfield = "input[name='category_name']";
		addcategoryfield = WebsiteStartup.driver.findElement(By.cssSelector(cssSelector_addcategoryfield));
		return addcategoryfield;
	}
	
	public WebElement addCategoryButtonElement(){
		String cssSelector_addbutton = "input[name='Insert1']";
		addbutton = WebsiteStartup.driver.findElement(By.cssSelector(cssSelector_addbutton));
		return addbutton;
	}
	public WebElement homeLinkElement(){
		String xp_homeLink = "/html/body/a[1]";
		homeLink = WebsiteStartup.driver.findElement(By.xpath(xp_homeLink));
		return homeLink;
	}
	public WebElement deleteElement(){
		String xp_delete = "/html/body/table/tbody/tr/td/table[2]/tbody/tr[5]/td/a";
		deletedLink = WebsiteStartup.driver.findElement(By.xpath(xp_delete));
		return deletedLink;
	}
	public WebElement deleteButtonElement(){
		String cssSelector_addbutton = "input[name='Delete1']";
		addbutton = WebsiteStartup.driver.findElement(By.cssSelector(cssSelector_addbutton));
		return addbutton;
	}

}
