package com.cydeo.step_definitions;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to create "pre" and "post condition"
  for all the scenarios and even steps*/
public class Hooks {

    //import the @Before coming from io.cucumber.java
    @Before
    public void setUpMethod(){
        System.out.println("--> @Before: Running Before each scenario");

    }

    @Before(value = "@login", order = 2)
    public void login_scenario_before(){
        System.out.println("--> @Before: Running Before each login scenario");

    }

/*
@After will be executed automatically after EVERY scenario in the project
 */
    @After
    public void tearDown(Scenario scenario){

        BrowserUtils.sleep(3);

        byte[] screenshot =((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());

        System.out.println("--> @After: Running after each scenario");
        Driver.closeDriver();
    }




}
