package com.karteladentare.steps.serenity;

import com.karteladentare.pages.AddPatientPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddPatientEndUserSteps {

    AddPatientPage addPatientPage;

    @Step
    public void isAddPatientPage() {
        addPatientPage.open();
    }

    @Step
    public void entersData(String numriPersonal, String emri, String mbiemri, String gjinia, String diteLindja,
                             String numriTelefonit, String email, String adresa, String shenimeTjera) {
        addPatientPage.enterDetails(numriPersonal, emri, mbiemri, gjinia, diteLindja,
                numriTelefonit, email, adresa, shenimeTjera);
    }

    @Step
    public void regjistroPacientin() {
        addPatientPage.clickRegjisteroButton();
    }

    @Step
    public void shouldSeePatientsListPage() {
        assertThat(addPatientPage.containsAllText("Lista e Pacientëve"), equalTo(true));
    }


}
