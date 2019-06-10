package com.karteladentare.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:3000/#!/pacientet/listoPacientet")
public class PatientsListPage extends PageObject {

    public void deletePatient(String patientPersonalNumber) {
        $("[deletepersonalnumber=\'" + patientPersonalNumber + "\']").click();
    }
}
