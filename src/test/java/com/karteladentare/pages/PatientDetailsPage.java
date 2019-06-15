package com.karteladentare.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class PatientDetailsPage extends PageObject {

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

    public WebElementFacade getNumriPersonal() {
        return numriPersonal;
    }

    public void setNumriPersonal(WebElementFacade numriPersonal) {
        this.numriPersonal = numriPersonal;
    }

    public WebElementFacade getEmri() {
        return emri;
    }

    public void setEmri(WebElementFacade emri) {
        this.emri = emri;
    }

    public WebElementFacade getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(WebElementFacade mbiemri) {
        this.mbiemri = mbiemri;
    }

    public WebElementFacade getGjiniaMashkull() {
        return gjiniaMashkull;
    }

    public void setGjiniaMashkull(WebElementFacade gjiniaMashkull) {
        this.gjiniaMashkull = gjiniaMashkull;
    }

    public WebElementFacade getGjiniaFemer() {
        return gjiniaFemer;
    }

    public void setGjiniaFemer(WebElementFacade gjiniaFemer) {
        this.gjiniaFemer = gjiniaFemer;
    }

    public WebElementFacade getDiteLindja() {
        return diteLindja;
    }

    public void setDiteLindja(WebElementFacade diteLindja) {
        this.diteLindja = diteLindja;
    }

    public WebElementFacade getNumriTelefonit() {
        return numriTelefonit;
    }

    public void setNumriTelefonit(WebElementFacade numriTelefonit) {
        this.numriTelefonit = numriTelefonit;
    }

    public WebElementFacade getEmail() {
        return email;
    }

    public void setEmail(WebElementFacade email) {
        this.email = email;
    }

    public WebElementFacade getAdresa() {
        return adresa;
    }

    public void setAdresa(WebElementFacade adresa) {
        this.adresa = adresa;
    }

    public WebElementFacade getShenimeTjera() {
        return shenimeTjera;
    }

    public void setShenimeTjera(WebElementFacade shenimeTjera) {
        this.shenimeTjera = shenimeTjera;
    }
}
