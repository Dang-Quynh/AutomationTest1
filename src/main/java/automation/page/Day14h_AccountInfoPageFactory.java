package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Day14h_AccountInfoPageFactory {
    private WebDriver driver;

    @FindBy(id="txtpassword") WebElement txtCurrentPassword;

    @FindBy(id="txtnewpass") WebElement txtNewPassword;

    @FindBy(id="txtrenewpass") WebElement txtCNewPassword;

    @FindBy(xpath="//button[normalize-space()='Lưu mật khẩu mới']") WebElement btnSavePassword;

    public Day14h_AccountInfoPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public void changePasswordFunction(String currentPassword, String newPassword, String cNewPassword) {
        txtCurrentPassword.clear();
        txtCurrentPassword.sendKeys(currentPassword);
        txtNewPassword.clear();
        txtNewPassword.sendKeys(newPassword);
        txtCNewPassword.clear();
        txtCNewPassword.sendKeys(cNewPassword);
        btnSavePassword.click();
    }
}
