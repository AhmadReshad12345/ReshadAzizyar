package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	   click(factory.orderPage().orderPageOption);
	   logger.info("User clicked on order option");
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
	   click(factory.orderPage().firstOrder);
	   logger.info("User clicked on first order");
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	   click(factory.orderPage().CancelTheOrderButton);
	   logger.info("User clicked on cancel order");
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String element) {
	    selectByVisibleText(factory.orderPage().reasonOption, element);
	    logger.info("User selected the Bought wrong item reason");
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	   click(factory.orderPage().cancelOrder);
	   logger.info("User clicked on cancel order");
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String str) {
	    String expect = str;
	    String actual =getElementText(factory.orderPage().cancelOrderMessage);
	    Assert.assertEquals(actual, expect);
	    logger.info("the message was displayed");
	}

	

	
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnOption);
	    logger.info("User clicked on return option");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String element) {
	    selectByVisibleText(factory.orderPage().reasonOption, element);
	    logger.info("User selected damaged reason");
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String element) {
	    selectByVisibleText(factory.orderPage().dropOffInput, element);
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
	    click(factory.orderPage().returnButton);
	    logger.info("User clicked on order button");
	}
	@Then("a cancelation message should displayed {string}")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful(String str) {
	    
		String expect = str;
	    String actual =getElementText(factory.orderPage().retutnOrderMessage);
	    Assert.assertEquals(actual, expect);
	    logger.info("the message was displayed");
	}
	
	

	
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviewButton);
	    logger.info("User clicked on review Buttton");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
	    sendText(factory.orderPage().headlineInput, string);
	    sendText(factory.orderPage().descriptionInput, string2);
	    logger.info("User filled the form");
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.orderPage().reviewSubmitBtn);
	    logger.info("User clicked on review Submit Button");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String str) {
	    
		String expect =str;
	    String actual =getElementText(factory.orderPage().reviewPopup);
	    Assert.assertEquals(actual, expect);
	    logger.info("the message was displayed");
	}
	
	
	
	
	
	
	
	

}


