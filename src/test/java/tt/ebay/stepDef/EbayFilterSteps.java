package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayFilterSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@When("^Select filter as Long Sleeve$")
	public void select_filter_as_Long_Sleeve() throws Throwable {
		EbaySearchResultActionsObj.filterLongSleeve();
	}

	@Then("^Validate displaying Long Sleeve shirts$")
	public void validate_displaying_Long_Sleeve_shirts() throws Throwable {
		EbaySearchResultActionsObj.validateLongSleeve();
	}
}
