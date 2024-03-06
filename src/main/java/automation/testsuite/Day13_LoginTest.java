package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.constant.CT_Common;
import automation.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day13_LoginTest extends CommonBase {

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_rise_signin);
    }

    @Test(priority = 1)
    public void loginSuccess(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginFunction("admin@demo.com","riseDemo");
        Assert.assertTrue(webDriver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());
    }

    @Test(priority = 2)
    public void loginFailIncorrectEmail(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginFunction("incorrectEmail@demo.com","riseDemo");
        Assert.assertTrue(webDriver.findElement(CT_Account.LOGIN_FAIL_TEXT).isDisplayed());
    }

    @Test(priority = 3)
    public void loginFailIncorrectPassword(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginFunction("admin@demo.com","incorrectPassword");
        Assert.assertTrue(webDriver.findElement(CT_Account.LOGIN_FAIL_TEXT).isDisplayed());
    }

    @Test(priority = 4)
    public void loginFailIncorrectEmailAndPassword(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginFunction("incorrectEmail@demo.com","incorrectPassword");
        Assert.assertTrue(webDriver.findElement(CT_Account.LOGIN_FAIL_TEXT).isDisplayed());
    }
}
