package com.atotal.steps;

import com.atotal.pages.HomePage;
import com.atotal.pages.LoginPage;

import com.atotal.utils.AlertAction;
import com.atotal.utils.AlertHandler;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;


public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AlertHandler alertHandler = new AlertHandler();

    @And("I login with {string} and {string}")
    public void iLoginWithAnd(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("I should see login home page with {string}")
    public void iShouldSeeLoginHomePage(String username) {
        String expectedWelcome = "Welcome " +username;
        String actualLnk = homePage.getUserNameTitle();
        Assert.assertEquals(actualLnk,expectedWelcome);
    }

    @And("I should be able to log out")
    public void iShouldBeAbleToLogOut() {
        loginPage.logout();
    }

    @Then("an alert should be present with {string}")
    public void anAlertShouldBePresentWith(String alertMessage) {
        Assert.assertEquals(alertHandler.handleAlertPresence(AlertAction.GET_TEXT), alertMessage);
    }

    @And("I press accept button")
    public void iPressAcceptButton() {
        alertHandler.handleAlertPresence(AlertAction.ACCEPT);
    }
}
