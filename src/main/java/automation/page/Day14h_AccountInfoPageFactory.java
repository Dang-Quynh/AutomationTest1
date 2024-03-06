package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14h_AccountInfoPageFactory {
    private WebDriver driver;

    @FindBy(id="txtpassword") WebElement txtCurrentPassword;

    @FindBy(id="txtnewpass") WebElement txtNewPassword;

    @FindBy(id="txtrenewpass") WebElement txtCNewPassword;

    @FindBy(xpath="//button[normalize-space()='Lưu mật khẩu mới']") WebElement btnSavePassword;

    @FindBy(xpath="//li[@id='showsub']/a") WebElement dropdownAccountInfo;

    @FindBy(xpath="//ul[@id='subulmenu']/descendant::a[text()='Chỉnh sửa thông tin']") WebElement dropdownItemEditInfo;

    public Day14h_AccountInfoPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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

    public void navigateAccountInfoPage(){
        dropdownAccountInfo.click();
        dropdownItemEditInfo.click();
    }
}
