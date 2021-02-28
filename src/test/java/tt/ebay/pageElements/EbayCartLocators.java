package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
	//Color
	@FindBy(xpath="//select[@name='Color']")
	public WebElement ddColor;
	
	//Size
	@FindBy(xpath="//select[contains(@name, 'Size')]")
	public WebElement ddSize;
	
	//Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQuantity;
	
	//Add to Cart
	@FindBy(xpath="//a[@id='atcRedesignId_btn']")
	public WebElement btnAddCart;

}
