package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.Alada_CT_Account;
import automation.constant.CT_Common;
import automation.page.Day14h_AccountInfoPageFactory;
import automation.page.Day14h_SigninPageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day16_btvn_ChangePassword extends CommonBase {
    private String currentPassword = "123456";
    private String newPassword = "1234567";
    private String email = "quynh@gmail.com";

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_alada_signin);
    }

    @Test(priority = 1)
    public void changePasswordSuccess() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
        //login
        Day14h_SigninPageFactory signupPage = new Day14h_SigninPageFactory(driver);
        signupPage.loginFunction(this.email, this.currentPassword);

        // navigate to account info page
        clickElement(Alada_CT_Account.ACCOUNT_INFO_DROPDOWN);
        clickElement(Alada_CT_Account.EDIT_INFO_DROPDOWN_ITEM);
        scrollToElement(Alada_CT_Account.LAST_ELEMENT_TO_SCROLL);

        // change password
        sendKeysElement(Alada_CT_Account.CURRENT_PASSWORD_TEXTBOX, currentPassword);
        sendKeysElement(Alada_CT_Account.NEW_PASSWORD_TEXTBOX, newPassword);
        sendKeysElement(Alada_CT_Account.Re_NEW_PASSWORD_TEXTBOX, newPassword);
        clickElement(Alada_CT_Account.SAVE_BUTTON);

        Alert alert = getAlert();
        alert.accept();

        Thread.sleep(2000);
//        wait.until(ExpectedConditions.titleIs("alada.vn/thong-tin-ca-nhan"));
        Assert.assertEquals("", driver.getTitle());
    }
}
