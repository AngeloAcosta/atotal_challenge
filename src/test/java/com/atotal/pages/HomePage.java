package com.atotal.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By lnkLogin = By.id("login2");
    private By lnkSignUp = By.id("signin2");
    private By lnkLoggedUser = By.id("nameofuser");

    public HomePage() {
        super(driver);
    }

    public void navigateToHomePage() {
        navigateTo("https://www.demoblaze.com/index.html");
    }

    public void clickNavBarOption(String btnName) {
        switch (btnName) {
            case "Log In":
                clickOption(lnkLogin);
                break;
            case "Sign Up":
                clickOption(lnkSignUp);
                break;
        }
    }

    private void clickOption(By element) {
        clickElement(element);
    }

    public String getUserNameTitle() {
        return getElementTitle(lnkLoggedUser);
    }

}
