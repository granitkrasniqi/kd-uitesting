package com.karteladentare.steps;

import com.karteladentare.steps.serenity.LoginEndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * @author Granit Krasniqi
 * date: 7/17/2019
 * email: granitkrasniqi@outlook.com
 */
public class LoginDefinitionSteps {

    @Steps
    LoginEndUserSteps loginEndUserSteps;

    @Given("^the user is on login page$")
    public void theUserIsOnLoginPage() throws Throwable {
        loginEndUserSteps.isOnLoginPage();
    }

    @When("^the user is logged in with username (.*) and password (.*)$")
    public void theUserIsLoggedInWithUsernameAndPassword(String username, String password)
            throws Throwable {
        loginEndUserSteps.tryToLoginWithUsernameAndPassword(username, password);
    }

    @Then("^the user should see system dashboard page$")
    public void theUserShouldSeeSystemDashboardPage() throws Throwable {
        loginEndUserSteps.seeUserDashboardPage();
    }
}
