package com.patronage.Steps;

import com.patronage.Pages.NewsDetailsPage;
import cucumber.api.PendingException;
import org.openqa.selenium.JavascriptExecutor;
import com.patronage.DriverFactory;
import com.patronage.Pages.LoginPage;
import com.patronage.Pages.MainPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.enterprise.inject.New;

public class NewsStep extends DriverFactory implements En {

//    String baseUrl = "http://dev.patronage2017.intive-projects.com/";
    String baseUrl = "http://lowcost-env.aif4wengtg.eu-central-1.elasticbeanstalk.com/#/";
    MainPage mp = PageFactory.initElements(driver, MainPage.class);
    LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
    NewsDetailsPage ndp = PageFactory.initElements(driver, NewsDetailsPage.class);
    WebDriverWait wait =  new WebDriverWait(driver, 5);

    public NewsStep(){

        Given("^User is on mainpage$", () -> {
            driver.get(baseUrl);
        });

        When("^User click on login tile$", () -> {
            mp.getLoginTile().click();
        });

        And("^User login with ([^\"]*) and ([^\"]*)$", ( String email, String password) -> {
            lp.getEmail().sendKeys(email);
            lp.getPassword().sendKeys(password);
            lp.getSubmit().click();
        });

        Then("^User should see news on the page$", () -> {

           wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("panel-item")));

            for(int i=0; i < mp.getTitlesOfNews().size();i++) {

                Assert.assertFalse(mp.getTitlesOfNews().get(i).getText().equals(""));
                Assert.assertFalse(mp.getBodiesOfNews().get(i).getText().equals(""));
                Assert.assertFalse(mp.getDatesOfNews().get(i).getText().equals(""));
                Assert.assertFalse(mp.getDetailsOfNewsButtons().get(i).getText().equals(""));
                //Assert.assertNotNull(mp.getImagesOfNews().get(i));

                //delay to Presentation
                try {

                    Actions markText = new Actions(driver);

                    if( i!= 0)
                        markText.click(mp.getBodiesOfNews().get(i)).build().perform();


                    markText.doubleClick(mp.getBodiesOfNews().get(i)).doubleClick().build().perform();

                    Thread.sleep(2000);
                    JavascriptExecutor exe = (JavascriptExecutor) driver;
                    exe.executeScript("window.scrollBy(0,300)", "");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }


        });

        And("^User click on details button related to chosen news$", () -> {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("panel-item")));
            //Presentation
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mp.getDetailsOfNewsButtons().get(0).click();
        });

        Then("^User should see details of news$", () -> {

            wait.until(ExpectedConditions.visibilityOf(ndp.getNewsBody()));

            Assert.assertFalse(ndp.getNewsBody().getText().equals(""));
            Assert.assertFalse(ndp.getAddedDate().getText().equals(""));
            Assert.assertFalse(ndp.getNewsTitle().getText().equals(""));

            // Presentation
            try {
                Thread.sleep(2000);
                JavascriptExecutor exe = (JavascriptExecutor) driver;
                //scroll down to image
                exe.executeScript("window.scrollBy(0,300)", "");
                Thread.sleep(2000);
                //scroll down to body news
                exe.executeScript("window.scrollBy(0,200)", "");
                Thread.sleep(2000);
                //scroll down to bottom page
                exe.executeScript("window.scrollBy(0,1000)", "");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

    }

}
