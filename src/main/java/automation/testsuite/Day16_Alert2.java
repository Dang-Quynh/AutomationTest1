package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day16_Alert2 extends CommonBase {
    @BeforeMethod
    public void openPage() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_automationtesting_alert);
    }

    @Test
    public void acceptAlertWithOk(){
        String xpathAlertWithOk = "//a[text()='Alert with OK ']";
        String xpathAlertWithOkAndCancel = "//a[text()='Alert with OK & Cancel ']";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement btnAlertWithOk = driver.findElement(By.xpath(xpathAlertWithOk));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathAlertWithOk)));
        btnAlertWithOk.click();

        WebElement btnClickAlertWithOk = driver.findElement(By.xpath(xpathAlertWithOkAndCancel));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathAlertWithOkAndCancel)));
        btnClickAlertWithOk.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement outputSuccess = driver.findElement(By.id("demo1"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo1"))));
        Assert.assertEquals("", outputSuccess.getText());
    }

    @Test
    public void acceptAlertWithCancel(){
        String btnOkTabId1= "//div[@id='OKTab']//button";
        String xpathBtnCancelTab = "//div[@id='CancelTab']//button";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement btnAlert = driver.findElement(By.xpath(btnOkTabId1));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(btnOkTabId1)));
        btnAlert.click();

        WebElement btnClickAlert = driver.findElement(By.xpath(xpathBtnCancelTab));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathBtnCancelTab)));
        btnClickAlert.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Day16");
        alert.accept();

        WebElement outputSuccess = driver.findElement(By.id("demo"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
        Assert.assertEquals("You pressed Ok", outputSuccess.getText());
    }

    @Test
    public void acceptAlertWithTextbox(){
        String xpathAlertWithTextbox = "//a[text()='Alert with Textbox ']";
        String xpathBtnTextbox = "//div[@id='Textbox']//button";

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement btnAlertWithTextbox = driver.findElement(By.xpath(xpathAlertWithTextbox));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathAlertWithTextbox)));
        btnAlertWithTextbox.click();

        WebElement btnClickAlertWithTextbox = driver.findElement(By.xpath(xpathBtnTextbox));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathBtnTextbox)));
        btnClickAlertWithTextbox.click();

        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Day16");
        alert.accept();

        WebElement outputSuccess = driver.findElement(By.id("demo1"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo1"))));
        Assert.assertEquals("Hello Day16 How are you today", outputSuccess.getText());
    }
}
