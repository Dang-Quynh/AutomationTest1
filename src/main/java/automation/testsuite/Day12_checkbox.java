package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day12_checkbox extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_seleniumeasy_checkbox);
    }

    @Test
    public void clickSingleCheckbox() {
        WebElement checkbox1 = driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']/child::input"));
        if(checkbox1.isSelected()){
            System.out.println("Checkbox 1 đã được checked");
        }
        else{
            checkbox1.click();
        }
    }

    @Test
    public void clickMultiCheckbox() {
        List<WebElement> listCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']"));
        for(int i = 0; i< listCheckbox.size(); i++){
            if(!listCheckbox.get(i).isSelected()){
                listCheckbox.get(i).click();
            }
        }
    }

    @Test
    public void clickMultiCheckbox3() {
        List<WebElement> listCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']"));
        for(int i = 1; i<= listCheckbox.size(); i++){
            WebElement checkbox = driver.findElement(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox'][" + (i) + "]//input"));
            if(i == 2 && !checkbox.isSelected() ){
                checkbox.click();
            }
        }
    }
}
