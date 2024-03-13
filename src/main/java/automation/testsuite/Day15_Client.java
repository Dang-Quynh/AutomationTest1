package automation.testsuite;

import automation.common.CommonBase;
import automation.common.Day15_ClientModel;
import automation.constant.CT_Common;
import automation.page.Day15_AddClientPage;
import automation.page.LoginPageFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day15_Client extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_rise_signin);
    }

    private boolean checkAddClientSuccess(Day15_ClientModel client){
        boolean hasCompany = driver.findElement(By.xpath("//table[@id='client-table']//tr/td[2]/a[text()='"+ client.getCompany() +"']")).isDisplayed();
        boolean hasPhone = driver.findElement(By.xpath("//table[@id='client-table']//tr/td[4][text()='"+ client.getPhone() +"']")).isDisplayed();

        return hasCompany && hasPhone;
    }

    @Test
    public void addClientSuccess() throws InterruptedException {
        LoginPageFactory loginPage = new LoginPageFactory(driver);
        loginPage.loginFunction("admin@demo.com", "riseDemo");
        Thread.sleep(2000);

        Day15_ClientModel client = new Day15_ClientModel(1, "Công ty A","2","Hà Đông", "Hà Nội", "1", ".rar", "Việt Nam", "091234567", "https://rise.fairsketch.com/clients","V123", "G123","1" , "VND","VND", "123", true);
        Day15_AddClientPage addClientPage = new Day15_AddClientPage(driver);
        addClientPage.addClient(client);
        Assert.assertTrue(checkAddClientSuccess(client));
    }

    @AfterMethod
    public void closeDriver(){
//        webDriver.close();
    }
}
