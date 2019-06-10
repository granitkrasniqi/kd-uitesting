package com.karteladentare.steps.serenity;

import com.karteladentare.pages.PatientsListPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeletePatientEndUserSteps {

    PatientsListPage patientsListPage;


    @Step
    public void isOnPatientsListPage() {
        patientsListPage.open();
    }

    @Step
    public void deletePatient(String numriPersonal){
        patientsListPage.deletePatient(numriPersonal);
    }


    @Step
    public void shouldSeeDeleteListPageWithoutPatientWithPersonalNumber(String personalNumber) {
        assertThat(patientsListPage.containsAllText("Lista e Pacientëve"), equalTo(true));
        assertThat(patientsListPage.containsAllText(personalNumber), equalTo(false));
    }
}
