package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Day18_BTVN_2 extends CommonBase {

    @BeforeMethod
    @Parameters("browser")
    public void openDriver(String browserName) throws InterruptedException {
        driver = setupDriver(browserName);
        driver.get(CT_Common.URL_bep_an_toan);
    }

    @Test
    public void chatZalo() throws InterruptedException {
        String xpathZalo = "//span[text()='Chat với chúng tôi']/..";
        clickElementByJS(By.xpath(xpathZalo));
        Thread.sleep(1000);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        Assert.assertEquals("https://zalo.me/0912331335",driver.getCurrentUrl());
    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
    }
}
