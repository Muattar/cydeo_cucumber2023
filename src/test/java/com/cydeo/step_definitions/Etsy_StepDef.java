package com.cydeo.step_definitions;

import com.cydeo.pages.Etsy_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDef {

    Etsy_Page etsy_page = new Etsy_Page();

    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com/");

    }

    @Then("user should se title is as expected")
    public void user_should_se_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        BrowserUtils.verifyTitle(expectedTitle);

    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {

        etsy_page.searchEtsyBox.sendKeys("Wooden Spoon");

    }

    @When("User clicks to Etsy search button")
    public void user_clicks_to_etsy_search_button() {

        etsy_page.searchEtsyButton.click();
    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        BrowserUtils.verifyTitle("Wooden spoon - Etsy");


    }

//test with Parameterization
    @When("User types {string} in the search box")
    public void user_types_in_the_search_box(String keyword) {

        etsy_page.searchEtsyBox.sendKeys(keyword);
    }

    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }



}
