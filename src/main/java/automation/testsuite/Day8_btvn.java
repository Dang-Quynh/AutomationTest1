package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day8_btvn extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_automationfc);
    }

    @Test
    public void testLocator() throws InterruptedException {
        Thread.sleep(1000);
        WebElement txtName = driver.findElement(By.id("name"));
        System.out.println("Họ và tên "+ txtName);
        WebElement txtAddress = driver.findElement(By.id("address"));
        System.out.println("Địa chỉ "+ txtAddress);
        WebElement txtEmail = driver.findElement(By.id("email"));
        System.out.println("Email "+ txtEmail);
        WebElement txtPassword = driver.findElement(By.id("password"));
        System.out.println("Password"+ txtPassword);
    }
}
