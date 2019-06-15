package com.karteladentare.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("http://localhost:3000/#!/pacientet/listoPacientet")
public class PatientsListPage extends PageObject {

    @FindBy(id="numri-personal")
    private WebElementFacade numriPersonal;

    public WebElementFacade getNumriPersonal() {
        return numriPersonal;
    }


    public void setNumriPersonal(WebElementFacade numriPersonal) {
        this.numriPersonal = numriPersonal;
    }

    public void deletePatient(String patientPersonalNumber) {
        $("[deletepersonalnumber=\'" + patientPersonalNumber + "\']").click();
    }

    public void viewDetails(String patientPersonalNumber) {
        $("[shikopersonalnumber=\'" + patientPersonalNumber + "\']").click();
    }
}
