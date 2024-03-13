package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.constant.CT_Common;
import automation.page.LoginPageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day14_LoginTest extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_rise_signin);
    }

    // thanh cong
    @Test
    public void loginSuccessfully(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFunction("admin@demo.com","riseDemo");
        Assert.assertTrue(driver.findElement(CT_Account.DASHBOARD_TEXT).isDisplayed());

    }

    // that bai - sai format email
    @Test
    public void loginFail_emailFormatIncorrect(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFunction("email_format_error,@demo.com","riseDemo");
        Assert.assertTrue(driver.findElement(CT_Account.EMAIL_FORMAT_ERROR).isDisplayed());
    }

    // that bai - sai email
    @Test
    public void loginFail_emailIncorrect(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFunction("emailIncorrect@demo.com","riseDemo");
        Assert.assertTrue(driver.findElement(CT_Account.LOGIN_FAIL_TEXT).isDisplayed());
    }

    // that bai - khong nhap email
    @Test
    public void loginFail_emailEmpty(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFunction("","riseDemo");
        Assert.assertTrue(driver.findElement(CT_Account.EMAIL_EMPTY).isDisplayed());
    }

    // that bai - sai password
    @Test
    public void loginFail_passwordIncorrect(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFunction("admin@demo.com","riseDemoError");
        Assert.assertTrue(driver.findElement(CT_Account.LOGIN_FAIL_TEXT).isDisplayed());
    }

    // that bai - khong nhap password
    @Test
    public void loginFail_passwordEmpty(){
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFunction("admin@demo.com","");
        Assert.assertTrue(driver.findElement(CT_Account.PASSWORD_EMPTY).isDisplayed());
    }
}
