package com.karteladentare.steps;

import com.karteladentare.steps.serenity.DetailsPatientEndUserSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DetailsPatientDefinitionSteps {

    @Steps
    DetailsPatientEndUserSteps detailsPatientEndUserSteps;

    @Given("^the user in on the patients list pages$")
    public void theUserIsOnThePatientsListPage() throws Throwable {
        detailsPatientEndUserSteps.isOnPatientsListPage();
    }

    @When("^the user wants to see details of patient with personal number (.*)$")
    public void theUserDeletesPatientWithPersonalNumberInTheTable(String numriPersonal) throws Throwable {
        detailsPatientEndUserSteps.viewPatient(numriPersonal);
    }

    @Then("^They should see the patient's with personal number (.*) details page$")
    public void theyShouldSeeThePatientsDetailsPage(String numriPersonal) throws Throwable {
        detailsPatientEndUserSteps.checkPersonalNumberField(numriPersonal);
    }
}
