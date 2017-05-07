package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.MainPage;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by marekpawlowski on 02/05/2017.
 */
public class login extends DriverFactory implements En {

    String baseUrl = "http://localhost:8080/?#/";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);

    public login() {
        Given("^User is on main page$", () -> {
            driver.get(baseUrl);
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
        Then("^User see corresponding ([^\"]*)$", (String error) -> {

        });

    }
}
