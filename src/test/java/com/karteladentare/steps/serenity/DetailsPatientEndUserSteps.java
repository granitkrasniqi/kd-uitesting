package com.karteladentare.steps.serenity;

import com.karteladentare.pages.PatientDetailsPage;
import com.karteladentare.pages.PatientsListPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DetailsPatientEndUserSteps {

    PatientsListPage patientsListPage;
    PatientDetailsPage patientDetailsPage;

    @Step
    public void isOnPatientsListPage() {
        patientsListPage.open();
    }

    @Step
    public void viewPatient(String numriPersonal){
        patientsListPage.viewDetails(numriPersonal);
    }

    @Step
    public void checkPersonalNumberField(String personalNumber) {
        System.out.println("Title " + patientDetailsPage.getTitle());
        assertThat(patientDetailsPage.getNumriPersonal().getValue(), equalTo(personalNumber));
    }
}
