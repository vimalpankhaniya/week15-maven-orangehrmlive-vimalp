package com.organgehrmlive.demo.pages;

import com.organgehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy (id ="username")
    WebElement username;
    @CacheLookup
    @FindBy (name ="password")
    WebElement password;

    @CacheLookup
    @FindBy (xpath ="//button[@type ='submit']")
    WebElement LoginText;

    @CacheLookup
    @FindBy (xpath ="//h6[normalize-space()='Dashboard']")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy (xpath ="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")
    WebElement clickOnforgot;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
    WebElement resetText;
    
    public void enterUserName(String username1) {
        Reporter.log("enterUserNameField"+ username.toString());
        sendTextToElement(username,username1);
    }

    public void enterPassword(String password1) {
        Reporter.log("enterPasswordField"+ password.toString());
        sendTextToElement(password,password1);
    }
    public void clickOnSignInButton() {
        Reporter.log("clickOnSignOnButton"+ LoginText.toString());
        clickOnElement(LoginText);

}
    public String verifyText() {
        Reporter.log("verifyText "+ verifyMessage.toString());
        return getTextFromElement(verifyMessage);
    }
    public void clickOnForgot (){
        Reporter.log("clickOnForgot"+ clickOnforgot.toString());
        clickOnElement(clickOnforgot);
    }
    public String verifyResetText(){
        Reporter.log("verifyResetText"+ resetText.toString());
        return getTextFromElement(resetText);
    }
}