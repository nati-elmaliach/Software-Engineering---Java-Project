package model;

public class DealsHistory {

    private int employeeID;
    private int clientID;
    private String carPlateNumber;
    private int sellingPrice;
    private String dealDate;

    public DealsHistory(int employeeID, int clientID, String carPlateNumber, int sellingPrice, String dealDate) {
        this.employeeID = employeeID;
        this.clientID = clientID;
        this.carPlateNumber = carPlateNumber;
        this.sellingPrice = sellingPrice;
        this.dealDate = dealDate;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate;
    }
}
