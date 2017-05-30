package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by marekpawlowski on 02/05/2017.
 */

public class LoginPage {




    @FindBy(how = How.PARTIAL_LINK_TEXT , using = "Zaloguj")
    private WebElement loginTile;

     /* Login */

    @FindBy(how = How.CSS , using =("input[type='email']") )
    private WebElement email;

    @FindBy(how = How.CSS , using =("input[type='password']") )
    private WebElement password;

    @FindBy(how = How.CSS , using =("button[type='submit']") )
    private WebElement submit;

    /* Errors */

    @FindBy (how = How.XPATH, using =("//p[contains(text(),'Niepoprawny login i/lub hasło')]"))
    private WebElement loginError;





    public WebElement getEmail() {return email;}
    public WebElement getPassword() {return password;}
    public WebElement getSubmit() { return submit;}
    public WebElement getLoginTile() {return loginTile;}
    public WebElement getLoginError() {return  loginError;}



}
