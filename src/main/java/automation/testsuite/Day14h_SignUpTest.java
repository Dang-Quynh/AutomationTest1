package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.Alada_CT_Account;
import automation.constant.CT_Common;
import automation.page.Day14h_SignUpPageFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day14h_SignUpTest extends CommonBase {
    private String emailIndexTest = "7";
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_alada_signup);
    }

    // register thành công - checkTerm = true
    @Test
    public void signupSuccessfully_check_term() throws InterruptedException {
        String email = "quynh119901_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "0912345678", true);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - checkTerm = false
    @Test
    public void signupSuccessfully_uncheck_term() throws InterruptedException {
        String email = "quynh119902_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "0912345678", false);
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: 10 số + đầu 09
    @Test
    public void signupSuccessfully_phone_10_number() throws InterruptedException {
        String email = "phone10number_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "0912345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: 11 số + đầu 09
    @Test
    public void signupSuccessfully_phone_11_number() throws InterruptedException {
        String email = "phone11number_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "09123456789");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 012
    @Test
    public void signupSuccessfully_phone_012() throws InterruptedException {
        String email = "phone012_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "01212345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 016
    @Test
    public void signupSuccessfully_phone_016() throws InterruptedException {
        String email = "phone016_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "01612345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 018
    @Test
    public void signupSuccessfully_phone_018() throws InterruptedException {
        String email = "phone018_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "01812345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 019
    @Test
    public void signupSuccessfully_phone_019() throws InterruptedException {
        String email = "phone019_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "01912345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 088
    @Test
    public void signupSuccessfully_phone_088() throws InterruptedException {
        String email = "phone088_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "08812345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 03
    @Test
    public void signupSuccessfully_phone_03() throws InterruptedException {
        String email = "phone03_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "0312345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 05
    @Test
    public void signupSuccessfully_phone_05() throws InterruptedException {
        String email = "phone05_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "0512345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 07
    @Test
    public void signupSuccessfully_phone_07() throws InterruptedException {
        String email = "phone07_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "0712345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thành công - đúng định dạng số điện thoại: đầu 08
    @Test
    public void signupSuccessfully_phone_08() throws InterruptedException {
        String email = "phone08_"+ emailIndexTest +"@gmail.com";
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", email, email, "123456", "123456", "0812345678");
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(Alada_CT_Account.MY_COURSE_TEXT).isDisplayed());
    }

    // register thất bại - không nhập họ tên
    @Test
    public void signupFail_Name_Empty(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_NAME_EMPTY).isDisplayed());
    }

    // register thất bại - nhập họ tên chỉ có dấu cách
    @Test
    public void signupFail_Name_Space(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("      ", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_NAME_EMPTY).isDisplayed());
    }

    // register thất bại - không nhập email
    @Test
    public void signupFail_Email_Empty(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "", "quynh@gmail.com", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_EMAIL_EMPTY).isDisplayed());
    }

    // register thất bại - nhập email chỉ có dấu cách
    @Test
    public void signupFail_Email_Space(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "     ", "quynh@gmail.com", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_EMAIL_EMPTY).isDisplayed());
    }

    // register thất bại - email sai format 'x@y' | 'x@y.z' và không chứa các ký tự đặc biệt khác
    @Test
    public void signupFail_Incorrect_Email_Format(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.", "quynh@gmail.com", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_EMAIL_FORMAT).isDisplayed());
    }

    // register thất bại - email đã tồn tại trong hệ thống
    @Test
    public void signupFail_Email_Exits(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "0912345678");

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            Assert.assertTrue(alert.getText().contains("đã bị trùng vui lòng chọn email khác"));
        } catch (Exception e) {
            //exception handling
            Assert.assertFalse(true);
        }
    }

    // register thất bại - không nhập re-email
    @Test
    public void signupFail_ReEmail_Empty(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_ReEMAIL_EMPTY).isDisplayed());
    }

    // register thất bại - nhập re-email chỉ có dấu cách
    @Test
    public void signupFail_ReEmail_Space(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "    ", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_ReEMAIL_EMPTY).isDisplayed());
    }

    // register thất bại - re-email không trùng với email
    @Test
    public void signupFail_ReEmail_notEqual_Email(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh1@gmail.com", "123456", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_ReEMAIL_NotEQUAL_EMAIL).isDisplayed());
    }

    // register thất bại - không nhập password
    @Test
    public void signupFail_Password_Empty(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PASSWORD_EMPTY).isDisplayed());
    }

    // register thất bại - password chỉ chứa dấu cách
    @Test
    public void signupFail_Password_Space(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "    ", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PASSWORD_EMPTY).isDisplayed());
    }

    // register thất bại - password sai format - 6 ký tự
    @Test
    public void signupFail_Incorrect_Password_Format(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "12345", "123456", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PASSWORD_FORMAT).isDisplayed());
    }

    // register thất bại - không nhập re-password
    @Test
    public void signupFail_RePassword_Empty(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_RePASSWORD_EMPTY).isDisplayed());
    }

    // register thất bại - re-password chỉ chứa dấu cách
    @Test
    public void signupFail_RePassword_Space(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "    ", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_RePASSWORD_EMPTY).isDisplayed());
    }

    // register thất bại - re-password sai format - 6 ký tự
    @Test
    public void signupFail_Incorrect_RePassword_Format(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "1234", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_RePASSWORD_FORMAT).isDisplayed());
    }

    // register thất bại - re-password không trùng với password
    @Test
    public void signupFail_RePassword_notEqual_Password(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "123457", "0912345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_RePASSWORD_NotEQUAL_PASSWORD).isDisplayed());
    }

    // register thất bại - không nhập số điện thoại
    @Test
    public void signupFail_Phone_Empty(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PHONE_EMPTY).isDisplayed());
    }

    // register thất bại - nhập số điện thoại sai format: không bắt đầu bằng '09 - 03 - 012 - 016 - 018 - 019 - 088 - 03 - 05 - 07 - 08'
    @Test
    public void signupFail_Incorrect_Phone_Format(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "0112345678");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PHONE_FORMAT).isDisplayed());
    }

    // register thất bại - nhập số điện thoại sai format: không phải là số
    @Test
    public void signupFail_Incorrect_Phone_notNumber(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "0912e");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PHONE_NotNUMBER).isDisplayed());
    }

    // register thất bại - nhập số điện thoại sai format: < 10 số
    @Test
    public void signupFail_Incorrect_Phone_Format_9number(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "091234567");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PHONE_ERROR_LENGTH).isDisplayed());
    }

    // register thất bại - nhập số điện thoại sai format: > 11 số
    @Test
    public void signupFail_Incorrect_Phone_Format_11number(){
        Day14h_SignUpPageFactory signupPage = new Day14h_SignUpPageFactory(driver);
        signupPage.signupFunction("quynh", "quynh@gmail.com", "quynh@gmail.com", "123456", "123456", "091234567891");
        Assert.assertTrue(driver.findElement(Alada_CT_Account.SIGNUP_FAIL_PHONE_ERROR_LENGTH).isDisplayed());
    }

//    @AfterMethod
//    public void closeDriver(){
//        webDriver.close();
//    }
}
