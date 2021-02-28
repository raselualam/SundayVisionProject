package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbayHomepageLocators {
	
	//Search for anything
	@FindBy(xpath="//input[@id='gh-ac']")
	public WebElement txtbxSearchForAnything;
	
	//Search 
	@FindBy(xpath="//input[@id='gh-btn']")
	public WebElement btnSearch;
	
	//Search - Locators without page factory
	WebElement btnSearch2 = SetupDrivers.driver.findElement(By.xpath("//input[@id='gh-btn']"));
	
	//myEbay 
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement myEbay;

}
