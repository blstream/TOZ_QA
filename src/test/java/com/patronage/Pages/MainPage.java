package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

/**
 * Created by marekpawlowski on 02/05/2017.
 */

public class MainPage {


    /* Login */

    @FindBy(how = How.CSS , using =("input[type='email']") )
    private WebElement email;

    @FindBy(how = How.CSS , using =("input[type='password']") )
    private WebElement password;

    @FindBy(how = How.CSS , using =("button[type='submit']") )
    private WebElement submit;

    @FindBy(how = How.PARTIAL_LINK_TEXT , using = "Zaloguj")
    private WebElement loginTile;

    /* News */

    @FindBy(how = How.CLASS_NAME , using = "div .column.news-container img")
    private List<WebElement> imagesOfNews;

    @FindBy(how = How.CSS , using = "div .column.news-container a")
    private List<WebElement> titlesOfNews;

    @FindBy(how = How.CSS , using = "div .column.news-container h4")
    private List<WebElement> shortsDescriptionsOfNews;

    public WebElement getEmail() {return email;}
    public WebElement getPassword() {return password;}
    public WebElement getSubmit() { return submit;}
    public WebElement getLoginTile() {return loginTile;}

    public List<WebElement> getImagesOfNews() {return imagesOfNews;}
    public List<WebElement> getTitlesOfNews() {return  titlesOfNews;}
    public List<WebElement> getShortsDescriptionsOfNews() {return shortsDescriptionsOfNews;}

}