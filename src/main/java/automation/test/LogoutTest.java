package automation.test;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.constant.CT_Common;
import automation.page.HomePage;
import automation.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogoutTest extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_rise_signin);
    }

    @Test
    public void logout(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginFunction("admin@demo.com","riseDemo");
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        HomePage homePage = new HomePage(webDriver);
        homePage.logoutFunction();
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        Assert.assertTrue(webDriver.findElement(CT_Account.SIGNIN_FORM).isDisplayed());
    }
}
