package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //  your code here
        WebDriverManager.chromedriver().clearDriverCache();
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

            driver.get("https://tracnghiemunghoa.hanhchinhcong.net/Account/Register");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            driver.findElement(By.id("UserName")).sendKeys("23436gdfhgf");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            driver.findElement(By.id("Password")).sendKeys("123456");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            driver.findElement(By.id("GivenName")).sendKeys("42543656");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            driver.findElement(By.id("PhoneNumber")).sendKeys("0346546757");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            Select select = new Select(driver.findElement(By.name("WardCode")));
            select.selectByValue("10402");
            Thread.sleep(3);
            WebElement input = driver.findElement(By.cssSelector("[type='submit'][value='Đăng ký'"));
            input.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

            Thread.sleep(5);
            List<WebElement> aList = driver.findElements(By.cssSelector("a.lambai"));
            aList.get(2).click();
            Thread.sleep(3);

            List<WebElement> elements = driver.findElements(By.cssSelector(".panel.panel-default"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            if(elements.size() < 22){
                for(int i=0; i<(elements.size()-1); i++){
                    Thread.sleep(10);
                    elements.get(i).findElement(By.cssSelector("ul li:nth-of-type(1)")).click();
                }
                Thread.sleep(10);
                WebElement input1 = elements.get(elements.size()-1).findElement(By.cssSelector("textarea"));
                input1.sendKeys("adfdsgdfg");
            }
            else {
                for(int i=0; i<(elements.size()-2); i++){
                    Thread.sleep(10);
                    elements.get(i).findElement(By.cssSelector("ul li:nth-of-type(1)")).click();
                }
                Thread.sleep(10);
                WebElement input1 = elements.get(elements.size()-2).findElement(By.cssSelector("textarea"));
                input1.sendKeys("adfdsgdfg");
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.cssSelector("[type='submit'][title='Kết thúc bài thi']")).click();
            Thread.sleep(3);
            Alert alert1 = driver.switchTo().alert();
            alert1.accept();


            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
