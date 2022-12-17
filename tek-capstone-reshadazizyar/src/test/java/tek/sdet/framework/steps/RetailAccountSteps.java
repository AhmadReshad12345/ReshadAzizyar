package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.core.logging.Logger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	


	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	   click(factory.homePage().accountDisplay);
	   logger.info("User clicked on option button");
	}
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String number) {
		clearText(factory.accountPage().nameField);
		sendText(factory.accountPage().nameField,name);
		sendText(factory.accountPage().phoneNumberField,number);
		logger.info("User Updated their personal information");
		slowDown();
	   
	}
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
	   click(factory.accountPage().updateButton);
	   logger.info("User clicked on updated option");
	}
	
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalinformationUpdatedPopup);
		String expected = "Personal Information Updated Successfully";
		String actual = getText(factory.accountPage().personalinformationUpdatedPopup);
		Assert.assertEquals(expected, actual);
		logger.info("pop up was displayed");
		
	}
	
	
	
	
	@And("User enter below information")
	public void UserEnterBelowInformation(DataTable data) {
		List<Map<String, String>> map = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPassword, map.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, map.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, map.get(0).get("confirmPassword"));
		logger.info("User entered the below information");
	
	}
	
	
	@And("User click on Change Password button")
	public void userClickedOnChangePasswordButton() {
		click(factory.accountPage().changePasswordBtn);
		logger.info("User clicked on change password button");
	}
	
	
	@Then("a message should be displayed Password Updated Successfully")
	public void messageShouldBeDisplayed() {	
	waitTillPresence(factory.accountPage().changePasswordPopUp);
	String message="Password Updated Successfully";
	String result = getElementText(factory.accountPage().changePasswordPopUp);
	Assert.assertEquals(message, result);
	logger.info("password changed");
	}
	
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodLink);
		logger.info("User click on add payment method link");

	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
	   List<Map<String,String>> map = dataTable.asMaps(String.class, String.class);
	   sendText(factory.accountPage().cardNumberInput, map.get(0).get("cardNumber"));
	   sendText(factory.accountPage().nameOnCardInput, map.get(0).get("nameOnCard"));
	   selectByVisibleText(factory.accountPage().expirationMonthInput, map.get(0).get("expirationMonth"));
	   selectByVisibleText(factory.accountPage().expirationYearInput, map.get(0).get("expirationYear"));
	   sendText(factory.accountPage().securityCodeInput, map.get(0).get("securityCode"));
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	   click(factory.accountPage().paymentSubmitBtn);
		logger.info("User clicked on summit button");
	}
	@Then("a message should be displayed Payment Method added successfully")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		String actual = "Payment Method added sucessfully";
		String expect = getElementText(factory.accountPage().cardAddedPopUp);
	    Assert.assertEquals(actual, expect);
	    logger.info("Message was displayed successfully");
	}
	

	@When("User click on added card")
	public void userClickedOnAddedCard() {
		click(factory.accountPage().ClickOnCardToEdit);
		logger.info("User click on added card");
	}
	
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.accountPage().Edit);
	    logger.info("User clicked on login button");
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
	   List<Map<String,String>> map = dataTable.asMaps(String.class, String.class);
	   clearText(factory.accountPage().cardNumberInput);
	   sendText(factory.accountPage().cardNumberInput, map.get(0).get("cardNumber"));
	   clearText(factory.accountPage().nameOnCardInput);
	   sendText(factory.accountPage().nameOnCardInput, map.get(0).get("nameOnCard"));
	   
	  
	   selectByVisibleText(factory.accountPage().expirationMonthInput,map.get(0).get("expirationMonth"));
	   selectByVisibleText(factory.accountPage().expirationYearInput, map.get(0).get("expirationYear"));
	   clearText(factory.accountPage().securityCodeInput);
	   sendText(factory.accountPage().securityCodeInput, map.get(0).get("securityCode"));
	   logger.info("User entered the following information");
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	
	   click(factory.accountPage().paymentSubmitBtn);
	   logger.info("User clicked on updated button");
	}
	@Then("a message should be displayed Payment Method updated Successfully")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
