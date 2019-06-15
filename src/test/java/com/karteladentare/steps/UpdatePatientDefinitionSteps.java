package com.karteladentare.steps;

import com.karteladentare.steps.serenity.DetailsPatientEndUserSteps;
import com.karteladentare.steps.serenity.UpdatePatientEndUserSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import sun.security.util.PendingException;

public class UpdatePatientDefinitionSteps {

    @Steps
    UpdatePatientEndUserSteps updatePatientEndUserSteps;

    @Steps
    DetailsPatientEndUserSteps detailsPatientEndUserSteps;

    @When("^the user updates patient's with personal number (\\d+) name to \"([^\"]*)\" and surname to \"([^\"]*)\"$")
    public void the_user_updates_patient_s_with_id_name_to_and_surname_to(Long personalNumber, String name,
                                                                          String surname) throws Exception {
        updatePatientEndUserSteps.updatePatient(String.valueOf(personalNumber));
        updatePatientEndUserSteps.enterUpdateDetails(name, surname);
        updatePatientEndUserSteps.clickPerditesoButton();
    }


    @Then("^They should see that the patient's with personal number (\\d+) name is \"([^\"]*)\" and surname is \"([^\"]*)\"$")
    public void they_should_see_that_the_patient_s_name_and_surname_is_modified(Long personalNumber, String name, String surname) throws Exception {
        detailsPatientEndUserSteps.viewPatient(String.valueOf(personalNumber));
        detailsPatientEndUserSteps.checkNameAndSurname(name, surname);
    }
}
