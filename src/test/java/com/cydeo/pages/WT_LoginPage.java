package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_LoginPage {

   public WT_LoginPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//input[@name='username']")
   public WebElement inputUsername;

   @FindBy(xpath = "//input[@name='password']")
   public WebElement inputPassword;

   @FindBy(xpath = "//button[.='Login']")
   public WebElement loginButton;


   //this method will log in with below credentials
   //username: Test
   //password: Tester

public void login(){
   this.inputUsername.sendKeys("Test");
   this.inputPassword.sendKeys("Tester");
   this.loginButton.click();
}

//This method will login with credentials that are provided in the method at the time of calling it
   //user, pass
   public void login(String user, String pass){
      this.inputUsername.sendKeys(user);
      this.inputPassword.sendKeys(pass);
      this.loginButton.click();
   }


}
