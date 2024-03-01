package automation.constant;

import org.openqa.selenium.By;

public class CT_Account {
    public static By TEXTBOX_EMAIL = By.id("email");
    public static By TEXTBOX_PASSWORD = By.id("password");
    public static By BTN_SIGNIN = By.xpath("//button[@type='submit' and text()='Sign in']");
    public static By DASHBOARD_TEXT = By.xpath("//h4[text()='Dashboard']");
    public static By LOGIN_FAIL_TEXT = By.xpath("//div[contains(@class, 'alert-danger') and contains(normalize-space(), 'Authentication failed!')]");
    public static By DROPDOWN_USER = By.id("user-dropdown");
    public static By DROPDOWN_ITEM_SIGN_OUT = By.xpath("//a[@class='dropdown-item' and contains(normalize-space(), 'Sign Out')]");
    public static By SIGNIN_FORM = By.id("signin-form");
}
