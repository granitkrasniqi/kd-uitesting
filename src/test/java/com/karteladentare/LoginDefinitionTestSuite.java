package com.karteladentare;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * @author Granit Krasniqi
 * email: granitkrasniqi@outlook.com
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/Authentication.feature")
public class LoginDefinitionTestSuite {
}
