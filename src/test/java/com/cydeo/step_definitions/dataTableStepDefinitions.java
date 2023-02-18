package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class dataTableStepDefinitions {

    @Then("user should see below list")
    public void user_should_see_below_list( List<String> fruitAndVegetables) {
        System.out.println(fruitAndVegetables);

        System.out.println(fruitAndVegetables.get(1));

    }


    @Then("user should see below list of pets")
    public void userShouldSeeBelowListOfPets(List<String> pets) {

        System.out.println("pets = " + pets);
        System.out.println("pets.get(5) = " + pets.get(5));


    }

    @Then("officer is able to see any data he wants")
    public void officer_is_able_to_see_any_data_he_wants(Map<String, String> driverInfo) {

        System.out.println("driverInfo = " + driverInfo);

        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"age\") = " + driverInfo.get("age"));
        System.out.println("driverInfo.size() = " + driverInfo.size());


    }

    @Given("user is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    DropDownsPage dropDownsPage = new DropDownsPage();

    @Then("user should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {


        List<String> actualMonth = BrowserUtils.dropDownOptions_as_String(dropDownsPage.monthDropDown);

        Assert.assertEquals(expectedMonth, actualMonth);

    }




}
