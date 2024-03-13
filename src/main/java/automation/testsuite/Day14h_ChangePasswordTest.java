package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.Alada_CT_Account;
import automation.constant.CT_Common;
import automation.page.Day14h_AccountInfoPageFactory;
import automation.page.Day14h_SigninPageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day14h_ChangePasswordTest extends CommonBase {
    private String currentPassword = "1234567";
    private String newPassword = "123456";
    private String email = "quynh@gmail.com";

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_alada_signin);
    }

    private void navigateToAccountInfoPage(Day14h_AccountInfoPageFactory accountInfoPage) throws InterruptedException {
        //login
        Day14h_SigninPageFactory signupPage = new Day14h_SigninPageFactory(driver);
        signupPage.loginFunction(this.email, this.currentPassword);
        Thread.sleep(1000);
        //navigate to account info
        accountInfoPage.navigateAccountInfoPage();
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void changePasswordFail_CurrentPassword_Empty() throws InterruptedException {
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(driver);
        this.navigateToAccountInfoPage(accountInfoPage);

        // change password
        accountInfoPage.changePasswordFunction("", newPassword, newPassword);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.CHANGEPASS_FAIL_PASSWORD_EMPTY).isDisplayed());
    }

    @Test(priority = 2)
    public void changePasswordFail_NewPassword_Empty() throws InterruptedException {
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(driver);
        this.navigateToAccountInfoPage(accountInfoPage);

        // change password
        accountInfoPage.changePasswordFunction(currentPassword, "", newPassword);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.CHANGEPASS_FAIL_NEWPASSWORD_EMPTY).isDisplayed());
    }

    // sai format >= 6 ký tự
    @Test(priority = 3)
    public void changePasswordFail_NewPassword_Incorrect_Format() throws InterruptedException {
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(driver);
        this.navigateToAccountInfoPage(accountInfoPage);

        // change password
        accountInfoPage.changePasswordFunction(currentPassword, "1234", newPassword);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.CHANGEPASS_FAIL_NEWPASSWORD_FORMAT).isDisplayed());
    }

    @Test(priority = 4)
    public void changePasswordFail_ReNewPassword_Empty() throws InterruptedException {
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(driver);
        this.navigateToAccountInfoPage(accountInfoPage);

        // change password
        accountInfoPage.changePasswordFunction(currentPassword, newPassword, "");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.CHANGEPASS_FAIL_ReNEWPASSWORD_EMPTY).isDisplayed());
    }

    @Test(priority = 5)
    public void changePasswordFail_ReNewPassword_Incorrect_Format() throws InterruptedException {
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(driver);
        this.navigateToAccountInfoPage(accountInfoPage);

        // change password
        accountInfoPage.changePasswordFunction(currentPassword, newPassword, "1234");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.CHANGEPASS_FAIL_ReNEWPASSWORD_FORMAT).isDisplayed());
    }

    @Test(priority = 6)
    public void changePasswordFail_ReNewPassword_NotEqual() throws InterruptedException {
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(driver);
        this.navigateToAccountInfoPage(accountInfoPage);

        // change password
        accountInfoPage.changePasswordFunction(currentPassword, "123456", "123457");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.CHANGEPASS_FAIL_ReNEWPASSWORD_NotEQUAL_NEWPASSWORD).isDisplayed());
    }

    @Test(priority = 7)
    public void changePasswordSuccess() throws InterruptedException {
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(driver);
        this.navigateToAccountInfoPage(accountInfoPage);
        accountInfoPage.changePasswordFunction(currentPassword, newPassword, newPassword);

        // sent form change password successfully -> display alert -> accept to close alert
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            Assert.assertTrue(alert.getText().contains("thành công"));
        } catch (Exception e) {
            //exception handling
        }
    }

    @Test(priority = 8)
    public void loginByNewPassword() throws InterruptedException {
        Day14h_SigninPageFactory signinPage = new Day14h_SigninPageFactory(driver);
        Thread.sleep(2000);
        // login by new password
        signinPage.loginFunction(email, newPassword);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }
}
