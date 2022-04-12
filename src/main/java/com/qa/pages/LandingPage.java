package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends TestBase {

    public LandingPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Inventory']")
    private WebElement inventory;

    @FindBy(xpath = "(//a[text()='Inventory'])[1]")
    private WebElement logo;

    public void clickInventory()
    {
        TestUtil.explicitWaitElementToBeClickable(inventory,20);
        inventory.click();
    }

    public void clickInventoryLogo()
    {
        TestUtil.explicitWaitElementToBeClickable(logo,20);
        logo.click();
    }

}
