package TSuites;

import org.testng.annotations.Test;
import pageobjects.*;

public class SiteMap_Common extends Base {

	@Test(priority = 0)
	public void validateHomePage() throws InterruptedException {
		HomePage HP = new HomePage();
		HP.isHomePage();
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void validateContactPage() throws InterruptedException {
		ContactPage CP = new ContactPage();
		CP.isContactPage();
		Thread.sleep(1000);
	}

	@Test(priority = -1)
	public void validateAboutPage() throws InterruptedException {
		AboutPage AP = new AboutPage();
		AP.isAboutPage();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void validateViewProducts() throws InterruptedException {
		ViewProductsPage VPP = new ViewProductsPage();
		VPP.isViewAllProductPage();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void validateAntipyreticsViewProducts() throws InterruptedException {
		ViewProductsPage VPP = new ViewProductsPage();
		VPP.isAntipyretics();
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void validateAnalgesicsViewProducts() throws InterruptedException {
		ViewProductsPage VPP = new ViewProductsPage();
		VPP.isAnalgesics();
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void validateAntibioticsViewProducts() throws InterruptedException {
		ViewProductsPage VPP = new ViewProductsPage();
		VPP.isAntibiotics();
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void validateSignupPage() throws InterruptedException {
		SignInPage SP = new SignInPage();
		SP.isSignInPage();
		Thread.sleep(1000);
	}

	@Test(priority = 8)
	public void validateLoginPage() throws InterruptedException {
		LogInPage LP = new LogInPage();
		LP.isLoginPage();
		Thread.sleep(1000);
	}

}
