package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day12_btvn extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_seleniumeasy_input_form);
    }

    @Test
    public void selectStatus() {
        Select select = new Select(webDriver.findElement(By.xpath("//select[@name='state']")));
        select.selectByVisibleText("Alaska");
    }

    @Test
    public void clickRadioHosting() {
        WebElement radioYes = webDriver.findElement(By.xpath("//input[@name='hosting' and @value='yes']"));
        if(radioYes.isEnabled() && !radioYes.isSelected()){
            radioYes.click();
        }
        else{
            WebElement radioNo = webDriver.findElement(By.xpath("//input[@name='hosting' and @value='no']"));
            if(!radioNo.isSelected()){
                radioNo.click();
            }
        }
    }
}
