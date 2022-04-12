package com.qa.testcases;

import com.qa.pages.*;
import com.qa.util.TestUtil;
import org.testng.annotations.*;

import com.qa.base.TestBase;

import java.io.IOException;

public class AddProductsTest extends TestBase{
	LandingPage landingPage;
	LoginPage loginPage;
	InventoryOverviewPage inventoryOverviewPage;
	ProductsPage productsPage;
	ManufacturingPage manufacturingPage;
	static String productName="";

	public AddProductsTest(){
		super();
	}
	
	@BeforeClass
	public void setUp(){
		initialization();
		landingPage=new LandingPage();
		loginPage=new LoginPage();
		inventoryOverviewPage=new InventoryOverviewPage();
		productsPage=new ProductsPage();
		manufacturingPage=new ManufacturingPage();
	}

	@Test
	public void LoginTest() throws IOException, InterruptedException {


		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		landingPage.clickInventory();
		inventoryOverviewPage.clickProducts();
		inventoryOverviewPage.clickProductsLink();
		productsPage.clickCreateButton();
		productName=prop.getProperty("productName")+ TestUtil.gerRandomString(4);
		productsPage.enterProductName(productName);
		productsPage.clickUnitOfMeasureButton();
		productsPage.enterUnitOfMeasure(prop.getProperty("quantity"));
		productsPage.clickSaveButtonOnPopUp();
		productsPage.clickSaveButton();

		landingPage.clickInventoryLogo();
		inventoryOverviewPage.clickManufacturing();
		manufacturingPage.clickCreateButton();
		manufacturingPage.enterProductName(productName);
		manufacturingPage.clickSaveButton();
		manufacturingPage.clickConfirmButton();
		manufacturingPage.clickMarkAsDoneButton();
		manufacturingPage.clickOkButton();
		manufacturingPage.clickApplyButton();
		manufacturingPage.verifyProductName(productName);
		manufacturingPage.verifyQuantity(prop.getProperty("quantity"));


	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
