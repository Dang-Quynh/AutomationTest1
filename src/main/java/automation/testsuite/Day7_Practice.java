package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day7_Practice extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        initChromeDriver(CT_Common.URL_bep_an_toan);
    }

    @Test
    public void testBepAnToan(){
        System.out.println("Test bep an toan");
    }
}
