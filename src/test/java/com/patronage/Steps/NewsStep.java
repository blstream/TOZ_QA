package com.patronage.Steps;


import com.patronage.DriverFactory;
import com.patronage.Pages.DetailsOfNewsPage;
import com.patronage.Pages.MainPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewsStep extends DriverFactory implements En {

    String baseUrl = "http://dev.patronage2017.intive-projects.com/";

    MainPage mp = PageFactory.initElements(driver, MainPage.class);
    DetailsOfNewsPage donp = PageFactory.initElements(driver, DetailsOfNewsPage.class);
    WebDriverWait wait =  new WebDriverWait(driver, 5);

    public NewsStep(){

        Given("^User is on mainpage$", () -> {
            driver.get(baseUrl);
        });

        When("^User click on login tile$", () -> {
            mp.getLoginTile().click();
        });

        And("^User login with ([^\"]*) and ([^\"]*)$", ( String email, String password) -> {
            mp.getEmail().sendKeys(email);
            mp.getPassword().sendKeys(password);
            mp.getSubmit().click();
        });

        Then("^User should see news on the page$", () -> {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("VueCarousel-navigation")));

            for(int i=0; i < mp.getTitlesOfNews().size();i++) {
                Assert.assertFalse(mp.getTitlesOfNews().get(i).getText().equals(""));
                Assert.assertFalse(mp.getShortsDescriptionsOfNews().get(i).getText().equals(""));
               // Assert.assertNotNull(mp.getImagesOfNews().get(i));

                try {

                    WebElement rightNewsNavigator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("▶")));
                    rightNewsNavigator.click();
                }
                catch(TimeoutException ex)
                {
                    break;
                }
            }
        });

        And("^User clicked on the title of a news$", () -> {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("VueCarousel-navigation")));
            mp.getTitlesOfNews().get(0).click();
        });

        Then("^User should see details of news on the page$", () -> {
            wait.until(ExpectedConditions.visibilityOf(donp.getTitle()));
            Assert.assertNotEquals("", donp.getTitle().getText());
            Assert.assertNotEquals("", donp.getFullDescription().getText());
          //  Assert.assertNotNull(donp.getImageOfNews());
            Assert.assertNotNull(donp.getReturnLink());
        });

    };

}
