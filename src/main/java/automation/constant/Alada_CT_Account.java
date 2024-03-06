package automation.constant;

import org.openqa.selenium.By;

public class Alada_CT_Account {
    // signin
    public static By BTN_NAVIGATE_LOGIN_PAGE = By.xpath("//div[@id='header2']//a[text()='Đăng Nhập']");

    // signup
    public static By MY_COURSE_TEXT = By.xpath("//div[@class='login']/child::a[normalize-space()='Khóa học của tôi']");
    public static By SIGNUP_SUCCESS_TEXT = By.xpath("//div[@id='thongbao' and contains(text(),'Chúc mừng bạn đã đăng ký thành công')]");
    public static By SIGNUP_FAIL_NAME_EMPTY = By.xpath("//label[@id='txtFirstname-error' and text()='Vui lòng nhập họ tên']");
    public static By SIGNUP_FAIL_EMAIL_EMPTY = By.xpath("//label[@id='txtEmail-error' and normalize-space()='Vui lòng nhập email']");
    public static By SIGNUP_FAIL_EMAIL_FORMAT = By.xpath("//label[@id='txtEmail-error' and normalize-space()='Vui lòng nhập email hợp lệ']");
    public static By SIGNUP_FAIL_EMAIL_EXITS = By.xpath("");
    public static By SIGNUP_FAIL_ReEMAIL_EMPTY = By.xpath("//label[@id='txtCEmail-error' and normalize-space()='Vui lòng nhập lại địa chỉ email']");
    public static By SIGNUP_FAIL_ReEMAIL_NotEQUAL_EMAIL = By.xpath("//label[@id='txtCEmail-error' and normalize-space()='Email nhập lại không đúng']");
    public static By SIGNUP_FAIL_PASSWORD_EMPTY = By.xpath("//label[@id='txtPassword-error' and normalize-space()='Vui lòng nhập mật khẩu']");
    public static By SIGNUP_FAIL_PASSWORD_FORMAT = By.xpath("//label[@id='txtPassword-error' and normalize-space()='Mật khẩu phải có ít nhất 6 ký tự']");
    public static By SIGNUP_FAIL_RePASSWORD_EMPTY = By.xpath("//label[@id='txtCPassword-error' and normalize-space()='Vui lòng nhập lại mật khẩu']");
    public static By SIGNUP_FAIL_RePASSWORD_FORMAT = By.xpath("//label[@id='txtCPassword-error' and normalize-space()='Mật khẩu phải có ít nhất 6 ký tự']");
    public static By SIGNUP_FAIL_RePASSWORD_NotEQUAL_PASSWORD = By.xpath("//label[@id='txtCPassword-error' and normalize-space()='Mật khẩu bạn nhập không khớp']");
    public static By SIGNUP_FAIL_PHONE_EMPTY = By.xpath("//label[@id='txtPhone-error' and normalize-space()='Vui lòng nhập số điện thoại.']");
    public static By SIGNUP_FAIL_PHONE_FORMAT = By.xpath("//label[@id='txtPhone-error' and contains(normalize-space(),'Số điện thoại bắt đầu bằng')]");
    public static By SIGNUP_FAIL_PHONE_ERROR_LENGTH = By.xpath("//label[@id='txtPhone-error' and normalize-space()='Số điện thoại phải từ 10-11 số.']");
    public static By SIGNUP_FAIL_PHONE_NotNUMBER = By.xpath("//label[@id='txtPhone-error' and normalize-space()='Vui lòng nhập con số']");
    // change password
    public static By CHANGEPASS_FAIL_PASSWORD_EMPTY = By.xpath("//label[@id='txtpassword-error' and text()='Vui lòng nhập mật khẩu hiện tại']");
    public static By CHANGEPASS_FAIL_NEWPASSWORD_EMPTY = By.xpath("//label[@id='txtnewpass-error' and text()='Vui lòng nhập mật khẩu mới']");
    public static By CHANGEPASS_FAIL_NEWPASSWORD_FORMAT = By.xpath("//label[@id='txtnewpass-error' and text()='Mật khẩu phải có ít nhất 6 ký tự']");
    public static By CHANGEPASS_FAIL_ReNEWPASSWORD_EMPTY = By.xpath("//label[@id='txtrenewpass-error' and text()='Vui lòng nhập lại mật khẩu mới']");
    public static By CHANGEPASS_FAIL_ReNEWPASSWORD_FORMAT = By.xpath("//label[@id='txtrenewpass-error' and text()='Mật khẩu phải có ít nhất 6 ký tự']");
    public static By CHANGEPASS_FAIL_ReNEWPASSWORD_NotEQUAL_NEWPASSWORD = By.xpath("//label[@id='txtrenewpass-error' and text()='Mật khẩu bạn nhập không khớp']");
}
