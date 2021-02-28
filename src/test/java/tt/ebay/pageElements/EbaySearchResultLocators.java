package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	//Sleeve Length
	@FindBy(xpath="//h3[text()='Sleeve Length']")
	public WebElement txtSleeveLength;
	
	//Long Sleeve
	@FindBy(xpath="//input[@aria-label='Long Sleeve']")
	public WebElement cbxLongSleeve;
	
	//Validate Long Sleeve
	@FindBy(xpath="//*[contains(text(),'Long Sleeve')]")
	public WebElement txtLongSleeve;
	
	//Brand Nike
	@FindBy(xpath="//*[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	//Brand Adidas
	@FindBy(xpath="//*[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	
	//Unbranded
	@FindBy(xpath="//*[@aria-label='Unbranded']")
	public WebElement cbxUnbranded;
	
	//Validate Nike
	@FindBy(xpath="//*[contains(text(),'Nike')]")
	public WebElement txtNike;
	
	//Validate Adidas
	@FindBy(xpath="//*[contains(text(),'Adidas')]")
	public WebElement txtAdidas;
	
	//Validate Unbranded
	@FindBy(xpath="//*[contains(text(),'Unbranded')]")
	public WebElement txtUnbranded;
	
	//Select First Item
	@FindBy(xpath="//h3[contains(text(),'Mens Thermal Shirts - Heavy Weight')]")
	public WebElement lnkFirstItem;
}
