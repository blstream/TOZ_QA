package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class HelpPage {

    @FindBy(how = How.CLASS_NAME , using = "help-link")
    private List<WebElement> helpTiles;

    public WebElement getHelpTOZTile() {return helpTiles.get(0);}
    public WebElement getBecomeVolunteerTile() {return  helpTiles.get(1);}
    public WebElement getReturnToMainPageTile() { return helpTiles.get(2);}

}
