package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day8_Practice2 extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_alada);
    }

    @Test
    public void testLocator() throws InterruptedException {
        Thread.sleep(1000);
        WebElement txtName = webDriver.findElement(By.id("txtFirstname"));
        System.out.println("Họ và tên"+ txtName);
        WebElement txtEmail = webDriver.findElement(By.id("txtEmail"));
        System.out.println("Email"+ txtEmail);
        WebElement txtReEmail = webDriver.findElement(By.id("txtCEmail"));
        System.out.println("Re Email"+ txtReEmail);
        WebElement txtPassword = webDriver.findElement(By.id("txtPassword"));
        System.out.println("Password"+ txtPassword);
        WebElement txtCPassword = webDriver.findElement(By.id("txtCPassword"));
        System.out.println("Re Password"+ txtCPassword);
        WebElement txtPhone = webDriver.findElement(By.id("txtPhone"));
        System.out.println("Điện thoại"+ txtPhone);
    }
}
