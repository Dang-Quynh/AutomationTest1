package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14h_SigninPageFactory {
    private WebDriver driver;

    @FindBy(id = "txtLoginUsername")
    WebElement txtEmail;

    @FindBy(id = "txtLoginPassword")
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit' and normalize-space()='ĐĂNG NHẬP']")
    WebElement btnSignin;

    public Day14h_SigninPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginFunction(String email, String password) {
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtPassword.clear();
        txtPassword.sendKeys(password);
        btnSignin.click();
    }
}
