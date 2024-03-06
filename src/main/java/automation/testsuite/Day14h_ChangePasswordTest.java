package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.Alada_CT_Account;
import automation.constant.CT_Common;
import automation.page.Day14h_AccountInfoPageFactory;
import automation.page.Day14h_SigninPageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day14h_ChangePasswordTest extends CommonBase {
    private String emailIndexTest = "3";
    private String currentPassword = "123456";
    private String newPassword = "1234567";
    private String email = "quynh@gmail.com";

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        webDriver = initChromeDriver(CT_Common.URL_alada_signin);
    }



    @Test(priority = 1)
    public void changePasswordSuccess() throws InterruptedException {
        //login
        Day14h_SigninPageFactory signupPage = new Day14h_SigninPageFactory(webDriver);
        signupPage.loginFunction("quynh@gmail.com", "123456");

        //navigate to account info
        WebElement dropdownAccountInfo = webDriver.findElement(Alada_CT_Account.DROPDOWN_ACCOUNT_INFO);
        if(dropdownAccountInfo.isDisplayed()){
            dropdownAccountInfo.click();
            Thread.sleep(1000);
            WebElement btnEditInfo = webDriver.findElement(Alada_CT_Account.DROPDOWN_ITEM_EDIT_INFO);
            if(btnEditInfo.isDisplayed()){
                btnEditInfo.click();
            }
        }
        Thread.sleep(2000);
        // change password
        Day14h_AccountInfoPageFactory accountInfoPage = new Day14h_AccountInfoPageFactory(webDriver);
        accountInfoPage.changePasswordFunction(currentPassword, newPassword, newPassword);


        // sent form change password successfully -> display alert -> accept to close alert
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = webDriver.switchTo().alert();
            Assert.assertTrue(alert.getText().contains("thành công"));
        } catch (Exception e) {
            //exception handling
        }
    }

    @Test(priority = 3)
    public void loginByNewPassword() throws InterruptedException {
        Day14h_SigninPageFactory signinPage = new Day14h_SigninPageFactory(webDriver);
        Thread.sleep(2000);
        // login by new password
//        signinPage.loginFunction(email, newPassword);
        Thread.sleep(2000);

        Assert.assertTrue(webDriver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }
}
