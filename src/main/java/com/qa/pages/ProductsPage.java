package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends TestBase {

    public ProductsPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='name']")
    private WebElement productName;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButton;

    @FindBy(xpath = "//label[text()='Unit of Measure']/following::button[1]")
    private WebElement unitOfMeasureButton;

    @FindBy(xpath = "(//label[text()='Unit of Measure'])[2]/following::td[1]/input")
    private WebElement unitOfMeasure;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButtonPopUp;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveButton;

    public void clickCreateButton()
    {
        TestUtil.explicitWaitElementToBeClickable(createButton,20);
        createButton.click();
    }

    public void enterProductName(String productText)
    {
        TestUtil.explicitWaitElementToBeClickable(productName,20);
        productName.sendKeys(productText);
    }

    public void clickUnitOfMeasureButton()
    {
        TestUtil.explicitWaitElementToBeClickable(unitOfMeasureButton,20);
        unitOfMeasureButton.click();
    }

    public void enterUnitOfMeasure(String measure)
    {
        TestUtil.explicitWaitElementToBeClickable(unitOfMeasure,20);
        unitOfMeasure.clear();
        unitOfMeasure.sendKeys(measure);
    }

    public void clickSaveButtonOnPopUp()
    {
        TestUtil.explicitWaitElementToBeClickable(saveButtonPopUp,20);
        saveButtonPopUp.click();
    }

    public void clickSaveButton()
    {
        TestUtil.explicitWaitElementToBeClickable(saveButton,20);
        saveButton.click();
    }
}
