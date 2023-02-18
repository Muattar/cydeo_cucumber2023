package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    /*
   This method will except integer in second and execute
         Thread.sleep method for given duration
         Arg: int argument

    */
    public  static void sleep(int second){
        second *= 1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle){

        //return and store all window handles in a Set
        Set<String> allWindowHandle = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandle) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current url: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        // Assert: Title contains “in browse”

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains( expectedInTitle));

    }


    public static void verifyTitle( String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void verifyTitleContains( String expectedInTitle){


        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));

    }
    //---------------------------------------------------------------------

    /*/
    This method accepts WebElement target
       and waits for that WebElement not to be displayed on the page
     */
    public static void waitForInvisibilityOf(WebElement target){
        //create the object of "WebDriverWait" class and set up the constructor argument
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the wait object with the proper syntax to create explicit wait conditions
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    //----------------------------------------------------------------------------
      /*
      This method accepts String title
         and waits for that Title contains given String value
       */

    public static void waitForTitleContains(String title) {
        //create the object of "WebDriverWait" class and set up the constructor argument
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the wait object with the proper syntax to create explicit wait conditions
        wait.until(ExpectedConditions.titleContains(title));

    }

  //--------------------------------------------------------------------------------

    /*
    This method accepts a dropdown element and returns a List<String> that contains all options value as String
    @param dropDownElement
    @return actualMonth_as_String

     */
    public static List<String> dropDownOptions_as_String(WebElement dropDonElement){


        Select month = new Select(dropDonElement);

        //Storing all the Actual options intro List of WebElement
        List<WebElement>actualMonth_asWebElement = month.getOptions();

        //Create an EMPTY list of String  to store <option> as String
        List<String> actualMonth_as_String = new ArrayList<>();


        //Looping through the List of WebElement getting, all options and storing them into List<String>
        for (WebElement each : actualMonth_asWebElement) {

            actualMonth_as_String.add(each.getText());
        }

        return actualMonth_as_String;

    }

}
