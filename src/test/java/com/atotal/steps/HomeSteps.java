package com.atotal.steps;

import com.atotal.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("I am on home page")
    public void onHomePage() {
        homePage.navigateToHomePage();
    }

    @When("clicking on {string} button")
    public void clickingOnnButton(String btnName) {
        homePage.clickNavBarOption(btnName);
    }

}
