package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryOverviewPage extends TestBase {

    public InventoryOverviewPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Products']")
    private WebElement products;

    @FindBy(xpath = "//a[text()='Products']")
    private WebElement productsLink;

    @FindBy(xpath = "//span[text()='Manufacturing']")
    private WebElement manufacturing;


    public void clickProducts()
    {
        TestUtil.explicitWaitElementToBeClickable(products,20);
        products.click();
    }

    public void clickProductsLink()
    {
        TestUtil.explicitWaitElementToBeClickable(productsLink,20);
        productsLink.click();
    }

    public void clickManufacturing()
    {
        TestUtil.explicitWaitElementToBeClickable(manufacturing,20);
        manufacturing.click();
    }


}
