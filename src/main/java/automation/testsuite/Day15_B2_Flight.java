package automation.testsuite;

import automation.common.CommonBase;
import automation.common.Day15_Flight_Model;
import automation.constant.CT_Common;
import automation.constant.Day15_Flight;
import automation.page.Day15_Search_Flight;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day15_B2_Flight extends CommonBase {
    @BeforeMethod
    public void openChrome() throws InterruptedException {
        webDriver = initChromeDriver(CT_Common.URL_techydevs);
    }

    @Test
    public void searchFlightSuccess() throws InterruptedException {
        Day15_Flight_Model flight = new Day15_Flight_Model("Ha Noi","Ho Chi Minh","30042024","","");
        Day15_Search_Flight searchFlight = new Day15_Search_Flight(webDriver);
        searchFlight.searchFlight(flight);
        Assert.assertTrue(webDriver.findElement(Day15_Flight.SEARCH_RESULT_PAGE_TEXT).isDisplayed());
    }

    @AfterMethod
    public void closeDriver(){
//        webDriver.close();
    }
}
