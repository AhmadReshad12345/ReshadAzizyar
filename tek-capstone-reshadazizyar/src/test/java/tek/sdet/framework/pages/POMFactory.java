package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homePage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;
	private RetailSignInPage signInPage;
	
	public POMFactory() {
		this.homePage=new RetailHomePage();
		this.accountPage= new RetailAccountPage();
		this.orderPage=new RetailOrderPage();
		this.signInPage= new RetailSignInPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}

	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	
	
	
}
