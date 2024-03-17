package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import automation.constant.Day17_GURU;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class Day17_Popup extends CommonBase {

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_guru_popup);
    }

    @Test
    public void handlePopup(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(initWaitTime));
        clickElement(Day17_GURU.BUTTON);
        String mainWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        for(String window:windows){
            if(!window.equals(mainWindow)){
                driver.switchTo().window(window);
                sendKeysElement(Day17_GURU.EMAIL_INPUT, "test@gmail.com");
                clickElement(Day17_GURU.EMAIL_SUBMIT_BUTTON);
                Assert.assertTrue(driver.findElement(Day17_GURU.TEXT_SUCCESS).isDisplayed());
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
    }
}
