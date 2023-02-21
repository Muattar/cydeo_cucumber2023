package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_OrderPage extends WT_BasePage{

    public WT_OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "product")
    public WebElement productDropdown;


    @FindBy(xpath = "//input[@ value='Visa']")
    public WebElement visaButton;


    @FindBy(xpath = "//input[@ value='MasterCard']")
    public WebElement masterCardButton;


    @FindBy(xpath = "//input[@ value='American Express'")
    public WebElement americanExpressButton;

}