//		slowDown();
		String actual = "Payment Method updated Successfully";
		String expect = getElementText(factory.accountPage().cardupdatedPopUp);
	    Assert.assertEquals(actual, expect);
	    logger.info("Message was displayed successfully");
	}
	

	
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().remove);
		logger.info("User clicked in remove buttn");
	    
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentSubmitBtn));
		logger.info("Card was removed");
	   
	}

	
	
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	   click(factory.accountPage().addressAddedIcon);
	   logger.info("User clicked on add address icon");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	    List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
	    selectByValue(factory.accountPage().countrySelection,map.get(0).get("country"));
	    sendText(factory.accountPage().fullNameInputForAddress, map.get(0).get("fullName"));
	    sendText(factory.accountPage().phoneNumberInputForAddress, map.get(0).get("phoneNumber"));
	    sendText(factory.accountPage().streetInput, map.get(0).get("streetAddress"));
	    sendText(factory.accountPage().apartmentInput, map.get(0).get("apt"));
	    sendText(factory.accountPage().cityInput, map.get(0).get("city"));
	    selectByValue(factory.accountPage().State, map.get(0).get("state"));
	    sendText(factory.accountPage().zipCodeInput, map.get(0).get("zipCode"));
	    logger.info("User added the address information");
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().addedAddressbutton);
	    logger.info("User clicked on add address button");
	}
	@Then("a message should be displayed Address Added Successfully")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
	    
		String actual = "Address Added Successfully";
		String expect = getElementText(factory.accountPage().addressAddedPopUp);
	    Assert.assertEquals(actual, expect);
	    logger.info("Message was displayed successfully");
		
	}
	
	
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		waitTillPresence(factory.accountPage().editAddressOption);
	    click(factory.accountPage().editAddressOption);
	    logger.info("User clicked on edit address option");
	}
	
	@When("user fill new address form with below information there")
	public void userFillNewAddressFormWithBelowInformationThere(DataTable dataTable) {
	   List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
	   selectByValue(factory.accountPage().countrySelection, map.get(0).get("country"));
	   clearTextUsingSendKeys(factory.accountPage().fullNameInputForAddress);
	   sendText(factory.accountPage().fullNameInputForAddress, map.get(0).get("fullName"));
	   clearTextUsingSendKeys(factory.accountPage().phoneNumberInputForAddress);
	   sendText(factory.accountPage().phoneNumberInputForAddress, map.get(0).get("phoneNumber"));
	   waitTillPresence(factory.accountPage().streetInput);
	   clearTextUsingSendKeys(factory.accountPage().streetInput);
	   sendText(factory.accountPage().streetInput, map.get(0).get("streetAddress"));
	   sendText(factory.accountPage().apartmentInput, map.get(0).get("apt"));
	   waitTillPresence(factory.accountPage().cityInput);
	   clearTextUsingSendKeys(factory.accountPage().cityInput);
	   sendText(factory.accountPage().cityInput, map.get(0).get("city"));
	   selectByValue(factory.accountPage().State, map.get(0).get("state"));
	   waitTillPresence(factory.accountPage().zipCodeInput);
	   clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
	   sendText(factory.accountPage().zipCodeInput, map.get(0).get("zipCode"));
	   logger.info("User updated the address information");
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	   click(factory.accountPage().updateAddressButton);
	   logger.info("User clicked on update address button");
	}
	@Then("a message should be displayed Address Updated Successfully")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
	    
		String actual = "Address Updated Successfully";
		String expect = getElementText(factory.accountPage().addressUpdatePopUp);
	    Assert.assertEquals(actual, expect);
	    logger.info("Message was displayed successfully");
	}
	
	
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	    click(factory.accountPage().removeAddress);
	    logger.info("User clicked on remove option");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	Assert.assertFalse(isNotDisplayed(factory.accountPage().remove));
	logger.info("Address was removed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

		
		

		
		
		
		
		
	
		
	














