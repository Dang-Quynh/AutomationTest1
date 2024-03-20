package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Set;

public class Day18_BTVN1 extends CommonBase {

    @BeforeMethod
    @Parameters("browser")
    public void openDriver(String browserName) throws InterruptedException {
        driver = setupDriver(browserName);
        driver.get(CT_Common.URL_dienmaynhapkhaugiare);
    }

    @Test
    public void chatZalo() throws InterruptedException {
        String xpathZalo = "//div[@id='zalo-vr']//a";
        clickElementByJS(By.xpath(xpathZalo));
        Thread.sleep(1000);

        String mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String window:windows){
            if(!window.equals(mainWindow)){
                driver.switchTo().window(window);
                Assert.assertEquals("https://zalo.me/0988169282",driver.getCurrentUrl());
            }
        }
    }

    @AfterMethod
    public void closeDriver(){
        driver.close();
    }
}
