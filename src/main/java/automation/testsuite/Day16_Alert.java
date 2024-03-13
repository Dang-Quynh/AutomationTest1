package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Day16_Alert extends CommonBase {
    @BeforeMethod
    public void openPage() throws InterruptedException {
        driver = initChromeDriver(CT_Common.URL_guru);
    }

    @Test
    public void acceptAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
        WebElement custTextBox = driver.findElement(By.name("cusid"));
        custTextBox.sendKeys("1234");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
        WebElement btnSubmit = driver.findElement(By.name("submit"));
        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
        btnSubmit.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[text()='Delete Customer Form']"))));
        Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).isDisplayed());
    }

    @Test
    public void cancelAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
        WebElement custTextBox = driver.findElement(By.name("cusid"));
        custTextBox.sendKeys("5678");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
        WebElement btnSubmit = driver.findElement(By.name("submit"));
        wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
        btnSubmit.click();
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[text()='Delete Customer Form']"))));
        Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).isDisplayed());
    }
}
