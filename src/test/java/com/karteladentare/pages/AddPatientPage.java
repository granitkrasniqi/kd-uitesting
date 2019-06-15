package com.karteladentare.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://localhost:3000/#!/pacientet/shtoPacientin")
public class AddPatientPage extends PageObject {

    @FindBy(name="numriPersonal")
    private WebElementFacade numriPersonal;

    @FindBy(name="emri")
    private WebElementFacade emri;

    @FindBy(name="mbiemri")
    private WebElementFacade mbiemri;

    @FindBy(id="gjinia-mashkull")
    private WebElementFacade gjiniaMashkull;

    @FindBy(id="gjinia-femer")
    private WebElementFacade gjiniaFemer;

    @FindBy(name="diteLindja")
    private WebElementFacade diteLindja;

    @FindBy(name="numriTelefonit")
    private WebElementFacade numriTelefonit;

    @FindBy(name="email")
    private WebElementFacade email;

    @FindBy(name="adresa")
    private WebElementFacade adresa;

    @FindBy(name="shenimeTjera")
    private WebElementFacade shenimeTjera;

    @FindBy(id="regjistroButton")
    private WebElementFacade regjistroButton;


    public void enterDetails(String numriPersonal, String emri, String mbiemri, String gjinia, String diteLindja,
                            String numriTelefonit, String email, String adresa, String shenimeTjera) {
        this.numriPersonal.type(numriPersonal);
        this.emri.type(emri);
        this.mbiemri.type(mbiemri);

        if(gjinia.equalsIgnoreCase("mashkull")) {
            gjiniaMashkull.click();
        } else {
            gjiniaFemer.click();
        }


        this.diteLindja.type(diteLindja);
        this.numriTelefonit.type(numriTelefonit);
        this.email.type(email);
        this.adresa.type(adresa);
        this.shenimeTjera.type(shenimeTjera);
    }

    public void clickRegjisteroButton() {
        regjistroButton.click();
    }
}
