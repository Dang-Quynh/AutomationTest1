package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Day17_Btvn_DienMayGiaRe extends CommonBase {

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_dienmaynhapkhaugiare);
    }

//    @Test(priority = 1)
    private void findIframe() throws InterruptedException {
        Thread.sleep(10000);
        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i=0; i< size;i++){

            driver.switchTo().frame(i);
            int sizeOfListBtn = driver.findElements(By.xpath("//span[text()='Bắt đầu chat']")).size();
            if(sizeOfListBtn > 0){
                System.out.print(i);
            }
            driver.switchTo().defaultContent();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Điện thoại']")).isDisplayed());
    }

    @Test
    public void register() throws InterruptedException {
        Thread.sleep(10000);
        driver.switchTo().frame(1);
        clickElement(By.xpath("//span[text()='Bắt đầu chat']/.."));
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Đăng nhập']")).isDisplayed());
    }
}
