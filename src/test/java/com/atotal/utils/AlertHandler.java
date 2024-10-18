package com.atotal.utils;

import com.atotal.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertHandler extends BasePage{

    public AlertHandler() {
        super(driver);
    }

    public String handleAlertPresence(AlertAction action) {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        if (alert != null) {
            switch (action) {
                case ACCEPT:
                    alert.accept();
                    break;
                case DISMISS:
                    alert.dismiss();
                    break;
                case GET_TEXT:
                    return alert.getText();
                default:
                    break;
            }
        }
        return null;
    }
}
