package com.organgehrmlive.demo.testsuit;

import com.organgehrmlive.demo.pages.HomePage;
import com.organgehrmlive.demo.pages.LoginPage;
import com.organgehrmlive.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt1() {
        homePage = new HomePage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnSignInButton();
        String expected = "Dashboard";
        Assert.assertEquals(loginPage.verifyText(), "Dashboard", "not verify");

    }

    @Test (groups = {"smoke", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgot();
        Assert.assertEquals(loginPage.verifyResetText(), "Reset Password", "not verify");
    }


}

