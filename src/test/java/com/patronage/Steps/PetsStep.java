package com.patronage.Steps;

import com.patronage.DriverFactory;
import com.patronage.Pages.MainPage;
import com.patronage.Pages.PetDetailsPage;
import com.patronage.Pages.PetGalleryPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetsStep extends DriverFactory implements En {

    MainPage mp = PageFactory.initElements(driver, MainPage.class);
    PetGalleryPage pgp = PageFactory.initElements(driver, PetGalleryPage.class);
    PetDetailsPage pdp = PageFactory.initElements(driver, PetDetailsPage.class);

    WebDriverWait wait =  new WebDriverWait(driver, 5);

    public PetsStep() {

        When("^User click on gallery tile$", () -> {
            mp.getPetGalleryTile().click();
        });

        And("^User click on chosen pet$", () -> {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-block")));
            //Presentation
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            pgp.getPetsImages().get(1).click();

        });

        Then("^user should see pet details$", () -> {
            wait.until(ExpectedConditions.visibilityOf(pdp.getNameLabel()));

            //Labels
            Assert.assertTrue(pdp.getNameLabel().getText().equals("Imię"));
            Assert.assertTrue(pdp.getTypeLabel().getText().equals("Typ"));
            Assert.assertTrue(pdp.getSexLabel().getText().equals("Płeć"));

            //Pet Details
            Assert.assertFalse(pdp.getDataList().get(0).getText().equals(""));
            Assert.assertTrue(pdp.getDataList().get(1).getText().equals("DOG") || pdp.getDataList().get(1).getText().equals("CAT"));
            Assert.assertTrue(pdp.getDataList().get(2).getText().equals("MALE") || pdp.getDataList().get(2).getText().equals("FEMALE"));

            // Presentation

            //scroll to Image
            JavascriptExecutor exe = (JavascriptExecutor) driver;
            exe.executeScript("window.scrollBy(0,100)", "");

            //Show all Images
            for(int i=1; i < Integer.parseInt(pdp.getTotalImagesNumber().getText());i++){
                pdp.getNextImageBtn().click();
                //Sleep
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            //scroll to bottom of the page
            exe.executeScript("window.scrollBy(0,1000)", "");
            try {
                Thread.sleep(2000);
                pdp.getHelpLinkBtn().click();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /* End Presentation */

        });



    }
}
