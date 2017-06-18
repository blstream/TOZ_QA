package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class FinancialSupportPage {

    @FindBy(how = How.CLASS_NAME , using = "transferDetails")
    private List<WebElement> transferDetails;

    @FindBy(how = How.CLASS_NAME , using = "btn")
    private WebElement returnButton;

    public List<WebElement> getTransferDetails() {return transferDetails;}
    public WebElement getReturnButton() {return returnButton;}

}
