package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefinitions {

    @Given("user is on the login page of the library application")
    public void user_is_on_the_login_page_of_the_library_application() {

        System.out.println("Given user is on the login page of the library application");

    }

    @Then("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");

    }

    @Then("user enters librarian password")
    public void user_enters_librarian_password() {

        System.out.println("User enters librarian password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_te_dashboard() {
        System.out.println("User sees the dashboard");

    }


    @And("user enters student password")
    public void user_Enters_Student_Password() {
        System.out.println("User enters student username");


    }

    @Then("user enters student username")
    public void user_Enters_Student_Username() {
        System.out.println("User enters student password");

    }

    @Then("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("User enters admin username.");

    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("User enters admin password.");
    }
}
