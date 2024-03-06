package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14h_SignUpPageFactory {
    private WebDriver driver;
    @FindBy(id="txtFirstname") WebElement txtFirstname;

    @FindBy(id="txtEmail") WebElement txtEmail;

    @FindBy(id="txtCEmail") WebElement txtCEmail;

    @FindBy(id="txtPassword") WebElement txtPassword;

    @FindBy(id="txtCPassword") WebElement txtCPassword;

    @FindBy(id="txtPhone") WebElement txtPhone;

    @FindBy(id="chkRight") WebElement checkboxTerm;

    @FindBy(xpath="//button[@type='submit' and text()='ĐĂNG KÝ']") WebElement btnSignup;


    public Day14h_SignUpPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void senKeysForm(String firstname, String email, String reEmail, String password, String rePass, String phone){
        txtFirstname.clear();
        txtFirstname.sendKeys(firstname);
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtCEmail.clear();
        txtCEmail.sendKeys(reEmail);
        txtPassword.clear();
        txtPassword.sendKeys(password);
        txtCPassword.clear();
        txtCPassword.sendKeys(rePass);
        txtPhone.clear();
        txtPhone.sendKeys(phone);
    }

    public void signupFunction(String firstname, String email, String reEmail, String password, String rePass, String phone){
        senKeysForm(firstname, email, reEmail, password,rePass,phone);
        btnSignup.click();
    }

    public void signupFunction(String firstname, String email, String reEmail, String password, String rePass, String phone, Boolean chkRight){
        senKeysForm(firstname, email, reEmail, password,rePass,phone);
        if((!checkboxTerm.isSelected() && chkRight) || (checkboxTerm.isSelected() && !chkRight)){
            checkboxTerm.click();
        }
        btnSignup.click();
    }
}
