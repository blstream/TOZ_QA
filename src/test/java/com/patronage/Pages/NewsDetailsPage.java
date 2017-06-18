package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewsDetailsPage {

    @FindBy(how = How.CSS , using = "u")
    private WebElement newsTitle;

    @FindBy(how = How.CSS , using = "p.text-left:nth-child(2)")
    private WebElement newsBody;

    @FindBy(how = How.CSS , using = "p.text-left.news-info")
    private WebElement addedDate;

    public WebElement getNewsTitle() {return newsTitle;}
    public WebElement getNewsBody() {return newsBody;}
    public WebElement getAddedDate() {return addedDate;}

}
