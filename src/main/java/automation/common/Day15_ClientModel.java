package automation.common;

public class Day15_ClientModel {
    private int clientType;
    private String company;
    private String owner;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String website;
    private String vatNumber;
    private String gstNumber;
    private String clientGroup;
    private String currency;
    private String currencySymbol;
    private boolean disableOnlinePayment = true;
    private String label;

    public Day15_ClientModel(int clientType, String company, String owner, String address, String city, String state, String zip, String country, String phone, String website, String vatNumber, String gstNumber, String clientGroup, String currency, String currencySymbol, String labels, boolean disableOnlinePayment) {
        this.clientType = clientType;
        this.company = company;
        this.owner = owner;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.phone = phone;
        this.website = website;
        this.vatNumber = vatNumber;
        this.gstNumber = gstNumber;
        this.clientGroup = clientGroup;
        this.currency = currency;
        this.currencySymbol = currencySymbol;
        this.label = labels;
        this.disableOnlinePayment = disableOnlinePayment;
    }

    public String getLabel() {
        return label;
    }

    public int getClientType() {
        return clientType;
    }

    public String getCompany() {
        return company;
    }

    public String getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public boolean isDisableOnlinePayment() {
        return disableOnlinePayment;
    }

    public String getClientGroup() {
        return clientGroup;
    }

    public String getCurrency() {
        return currency;
    }
}
