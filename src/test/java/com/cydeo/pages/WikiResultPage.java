package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiResultPage {

    public WikiResultPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[.='Steve Jobs'])[1]")
    public WebElement mainHeader;

    @FindBy(xpath = "//div[@class='fn']")
    public WebElement imageHeader;

    @FindBy()
    public WebElement image;


}
