package com.karteladentare.steps.serenity;

import com.karteladentare.pages.LoginPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Granit Krasniqi
 * date: 7/17/2019
 * email: granitkrasniqi@outlook.com
 */
public class LoginEndUserSteps {

    LoginPage loginPage;

    @Step
    public void isOnLoginPage() {
        loginPage.open();
    }

    @Step
    public void tryToLoginWithUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Step
    public void seeUserDashboardPage() {
        assertThat(loginPage.containsText("Dashboard"), equalTo(true));
    }


}
