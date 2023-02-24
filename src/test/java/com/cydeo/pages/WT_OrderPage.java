package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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


    @FindBy(xpath = "//input[@ value='American Express']")
    public WebElement americanExpressButton;


    @FindBy(name = "card")
    public List<WebElement> cardTypes;


  //--------------------------------------------------------


    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityInput;


    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement NameInput;


    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetInput;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInput;


    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateInput;


    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipInput;


    @FindBy(name = "cardNo")
    public WebElement cardNoInput;

    @FindBy(name = "cardExp")
    public WebElement expireDateInput;


    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderButton;


















}
