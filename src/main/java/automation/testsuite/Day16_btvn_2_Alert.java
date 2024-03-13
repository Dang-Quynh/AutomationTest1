package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.Alada_CT_Account;
import automation.constant.CT_Account;
import automation.constant.CT_Common;
import automation.page.Day14h_SigninPageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day16_btvn_2_Alert extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_seleniumpractise_alert);
    }

    @Test(priority = 1)
    public void changePasswordSuccess() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
        clickElement(CT_Account.TRYIT_BUTTON);

        Alert alert = getAlert();
        Assert.assertEquals("Welcome to Selenium WebDriver Tutorials", alert.getText());
    }
}
