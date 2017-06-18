package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class PetGalleryPage {

    //card-block - general block to pet

    @FindBy(how = How.CLASS_NAME , using = "card-title")
    private List<WebElement> petsNames;

    @FindBy(how = How.CLASS_NAME , using = "card-subtitle")
    private List<WebElement> petsTypes;

    @FindBy(how = How.CLASS_NAME , using = "card-img-top")
    private List<WebElement> petsImages;

    public List<WebElement> getPetsNames() {return petsNames;}
    public List<WebElement> getPetsTypes() {return petsTypes;}
    public List<WebElement> getPetsImages() {return petsImages;}

}
