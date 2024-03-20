package automation.page;

import automation.common.Day15_ClientModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day15_AddClientPage {
    private WebDriver driver;

    @FindBy(id = "type_organization")
    WebElement radioType_Organization;
    @FindBy(id = "type_person")
    WebElement radioType_Person;
    @FindBy(id = "company_name")
    WebElement txtCompany;
    @FindBy(id = "created_by")
    WebElement dropdownOwner;
    @FindBy(id = "address")
    WebElement txtAddress;
    @FindBy(id = "city")
    WebElement txtCity;
    @FindBy(id = "state")
    WebElement txtState;
    @FindBy(id = "zip")
    WebElement txtZip;
    @FindBy(id = "country")
    WebElement txtCountry;
    @FindBy(id = "phone")
    WebElement txtPhone;
    @FindBy(id = "website")
    WebElement txtWebsite;
    @FindBy(id = "vat_number")
    WebElement txtVatNumber;
    @FindBy(id = "gst_number")
    WebElement txtGstNumber;
    @FindBy(id = "group_ids")
    WebElement dropdownClientGroup;
    @FindBy(id = "currency")
    WebElement dropdownCurrency;
    @FindBy(id = "currency_symbol")
    WebElement txtCurrencySymbol;
    @FindBy(id = "client_labels")
    WebElement dropdownLabel;

    @FindBy(id = "disable_online_payment")
    WebElement checkBoxDisableOnlinePayment;
    @FindBy(xpath = "//button[@type='submit' and contains(text(), ' Save')]")
    WebElement btnSave;

    @FindBy(xpath = "//ul[@id='sidebar-menu']//a//span[text()='Clients' ]")
    WebElement clientMenu;

    @FindBy(xpath = "//a[@title='Add client']")
    WebElement btnAddClient;

    @FindBy(xpath = "//input[@type='search']")
    WebElement search;

    @FindBy(xpath = "//ul[@id='client-tabs']/li[2][a]")
    WebElement clientTab;


    public Day15_AddClientPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addClient(Day15_ClientModel client) throws InterruptedException {
        clientMenu.click();
        Thread.sleep(2000);
        btnAddClient.click();
        Thread.sleep(2000);

        // add data for form
        if (radioType_Organization.isDisplayed() && !radioType_Organization.isSelected() && client.getClientType() == 0) {
            radioType_Organization.click();
        }
        if (radioType_Person.isDisplayed() && !radioType_Person.isSelected() && client.getClientType() == 1) {
            radioType_Organization.click();
        }

        if (client.getCompany()!= null) {
            txtCompany.clear();
            ;
            txtCompany.sendKeys(client.getCompany());
        }

//        if (client.getOwner()!= null) {
//            dropdownOwner.sendKeys(client.getOwner());
//        }

        if (client.getAddress()!= null) {
            txtAddress.clear();
            txtAddress.sendKeys(client.getAddress());
        }

        if (client.getCity()!= null) {
            txtCity.clear();
            txtCity.sendKeys(client.getCity());
        }

        if (client.getState()!= null) {
            txtState.clear();
            txtState.sendKeys(client.getState());
        }

        if (client.getZip()!= null) {
            txtZip.clear();
            txtZip.sendKeys(client.getZip());
        }

        if (client.getCountry()!= null) {
            txtCountry.clear();
            txtCountry.sendKeys(client.getCountry());
        }

        if (client.getPhone()!= null) {
            txtPhone.clear();
            txtPhone.sendKeys(client.getPhone());
        }

        if (client.getWebsite()!= null) {
            txtWebsite.clear();
            txtWebsite.sendKeys(client.getWebsite());
        }

        if (client.getVatNumber()!= null) {
            txtVatNumber.clear();
            txtVatNumber.sendKeys(client.getVatNumber());
        }

        if (client.getGstNumber()!= null) {
            txtGstNumber.clear();
            txtGstNumber.sendKeys(client.getGstNumber());
        }

//        if (client.getClientGroup()!= null) {
//            dropdownClientGroup.sendKeys(client.getClientGroup());
//        }

//        if (client.getCurrency()!= null) {
//            dropdownCurrency.sendKeys(client.getCurrency());
//        }

        if (client.getCurrencySymbol()!= null) {
            txtCurrencySymbol.clear();
            txtCurrencySymbol.sendKeys(client.getCurrencySymbol());
        }

//        if (client.getLabel()!= null) {
//            dropdownLabel.sendKeys(client.getLabel());
//        }

        if (checkBoxDisableOnlinePayment.isDisplayed() && ((!checkBoxDisableOnlinePayment.isSelected() && client.isDisableOnlinePayment()) || (checkBoxDisableOnlinePayment.isSelected() && !client.isDisableOnlinePayment()))) {
            checkBoxDisableOnlinePayment.click();
        }

        btnSave.click();
        Thread.sleep(2000);

        // back to list client page and search name
        clientTab.click();
        Thread.sleep(2000);
        search.clear();
        search.sendKeys(client.getCompany());
        Thread.sleep(2000);
    }
}
