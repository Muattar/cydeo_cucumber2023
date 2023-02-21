package com.cydeo.step_definitions;

import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class WebTableLogin_stepdef {

    WT_LoginPage loginPage = new WT_LoginPage();

    @Given("user is on the web table app login page")
    public void user_is_on_the_web_table_app_login_page() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");

    }

    @When("user enters correct user name")
    public void user_enters_correct_user_name() {

        loginPage.inputUsername.sendKeys("Test");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {

        loginPage.inputPassword.sendKeys("Tester");
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {

        loginPage.loginButton.click();

    }

    @Then("user should see orders words in the URL")
    public void user_should_see_orders_words_in_the_url() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedInURL = "orders";

       Assert.assertTrue(actualURL.contains(expectedInURL));


    }


    @When("user enters {string} username and {string} password")
    public void user_Enters_Username_And_Password(String username, String password) {
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);


    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> credentials) {

       loginPage.inputUsername.sendKeys( credentials.get("username"));
       loginPage.inputPassword.sendKeys(credentials.get("password"));
    }

    WT_OrderPage orderPage = new WT_OrderPage();


    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {

        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        loginPage.login();

    }


    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {

        orderPage.orderLink.click();
        BrowserUtils.sleep(2);
    }

    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedProductOption){

  List<String> actualProductOptions = BrowserUtils.dropDownOptions_as_String(orderPage.productDropdown);

  Assert.assertEquals(actualProductOptions, expectedProductOption);

    }


    @Then("user sees Visa enabled payment option")
    public void userSeesVisaEnabledPaymentOption() {

        Assert.assertTrue(orderPage.visaButton.isEnabled());

    }

    @Then("user sees MasterCard enabled payment option")
    public void userSeesMasterCardEnabledPaymentOption() {

        Assert.assertTrue(orderPage.masterCardButton.isEnabled());

    }

    @Then("user sees American Express enabled payment option")
    public void userSeesAmericanExpressEnabledPaymentOption() {

        Assert.assertTrue(orderPage.americanExpressButton.isEnabled());

    }
}
