package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
    private WebDriver driver;
    @FindBy(id="email") WebElement txtEmail;

    @FindBy(id="password") WebElement txtPassword;

    @FindBy(xpath="//button[text()='Sign in']") WebElement btnSignin;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory .initElements(driver, this);
    }

    public void loginFunction(String email, String pass){
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtPassword.clear();
        txtPassword.sendKeys(pass);

        btnSignin.click();
    }
}
