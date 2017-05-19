package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by marekpawlowski on 02/05/2017.
 */
public class login extends DriverFactory implements En {

    String baseUrl = "http://localhost:8080/";
    LoginPage mp = PageFactory.initElements(driver, LoginPage.class);

    public login() {
        Given("^User is on main page$", () -> {
            driver.get(baseUrl);
        });

        When("^User go to login page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(mp.getLoginTile()));
            mp.getLoginTile().click();
        });

        When("^User write ([^\"]*) and ([^\"]*)$", (String email,String password) -> {
        mp.getEmail().sendKeys(email);
        mp.getPassword().sendKeys(password);


        });

        When("^User press Ok button$", () -> {
            mp.getSubmit().click();
        });

        Then("^User is able to login$", () -> {


        });
        And("^User write wrong  ([^\"]*) and ([^\"]*)$", (String email,String password) -> {
            mp.getEmail().sendKeys(email);
            mp.getPassword().sendKeys(password);
        });
        Then("^User see login ([^\"]*)$", (String error) -> {
            String result = mp.getLoginError().getText();
            Assert.assertEquals(result, error);

        });


    }
}
