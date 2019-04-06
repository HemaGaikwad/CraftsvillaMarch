package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pompages.CartPage;
import com.craftsvilla.pompages.EmbroidedSareesPage;
import com.craftsvilla.pompages.HomePage;
import com.craftsvilla.pompages.ProductDescriptionPage;
import com.craftsvilla.pompages.SareesPage;
import com.craftsvilla.pompages.SignInPage;

public class EmbroidedSareesScripts extends BaseTest
{
	
	HomePage hp = null;
	SareesPage sp = null;
	EmbroidedSareesPage ep = null;
	ProductDescriptionPage pd = null;
	CartPage cp = null;
	SignInPage sip= null;
	
	@Test
	public void TC_01_BuyEmbroidedSaree()
	{
		hp = new HomePage(driver);
		sp = new SareesPage(driver);
		ep = new EmbroidedSareesPage(driver);
		pd = new ProductDescriptionPage(driver);
		cp = new CartPage(driver);
		
		
		try
		{
			hp.goToSareesLink();
			sp.clickOnEmbroidedSareesLink();
			ep.goToProduct1538760092();
			pd.checkProductName("Craftsvilla Blue Color Silk Designer Resham Embroidery Saree");
			pd.clickOnBuyNow();
			cp.setFirstName("Hema");
			cp.setEmail("emailid");
			cp.setMobile("88676574654");
			
		}
		catch (Exception e)
		{
			
		}
		
	}

}
