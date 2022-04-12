package com.qa.pages;

import com.qa.base.TestBase;
import com.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ManufacturingPage extends TestBase {

    public ManufacturingPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButton;

    @FindBy(xpath = "//div[@name='product_id']//input")
    private WebElement productName;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveButton;

    @FindBy(xpath = "//span[text()='Confirm']")
    private WebElement confirmButton;

    @FindBy(xpath = "(//span[text()='Mark as Done'])[2]")
    private WebElement markAsDone;

    @FindBy(xpath = "//span[text()='Ok']")
    private WebElement okButton;

    @FindBy(xpath = "//span[text()='Apply']")
    private WebElement applyButton;

    @FindBy(xpath = "//a[@name='product_id']//span")
    private WebElement getProductName;

    @FindBy(xpath = "//span[@name='product_uom_id']/span")
    private WebElement getQuantity;

    public void clickCreateButton()
    {
        TestUtil.explicitWaitElementToBeClickable(createButton,20);
        createButton.click();
    }

    public void enterProductName(String productText)
    {
        TestUtil.explicitWaitElementToBeClickable(productName,20);
        productName.sendKeys(productText);
        WebElement sugession=driver.findElement(By.xpath("//a[text()='"+productText+"']"));
        TestUtil.explicitWaitElementToBeClickable(sugession,20);
        sugession.click();

    }

    public void clickSaveButton() throws InterruptedException {
        TestUtil.explicitWaitElementToBeClickable(saveButton,20);
        saveButton.click();
        Thread.sleep(2000);
    }

    public void clickConfirmButton() throws InterruptedException {
        TestUtil.explicitWaitElementToBeClickable(confirmButton,20);
        TestUtil.javaScriptClick(confirmButton);
        Thread.sleep(2000);
    }

    public void clickMarkAsDoneButton()
    {
        TestUtil.explicitWaitElementToBeClickable(markAsDone,20);
        TestUtil.javaScriptClick(markAsDone);
    }

    public void clickOkButton()
    {
        TestUtil.explicitWaitElementToBeClickable(okButton,20);
        okButton.click();
    }

    public void clickApplyButton()
    {
        TestUtil.explicitWaitElementToBeClickable(applyButton,20);
        applyButton.click();
    }

    public void verifyProductName(String expectedProductName)
    {
        TestUtil.explicitWaitElementToBeClickable(getProductName,20);
        Assert.assertTrue(getProductName.getText().contains(expectedProductName));
    }

    public void verifyQuantity(String expectedQuantity)
    {
        Assert.assertTrue(getQuantity.getText().contains(expectedQuantity));
    }
}
