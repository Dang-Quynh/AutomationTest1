package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_Radio extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_seleniumeasy_radio);
    }

    @Test
    public void clickRadio() {
        WebElement radioMale = webDriver.findElement(By.xpath("//input[@value='Male']"));
        if(radioMale.isEnabled() && !radioMale.isSelected()){
            radioMale.click();
        }
        else{
            WebElement radioFemale = webDriver.findElement(By.xpath("//input[@value='Female']"));
            if(!radioFemale.isSelected()){
                radioFemale.click();
            }
        }
    }
}