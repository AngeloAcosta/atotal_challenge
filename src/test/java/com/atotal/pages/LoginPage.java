package com.atotal.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By txtUsername = By.id("loginusername");
    private By txtPassword = By.id("loginpassword");
    private By btnLogin = By.cssSelector("button[onclick='logIn()']");
    private By btnLogout = By.id("logout2");

    public LoginPage() {
        super(driver);
    }

    private void enterUsername(String username) {
        sendKeys(txtUsername, username);
    }

    private void enterPassword(String password) {
        sendKeys(txtPassword, password);
    }

    private void clickLogin() {
        clickElement(btnLogin);
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public void logout() {
        clickElement(btnLogout);
    }

}
