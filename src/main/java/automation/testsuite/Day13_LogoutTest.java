package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.constant.CT_Common;
import automation.page.HomePage;
import automation.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day13_LogoutTest extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_rise_signin);
    }

    @Test
    public void logout(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFunction("admin@demo.com","riseDemo");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        HomePage homePage = new HomePage(driver);
        homePage.logoutFunction();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        Assert.assertTrue(driver.findElement(CT_Account.SIGNIN_FORM).isDisplayed());
    }
}
