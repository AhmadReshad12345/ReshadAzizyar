package tek.sdet.framework.steps;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;


public class HomeSteps extends CommonUtility{
	// all your step definitions classes will extends 
	// CommonUtility class
	// we need to create object of POMFactory class
	// PomFactory instance should be on top of the class 
	POMFactory factory = new POMFactory();
	

	@When("User click on All section")
	public void userClickOnAllSection() {

	    
	    click(factory.homePage().hamburgerBtn);
	    logger.info("User clicked on All departments");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	    List<List<String>> list = dataTable.asLists(String.class);
	    

	    
	    if(list.get(0).get(0).equals(getElementText(factory.homePage().electronicOnAllDeprt)) && 
	    		list.get(0).get(1).equals(getElementText(factory.homePage().ComputersOnAllDepart)) &&
	    		list.get(0).get(2).equals(getElementText(factory.homePage().smartHomeOnAllDepart)) && 
	    		list.get(0).get(3).equals(getElementText(factory.homePage().sportOnAllDepart)) &&
	    		list.get(0).get(4).equals(getElementText(factory.homePage().AutomativeonAllDepara))){ 
	    
	    	 Assert.assertTrue(true);
	    } else {
	    	 Assert.assertTrue(false);
	    }
	    logger.info("Options are present"); 
	    
	}  
	    		
	
		@When("User click on All department")
		public void hamburgerBtn() {
			click(factory.homePage().hamburgerBtn);
			logger.info("User clicked on all department");
		}
		
		
		
		@When("User on {string}")
		public void userOnElectronics(String department) {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().shopByDepartment));
		 logger.info("User is on "+department); 
		}
		
		
		@Then("below options are present in department")
		public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> list = dataTable.asLists(String.class);
		
		String electronic ="Electronics";
		String computer = "Computers";
		String smartHome = "Smart Home";
		String sports="Sports";
		String automative="Automotive";
		
			if(electronic.equals(getElementText(factory.homePage().electronicOnAllDeprt))) {
				click(factory.homePage().electronicOnAllDeprt);
			if(list.get(0).get(0).equals(getElementText(factory.homePage().tvAndVideo))
			&& list.get(0).get(1).equals(getElementText(factory.homePage().VideoGames))) {
			 Assert.assertTrue(true);
				}
			}
		
			else if(computer.equals(getElementText(factory.homePage().ComputersOnAllDepart))) {
			click(factory.homePage().ComputersOnAllDepart);
				if(list.get(1).get(0).equals(getElementText(factory.homePage().accessoories))
				 && list.get(1).get(1).equals(getElementText(factory.homePage().Networking))) {
				 Assert.assertTrue(true);
			}
		} 
			
			else if(smartHome.equals(getElementText(factory.homePage().smartHomeOnAllDepart))) {
			click(factory.homePage().ComputersOnAllDepart);
			if(list.get(2).get(0).equals(getElementText(factory.homePage().smartHomeLighting))
			&& list.get(2).get(1).equals(getElementText(factory.homePage().plugsAndOutlets))) {
				Assert.assertTrue(true);
			}
		} 
			
			else if(sports.equals(getElementText(factory.homePage().sportOnAllDepart))) {
			click(factory.homePage().ComputersOnAllDepart);
			if(list.get(3).get(0).equals(getElementText(factory.homePage().athleticClothing))
			&& list.get(3).get(1).equals(getElementText(factory.homePage().exerciseAndFitness))) {
				Assert.assertTrue(true);
			}
		} 
			
		else if(automative.equals(getElementText(factory.homePage().AutomativeonAllDepara))) {
			click(factory.homePage().ComputersOnAllDepart);
			if(list.get(4).get(0).equals(getElementText(factory.homePage().Automative))
					  && list.get(4).get(1).equals(getElementText(factory.homePage().motorCycleAndPowersports))) {
				 Assert.assertTrue(true);
			}
		} else {
			Assert.assertTrue(false);
			
		}
			logger.info("below options are present in department");
			
		}
	
	

	
	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
	    selectByVisibleText(factory.homePage().allDepartments,string);
	    logger.info("User select the SmartHome option");
	}
	@Then("User search for an item {string}")
	public void userSearchForAnItem(String string) {
	    sendText(factory.homePage().searchInput,string);
	    logger.info("User send the value to search input");
	}
	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
	   click(factory.homePage().searchBtn);
	   logger.info("User clicked on serach Button");
	}
	@Then("User click on item")
	public void userClickOnItem() {
	    click(factory.homePage().avialbleItem);
	    logger.info("User clicked on item");
	}
	@Then("User select quantity {string}")
	public void userSelectQuantity(String string) {
	    selectByVisibleText(factory.homePage().quantity,string);
	    logger.info("User selected 2 for quantity");
	}
	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
	    click(factory.homePage().addToCartBtn);
	    logger.info("User clicked on add cart button");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
	    if(getElementText(factory.homePage().cartQuantity).equals(string)) {
	    	Assert.assertTrue(true);
	    } else {
	    	Assert.assertTrue(false);
	    }
	    logger.info("Quantity changed and matched");
	}
	
	
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	   click(factory.homePage().cartQuantity);
	   logger.info("Order");
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().proceedCheckOutBtn);
	    logger.info("User clicked on proceddChechoutButtn");
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	   click(factory.homePage().addAddressBtn);
	   logger.info("User clicked on addAddressbtn");
	}
	
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    click(factory.homePage().addPaymentMethodLink);
	    logger.info("User clicked on addPaymentMethod");
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	   click(factory.homePage().placeOrderBtn);
	   logger.info("User clicked on placed ordered button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
	    if(getElementText(factory.homePage().orderdPlacedMessage).equals(string)) {
	    	Assert.assertTrue(true);
	    } else {
	    	Assert.assertTrue(false);
	    }
	    logger.info("Message was displayed");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
