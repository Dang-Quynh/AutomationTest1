package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day17_Btvn_MediaMart extends CommonBase {

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_mediamart);
    }

    @Test
    private void findIframe() throws InterruptedException {
        Thread.sleep(10000);
        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i=0; i< size;i++){

            driver.switchTo().frame(i);
            int sizeOfListBtn = driver.findElements(By.xpath("//div[@class='logo']//img")).size();
            if(sizeOfListBtn > 0){
                System.out.print(i);
            }
            driver.switchTo().defaultContent();
        }
    }

    @Test
    public void register() throws InterruptedException {
        Thread.sleep(10000);
        driver.switchTo().frame(0);
        clickElement(By.xpath("//div[@class='logo']//img"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Chat bằng Zalo']")).isDisplayed());
    }
}
