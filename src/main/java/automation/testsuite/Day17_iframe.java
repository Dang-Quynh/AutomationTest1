package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day17_iframe extends CommonBase {

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_codestart);
    }

    private void findIframe() throws InterruptedException {
        Thread.sleep(10000);
        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i=0; i< size;i++){

            driver.switchTo().frame(i);
            int sizeOfListBtn = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
            if(sizeOfListBtn > 0){
                System.out.print(i);
            }
            driver.switchTo().defaultContent();
        }
    }

    @Test
    public void register() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
        Thread.sleep(10000);
        scrollToElement(By.xpath("//h2[text()='Đội ngũ giảng viên']"));
       driver.switchTo().frame(1);
       sendKeysElement(By.id("account_phone"), "0123456789");
       clickElement(By.xpath("//button[text()='Gửi ngay']"));
       Assert.assertTrue(driver.findElement(By.xpath("//label[text()='Điện thoại']")).isDisplayed());
    }
}
