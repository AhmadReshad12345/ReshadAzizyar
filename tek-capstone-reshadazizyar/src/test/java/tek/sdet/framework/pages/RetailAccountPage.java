package tek.sdet.framework.pages;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	


	@FindBy(xpath="//h1[text()='Your Profile']")
	public WebElement newProfileText;
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="phoneNumberInput")
	public WebElement phoneNumberField;

	@FindBy(id="personalUpdateBtn")
	public WebElement updateButton;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement personalinformationUpdatedPopup;
	
	
	
	@FindBy(id="previousPasswordInput")
	public WebElement previousPassword;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPasswordInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement changePasswordPopUp;
	
	
	
	@FindBy(xpath="//p[text()='Add a payment method']")
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
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement cardAddedPopUp;
	
	
	
	@FindBy(xpath="//div//child::p[@class='account__payment-sub-title']")
	public WebElement ClickOnCardToEdit;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement Edit;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement cardupdatedPopUp;
	
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement remove;
	
	@FindBy(xpath="//div[@class='account__payment-image-wrapper']//child::img[@alt='Master Card']")
	public WebElement masterCardImage;

	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement addressAddedIcon;
	@FindBy(id="countryDropdown")
	public WebElement countrySelection;
	@FindBy(id="fullNameInput")
	public WebElement fullNameInputForAddress;
	@FindBy(id="streetInput")
	public WebElement streetInput;
	@FindBy(xpath="//div[@class='account__address-new-padding']/*[@id='phoneNumberInput']")
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
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressAddedPopUp;
	
	
	@FindBy(xpath="//button[text()='Edit']")
	
	public WebElement editAddressOption;
	
	@FindBy(xpath="//button[text()='Update Your Address']")
	public WebElement updateAddressButton;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdatePopUp;
	

	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeAddress;
	
	
}
