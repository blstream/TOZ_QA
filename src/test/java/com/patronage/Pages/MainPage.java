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

    @FindBy (how = How.CSS , using = "p.float-right")
    private List<WebElement> datesOfNews;

    @FindBy (how = How.CSS , using = "h4.news-title")
    private List<WebElement> titlesOfNews;

    @FindBy (how = How.CLASS_NAME , using = "img-fluid")
    private List<WebElement> imagesOfNews;

    @FindBy (how = How.CSS , using = "p.float-left")
    private List<WebElement> bodiesOfNews;

    @FindBy (how = How.CLASS_NAME , using = "news-button")
    private List<WebElement> detailsOfNewsButtons;

    @FindBy (how = How.PARTIAL_LINK_TEXT , using = "Galeria")
    private WebElement petGalleryTile;

    @FindBy (how = How.PARTIAL_LINK_TEXT , using = "Grafik")
    private WebElement scheduleTile;

    @FindBy (how = How.PARTIAL_LINK_TEXT , using = "Pomoc")
    private WebElement helpTile;

    public List<WebElement> getDatesOfNews() { return datesOfNews;}
    public List<WebElement> getTitlesOfNews() { return titlesOfNews;}
    public List<WebElement> getImagesOfNews() { return imagesOfNews;}
    public List<WebElement> getBodiesOfNews() { return bodiesOfNews;}
    public List<WebElement> getDetailsOfNewsButtons() { return detailsOfNewsButtons;}


    public WebElement getLoginTile() { return loginTile;}
    public WebElement getPetGalleryTile() {return petGalleryTile;}
    public WebElement getScheduleTile() {return scheduleTile;}
    public WebElement getHelpTile() {return helpTile;}

}