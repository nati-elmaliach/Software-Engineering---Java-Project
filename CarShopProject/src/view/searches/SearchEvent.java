package view.searches;

import java.util.EventObject;

public class SearchEvent  extends EventObject {

    //All Cars fields
    private int typeCategoty; // 0:private , 1:industrial
    private String plateNumber;
    private int hand;
    private int km;
    private String yearOfPrudction;
    private int price;
    private String color;
    private String manufacturer;

    //private car fields only
    private String privateCarCategory; // mini:0,supermini:1.....
    private int numOfSeats;

    //industrial car fields only
    private int loadWeight;
    private int height;

    //All person Fields
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    //Customer fields only
    String intrestedIn;
    int maxPrice;

    //Employee fields only
    String startDate;
    String employeeType;

    //Deal fields
    int employeeID;
    int customerID;
    String dealDate;
    int dealPrice;


    //search private car
    public SearchEvent(Object source, int typeCategoty, String plateNumber, int hand, int km, String yearOfPrudction, int price, String color, String manufacturer, String privateCarCategory, int numOfSeats) {
        super(source);
        this.typeCategoty = typeCategoty;
        this.plateNumber = plateNumber;
        this.hand = hand;
        this.km = km;
        this.yearOfPrudction = yearOfPrudction;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
        this.privateCarCategory = privateCarCategory;
        this.numOfSeats = numOfSeats;
    }

    //search industrial car
    public SearchEvent(Object source,String plateNumber,int typeCategoty, int hand, int km, String yearOfPrudction, int price, String color, String manufacturer, int loadWeight, int height) {
        super(source);
        this.typeCategoty = typeCategoty;
        this.plateNumber = plateNumber;
        this.hand = hand;
        this.km = km;
        this.yearOfPrudction = yearOfPrudction;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
        this.loadWeight = loadWeight;
        this.height = height;
    }

    //search customer
    public SearchEvent(Object source, String firstName, String lastName, String email, String phoneNumber,String intrestedIn,int maxPrice) {
        super(source);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.intrestedIn = intrestedIn;
        this.maxPrice = maxPrice;
    }

    //search employee
    public SearchEvent(Object source, String firstName, String lastName, String email, String phoneNumber, String startDate, String employeeType) {
        super(source);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.employeeType = employeeType;
    }

    //search deal
    public SearchEvent(Object source, int employeeID, int customerID,String plateNumber,int dealPrice, String dealDate) {
        super(source);
        this.plateNumber = plateNumber;
        this.dealDate = dealDate;
        this.employeeID = employeeID;
        this.customerID = customerID;
        this.dealPrice = dealPrice;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }

    public int getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(int dealPrice) {
        this.dealPrice = dealPrice;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIntrestedIn() {
        return intrestedIn;
    }

    public void setIntrestedIn(String intrestedIn) {
        this.intrestedIn = intrestedIn;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getTypeCategoty() {
        return typeCategoty;
    }

    public void setTypeCategoty(int typeCategoty) {
        this.typeCategoty = typeCategoty;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getYearOfPrudction() {
        return yearOfPrudction;
    }

    public void setYearOfPrudction(String yearOfPrudction) {
        this.yearOfPrudction = yearOfPrudction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrivateCarCategory() {
        return privateCarCategory;
    }

    public void setPrivateCarCategory(String privateCarCategory) {
        this.privateCarCategory = privateCarCategory;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public int getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(int loadWeight) {
        this.loadWeight = loadWeight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
