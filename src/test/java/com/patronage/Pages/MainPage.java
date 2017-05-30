package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by marekpawlowski on 02/05/2017.
 */

public class MainPage {

    @FindBy(how = How.ID , using ="login-btn")
    private WebElement loginTile;

    /* News */

    @FindBy (how = How.CLASS_NAME , using = "news-date")
    private List<WebElement> datesOfNews;

    @FindBy (how = How.CSS , using = "h2.news-title")
    private List<WebElement> titlesOfNews;

    @FindBy (how = How.CLASS_NAME , using = "news-image")
    private List<WebElement> imagesOfNews;

    @FindBy (how = How.CLASS_NAME , using = "news-body")
    private List<WebElement> bodiesOfNews;

    @FindBy (how = How.CLASS_NAME , using = "news-button")
    private List<WebElement> detailsOfNewsButtons;

    public List<WebElement> getDatesOfNews() { return datesOfNews;}
    public List<WebElement> getTitlesOfNews() { return titlesOfNews;}
    public List<WebElement> getImagesOfNews() { return imagesOfNews;}
    public List<WebElement> getBodiesOfNews() { return bodiesOfNews;}
    public List<WebElement> getDetailsOfNewsButtons() { return detailsOfNewsButtons;}


    public WebElement getLoginTile() { return loginTile;}
}