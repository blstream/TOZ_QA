package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.FinancialSupportPage;
import com.patronage.Pages.HelpPage;
import com.patronage.Pages.MainPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SupportStep extends DriverFactory implements En {

    MainPage mp = PageFactory.initElements(driver, MainPage.class);
    HelpPage hp = PageFactory.initElements(driver, HelpPage.class);
    FinancialSupportPage fsp = PageFactory.initElements(driver, FinancialSupportPage.class);
    WebDriverWait wait =  new WebDriverWait(driver, 5);

    public SupportStep() {

        When("^User click on help tile$", () -> {

            //Presentation
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mp.getHelpTile().click();
        });

        And("^User click on Support TOZ financial$", () -> {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("help-link")));

            //Presentation
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            hp.getHelpTOZTile().click();
        });

        Then("^User should see financial details$", () -> {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("transfer-data")));

            Assert.assertTrue(fsp.getTransferDetails().get(0).getText().equals("TOZ Szczecin"));
            Assert.assertTrue(fsp.getTransferDetails().get(1).getText().equals("ul. Ojca Beyzyma 17/1"));
            Assert.assertTrue(fsp.getTransferDetails().get(2).getText().equals("70-391 Szczecin"));
            Assert.assertTrue(fsp.getTransferDetails().get(3).getText().equals("Polska"));
            Assert.assertTrue(fsp.getTransferDetails().get(4).getText().equals("Bank PKO"));
            Assert.assertTrue(fsp.getTransferDetails().get(5).getText().equals("61 1090 1014 0000 0712 1981 2874"));

            //Presentation
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }
}
