package automation.page;

import automation.constant.CT_Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver webDriver;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void loginFunction(String username, String password){
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement textEmail = webDriver.findElement(CT_Account.TEXTBOX_EMAIL);
        if(textEmail.isDisplayed()){
            textEmail.clear();
            textEmail.sendKeys(username);
        }

        WebElement textPassword = webDriver.findElement(CT_Account.TEXTBOX_PASSWORD);
        if(textPassword.isDisplayed()){
            textPassword.clear();
            textPassword.sendKeys(password);
        }

        WebElement btnSignin = webDriver.findElement(CT_Account.BTN_SIGNIN);
        if (btnSignin.isDisplayed()){
            btnSignin.click();
        }
    }
}
