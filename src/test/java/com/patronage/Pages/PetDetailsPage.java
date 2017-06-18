package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.List;

public class PetDetailsPage {

    @FindBy(how = How.CLASS_NAME , using = "swiper-button-next")
    private WebElement nextImageBtn;

    @FindBy(how = How.CLASS_NAME , using = "swiper-button-prev")
    private WebElement prevImageBtn;

    @FindBy(how = How.CLASS_NAME , using = "swiper-pagination-current")
    private WebElement actualImageNumber;

    @FindBy(how = How.CLASS_NAME , using = "swiper-pagination-total")
    private WebElement totalImagesNumber;

    @FindBy(how = How.CLASS_NAME , using = "li-span-name")
    private WebElement nameLabel;

    @FindBy(how = How.CLASS_NAME , using = "li-span-dog")
    private WebElement typeLabel;

    @FindBy(how = How.CLASS_NAME , using = "li-span-sex")
    private WebElement sexLabel;

    @FindBy(how = How.CLASS_NAME , using = "helpLink")
    private WebElement helpLinkBtn;

    //1st - name , 2nd - type , 3rd - sex
    @FindBy(how = How.CSS , using = "h6")
    private List<WebElement> dataList;

    public WebElement getNextImageBtn() {return nextImageBtn;}
    public WebElement getPrevImageBtn() {return prevImageBtn;}
    public WebElement getActualImageNumber() {return actualImageNumber;}
    public WebElement getTotalImagesNumber() {return totalImagesNumber;}
    public WebElement getNameLabel() {return nameLabel;}
    public WebElement getTypeLabel() {return typeLabel;}
    public WebElement getSexLabel() {return sexLabel;}
    public WebElement getHelpLinkBtn() {return helpLinkBtn;}
    public List<WebElement> getDataList() {return dataList;}
}
