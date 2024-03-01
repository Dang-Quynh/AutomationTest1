package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Day12_Select extends CommonBase {

    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_seleniumeasy_select);
    }

    @Test
    public void selectStatus() {
        Select select = new Select(webDriver.findElement(By.xpath("//select[@id='select-demo']")));
        List<WebElement> options = select.getOptions();
        System.out.println(options.size());
        //C1: By VisibleText
        select.selectByVisibleText("Monday");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        Assert.assertEquals("Monday", select.getFirstSelectedOption());

        //C2: By Value
        select.selectByValue("Tuesday");
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        Assert.assertEquals("Monday", select.getFirstSelectedOption());
        //C3: by Index
        select.selectByIndex(1);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertEquals("Sunday", select.getFirstSelectedOption().getText());
    }
}
