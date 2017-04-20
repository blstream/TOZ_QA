package com.patronage.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TOZObjectExample {

   @FindBy(how = How.ID , using = "zewnetrzny_kontener_stopki")
    private WebElement footer;

   public WebElement getFooter(){ return footer;}

}
