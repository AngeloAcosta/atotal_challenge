package com.atotal.runner;

import com.atotal.pages.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.atotal.steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {

    @BeforeClass
    public static void maximize() {
        BasePage.maximizeWindow();
    }

    @AfterClass
    public static void cleanDriver() {
        BasePage.closeBrowser();
    }
}
