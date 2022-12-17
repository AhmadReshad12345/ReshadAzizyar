package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expected = "React App";
		String actual = getTitle();
		Assert.assertEquals(expected, actual);
		logger.info(expected+" is equal to "+actual);
	   
	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("User clicked on sign in button");
	   
	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
	sendText(factory.signInPage().emailField,email);	
	sendText(factory.signInPage().passwordField,password);
	logger.info("user entered email and password");
	}
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on loggin button");
	   
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
	    Assert.assertTrue(isElementDisplayed(factory.homePage().accountDisplay));
	    logger.info("Account Option was display");
	}
	
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
	}
	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput, map.get(0).get("name"));
		sendText(factory.signInPage().emailInput, map.get(0).get("email"));
		sendText(factory.signInPage().passwordInput,map.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput, map.get(0).get("confirmPassword"));
		logger.info("User send the follow texts");
		
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signInButton);
		logger.info("User clicked on created account");
	    
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().newProfileText));
		logger.info("New profile text was displayed");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
