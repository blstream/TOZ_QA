package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DetailsOfNewsPage {

    @FindBy(how = How.CSS , using = "div > h1")
    private WebElement title;

    @FindBy(how = How.CSS , using = "div > h3")
    private WebElement fullDescription;

    @FindBy(how = How.PARTIAL_LINK_TEXT , using = "Powrót")
    private WebElement returnLink;

    @FindBy(how = How.CLASS_NAME , using = "img-fluid")
    private WebElement imageOfNews;

    public WebElement getTitle(){ return title;}
    public WebElement getFullDescription(){ return fullDescription;}
    public WebElement getReturnLink() { return returnLink;}
    public WebElement getImageOfNews() { return imageOfNews;}
}

