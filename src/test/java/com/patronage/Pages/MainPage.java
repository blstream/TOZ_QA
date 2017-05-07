package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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





    public WebElement getEmail() {return email;}
    public WebElement getPassword() {return password;}
    public WebElement getSubmit() { return submit;}



}
