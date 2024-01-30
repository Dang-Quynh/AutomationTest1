package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day8_Practice extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_bep_an_toan);
    }

    @Test
    public void testLocator() throws InterruptedException {
//        webDriver.findElement(By.xpath("//img[@title='Close']")).click();
//        Thread.sleep(1000);
//        WebElement txtEmail = webDriver.findElement(By.name("email"));
//        WebElement txtPassword = webDriver.findElement(By.id("pass"));
//        WebElement txtCompany = webDriver.findElement(By.name("company"));
//        WebElement txtMobile = webDriver.findElement(By.name("mobile number"));
//        WebElement btnSubmit = webDriver.findElement(By.cssSelector("[type='submit'][value='Submit'"));


        Thread.sleep(1000);
        WebElement linkTextHood = webDriver.findElement(By.linkText("Bếp Từ"));
        System.out.println("Bếp từ"+ linkTextHood);
        WebElement partLinkTextInductionCooker = webDriver.findElement(By.partialLinkText("hút mùi"));
        System.out.println("hút mùi"+ partLinkTextInductionCooker);
    }
}
