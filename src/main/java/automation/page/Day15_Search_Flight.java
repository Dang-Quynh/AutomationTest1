package automation.page;

import automation.common.Day15_Flight_Model;
import automation.constant.Day15_Flight;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day15_Search_Flight {
    private WebDriver driver;

    public Day15_Search_Flight(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFlight(Day15_Flight_Model flight) throws InterruptedException {
        WebElement txtFlyingFrom = driver.findElement(Day15_Flight.FLYING_FROM_TEXT);
        if(txtFlyingFrom.isDisplayed()){
            txtFlyingFrom.clear();
            txtFlyingFrom.sendKeys(flight.getFlyingFrom());
        }

        WebElement txtFlyingTo = driver.findElement(Day15_Flight.FLYING_TO_TEXT);
        if (txtFlyingTo.isDisplayed()){
            txtFlyingTo.clear();
            txtFlyingTo.sendKeys(flight.getFlyingTo());
        }

        WebElement datePickerDeparting = driver.findElement(Day15_Flight.DEPARTING_DATE);
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly')", datePickerDeparting);

        datePickerDeparting.clear();
        datePickerDeparting.sendKeys(flight.getDeparting());
        datePickerDeparting.sendKeys(Keys.TAB);

        WebElement dropdownPassenger = driver.findElement(Day15_Flight.PASSENGER_DROPDOWN);


        WebElement dropdownCoach = driver.findElement(Day15_Flight.COACH_DROPDOWN);


        WebElement btnSearch = driver.findElement(Day15_Flight.SEARCH_BTN);
        btnSearch.click();
    }
}
