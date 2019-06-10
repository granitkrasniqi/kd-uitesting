package com.karteladentare.steps;

import com.karteladentare.steps.serenity.AddPatientEndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddPatientDefinitionSteps {

    @Steps
    AddPatientEndUserSteps addPatientEndUserSteps;

    @Given("the user is on the add patient page")
    public void givenTheUserIsOnTheAddPatientPage() {
        addPatientEndUserSteps.isAddPatientPage();
    }

    @When("^the user creates a new patient with Personal Number (.*) and name (.*) and surname (.*) and gjinia (.*) and date of birth (.*) and telephone number (.*) and email (.*) and address (.*) and description (.*)$")
    public void whenTheUserCreatesAPatient(String numriPersonal, String emri, String mbiemri, String gjinia, String diteLindja,
                                           String numriTelefonit, String email, String adresa, String shenimeTjera) {
        addPatientEndUserSteps.entersData(numriPersonal, emri, mbiemri, gjinia, diteLindja, numriTelefonit, email, adresa, shenimeTjera);
        addPatientEndUserSteps.regjistroPacientin();
    }

    @Then("They should see the list of patients page")
    public void thenTheyShouldSeeListOfPatientsPage() {
        addPatientEndUserSteps.shouldSeePatientsListPage();
    }


}
