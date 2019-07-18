package com.karteladentare.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * @author Granit Krasniqi
 * email: granitkrasniqi@outlook.com
 */

@DefaultUrl("http://localhost:3000/#!/login")
public class LoginPage extends PageObject {

    @FindBy(id = "username")
    private WebElementFacade username;
    @FindBy(id = "password")
    private WebElementFacade password;
    @FindBy(id = "loginButton")
    private WebElementFacade loginButton;

    public WebElementFacade getUsername() {
        return username;
    }

    public void setUsername(WebElementFacade username) {
        this.username = username;
    }

    public WebElementFacade getPassword() {
        return password;
    }

    public void setPassword(WebElementFacade password) {
        this.password = password;
    }

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(WebElementFacade loginButton) {
        this.loginButton = loginButton;
    }

    public void enterUsername(String username) {
        this.username.type(username);
    }

    public void enterPassword(String password) {
        this.password.type(password);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }
}
