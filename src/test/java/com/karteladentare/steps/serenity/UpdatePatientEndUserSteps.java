package com.karteladentare.steps.serenity;

import com.karteladentare.pages.PatientDetailsPage;
import com.karteladentare.pages.PatientUpdatePage;
import com.karteladentare.pages.PatientsListPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class UpdatePatientEndUserSteps {

    PatientsListPage patientsListPage;
    PatientUpdatePage patientUpdatePage;

    @Step
    public void isOnPatientsListPage() {
        patientsListPage.open();
    }

    @Step
    public void updatePatient(String numriPersonal){
        patientsListPage.updatePatient(numriPersonal);
    }

    @Step
    public void enterUpdateDetails(String emri, String mbiemri) {
        patientUpdatePage.enterUpdateDetails(emri, mbiemri);
    }

    @Step
    public void clickPerditesoButton() {
        patientUpdatePage.clickPerditesoButton();
    }

    @Step
    public void checkPersonalNumberField(String personalNumber) {
        System.out.println("Title " + patientUpdatePage.getTitle());
        assertThat(patientUpdatePage.getNumriPersonal().getValue(), equalTo(personalNumber));
    }
}
