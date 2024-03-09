package automation.constant;

import org.openqa.selenium.By;

public class Day15_Flight {
    // form search
    public static By FLYING_FROM_TEXT = By.xpath("//div[@id='myTabContent3']/descendant::input[1]");
    public static By FLYING_TO_TEXT = By.xpath("//div[@id='myTabContent3']/descendant::input[2]");
    public static By DEPARTING_DATE = By.xpath("(//label[text()='Departing']/following-sibling::div//input[@name='daterange-single'])[1]");
    public static By PASSENGER_DROPDOWN = By.xpath("//div[@id='myTabContent3']/descendant::input[4]");
    public static By COACH_DROPDOWN = By.xpath("//div[@id='myTabContent3']/descendant::input[5]");
    public static By SEARCH_BTN = By.xpath("//div[@id='myTabContent3']/descendant::a[text()='Search Now'][1]");

    //result
    public static By SEARCH_RESULT_PAGE_TEXT = By.xpath("//h2[text()='Flight Search Result']");
}
