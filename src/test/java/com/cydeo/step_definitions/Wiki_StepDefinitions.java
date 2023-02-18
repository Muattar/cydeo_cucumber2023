package com.cydeo.step_definitions;

import com.cydeo.pages.WikiResultPage;
import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wiki_StepDefinitions {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
       Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("User types {string} in the wiki search box")
    public void userSeesIsInTheWikiTitle(String searchValue) {

        wikiSearchPage.wikiSearchBox.sendKeys(searchValue);
    }


    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

        wikiSearchPage.wikiSearchButton.click();

    }

    @Then("User sees {string} is in the wiki title")
    public void userTypesInTheWikiSearchBox(String expectedInTitle) {

        BrowserUtils.verifyTitleContains(expectedInTitle);


    }


    WikiResultPage wikiResultPage = new WikiResultPage();

    @Then("User sees {string} is in the wiki main header")
    public void userSeesIsInTheWikiMainHeader(String headerExpectedText) {
        String actualHeaderText = wikiResultPage.mainHeader.getText();
        Assert.assertEquals(actualHeaderText, headerExpectedText);

    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedImageHeader) {

        Assert.assertEquals(wikiResultPage.imageHeader.getText(), expectedImageHeader);

    }
}
