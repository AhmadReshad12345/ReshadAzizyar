package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);

	}
	@FindBy(id="signinLink")
	public WebElement signInButton;
	
	@FindBy(id="accountLink")
	public WebElement accountDisplay;
	

	@FindBy(id="search")
	public WebElement allDepartments;
	
	@FindBy(xpath="//select//child::option")
	public WebElement allAvialable;
	
	@FindBy(xpath="//option[text()='Electronics']")
	public WebElement electronics;
	
	@FindBy(xpath="//option[text()='Computers']")
	public WebElement computers;
	
	@FindBy(xpath="//option[text()='Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath="//option[text()='Sports']")
	public WebElement sports;
	
	@FindBy(xpath="//option[text()='Automative']")
	public WebElement Automative;
	
	@FindBy(id="searchInput")
	public WebElement searchInput;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	
	@FindBy(xpath="//p[@class='products__name']")
	public WebElement avialbleItem;
	
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement quantity;
	
	@FindBy(id="addToCartBtn")
	public WebElement addToCartBtn;
	
	@FindBy(id="cartQuantity")
	public WebElement cartQuantity;
	
	
	
	
	
	@FindBy(id="proceedBtn")
	public WebElement proceedCheckOutBtn;
	@FindBy(id="addAddressBtn")
	public WebElement addAddressBtn;
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement addressAddedIcon;
	@FindBy(id="countryDropdown")
	public WebElement countrySelection;
	@FindBy(id="fullNameInput")
	public WebElement fullNameInputForAddress;
	@FindBy(id="streetInput")
	public WebElement streetInput;
	@FindBy(xpath="/html/body/div/div[3]/div[2]/div/div/form/div[3]/input")
	public WebElement phoneNumberInputForAddress;
	@FindBy(id="apartmentInput")
	public WebElement apartmentInput;
	@FindBy(id="cityInput")
	public WebElement cityInput;
	@FindBy(xpath="//select[@name='state']")
	public WebElement State;
	@FindBy(id="zipCodeInput")
	public WebElement zipCodeInput;
	@FindBy(id="addressBtn")
	public WebElement addedAddressbutton;
	@FindBy(id="addPaymentBtn")
	public WebElement addPaymentMethodLink;
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberInput;
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardInput;
	@FindBy(id="securityCodeInput")
	public WebElement securityCodeInput;
	@FindBy(id="paymentSubmitBtn")
	public WebElement paymentSubmitBtn;
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonthInput;
	@FindBy(id="expirationYearInput")
	public WebElement expirationYearInput;
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderdPlacedMessage;
	
	
	
	@FindBy(xpath="Apex Legends - 1,000 Apex Coins")
	public WebElement ApexItem;
	

	
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement electronicOnAllDeprt;
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement ComputersOnAllDepart;
	
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeOnAllDepart;;
	
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement sportOnAllDepart;;
	
	@FindBy(xpath="//span[text()='Automative']")
	public WebElement AutomativeonAllDepara;;
	
	
	@FindBy(id="hamburgerBtn")
	public WebElement hamburgerBtn;
	
	@FindBy(id="contentHeader")
	public WebElement shopByDepartment;
	
	
	@FindBy(xpath="//span[text()='TV & Video']")
	public WebElement tvAndVideo;
	
	@FindBy(xpath="//span[text()='Video Games']")
	public WebElement VideoGames;
	
	
	@FindBy(xpath="//span[text()='Accessories']")
	public WebElement accessoories;
	
	@FindBy(xpath="//span[text()='Networking']")
	public WebElement Networking;
	
	
	@FindBy(xpath="//span[text()='Smart Home Lightning']")
	public WebElement smartHomeLighting;
	
	@FindBy(xpath="//span[text()='Plugs and Outlets']")
	public WebElement plugsAndOutlets;
	
	
	@FindBy(xpath="//span[text()='Athletic Clothing']")
	public WebElement athleticClothing;
	
	@FindBy(xpath="//span[text()='Exercise & Fitness']")
	public WebElement exerciseAndFitness;
	
	
	
	@FindBy(xpath="//span[text()='Automative Parts & Accessories']")
	public WebElement automativePartsAccessories;
	
	@FindBy(xpath="//span[text()='MotorCycle & Powersports']")
	public WebElement motorCycleAndPowersports;
	
	
	
	
	
	
	
	
	
	
}
