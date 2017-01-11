package com.GDocs.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 11/27/2016.
 */
public class GDocsPage {

    @FindBy(xpath = "id('Email')")
    private WebElement username;

    public WebElement getUsername() {
        return username;
    }

    @FindBy(xpath = "id('next')")
    private WebElement NextButton;

    public WebElement getNextButton() {
        return NextButton;
    }

    @FindBy(xpath = "id('Passwd')")
    private WebElement Password;

    public WebElement getPassword() {
        return Password;
    }

    @FindBy(xpath = "id('signIn')")
    private WebElement SignInButton;

    public WebElement getSignInButton() {
        return SignInButton;
    }

    @FindBy (className = "gb_0b")
    private WebElement menuButton;

    public WebElement getMenuButton() {
        return menuButton;
    }
    @FindBy (xpath = "//*[@id=\":2\"]/div/div/div[2]")
    private WebElement slideDoc;

    public WebElement getSlideDoc() {
        return slideDoc;
    }
    @FindBy (xpath = "//*[@id=\":1a\"]/div[1]")
    private WebElement newSlide;

    public WebElement getNewSlide() {
        return newSlide;
    }


    @FindBy (xpath = "//*[@id=\"docs-file-menu\"]")
    private WebElement fileMenu;

    public WebElement getFileMenu() {
        return fileMenu;
         }

         @FindBy (xpath = "//*[@id=\":82\"]")
    private WebElement downloadSubMenu;

    public WebElement getDownloadSubMenu() {
        return downloadSubMenu;
    }

}
