package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tt.ebay.pageElements.EbayHomepageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsObj;
	WebDriverWait Wait = new WebDriverWait(SetupDrivers.driver, 60);
	
	public EbayHomepageActions(){
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
	}
	
	public void loadEbayHomepage() throws Exception{
		//SetupDrivers.driver.get("https://www.ebay.com/");
		
		//Implicit Wait in Selenium
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void searchShirt() throws Exception{
		EbayHomepageLocatorsObj.txtbxSearchForAnything.clear();
		EbayHomepageLocatorsObj.txtbxSearchForAnything.sendKeys("Shirt");
		
		//Explicit Wait in Selenium
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='gh-btn']")));
		
		EbayHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(3000);
	}
	
	public void mouseHoverMyEbay(){
		//Click on summary by mouse hovering myEbay
		Actions actions = new Actions(SetupDrivers.driver);
		actions.moveToElement(EbayHomepageLocatorsObj.myEbay);
		actions.perform();
	}
	
	public void searchItem(String item) throws Exception{
		EbayHomepageLocatorsObj.txtbxSearchForAnything.clear();
		EbayHomepageLocatorsObj.txtbxSearchForAnything.sendKeys(item);
		EbayHomepageLocatorsObj.btnSearch.click();
		
		TimeUnit time = TimeUnit.SECONDS;
		time.sleep(3);
	}
}
