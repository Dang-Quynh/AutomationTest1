package automation.page;

import automation.constant.CT_Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void logoutFunction(){
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userDropdown = webDriver.findElement(CT_Account.DROPDOWN_USER);
        if(userDropdown.isDisplayed()){
            userDropdown.click();
        }
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement signOutDropdownItem = webDriver.findElement(CT_Account.DROPDOWN_ITEM_SIGN_OUT);
        if(signOutDropdownItem.isDisplayed()){
            signOutDropdownItem.click();
        }
    }
}
