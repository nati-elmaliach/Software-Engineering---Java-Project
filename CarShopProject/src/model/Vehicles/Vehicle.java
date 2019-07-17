package model.Vehicles;

public abstract class Vehicle {
    private static int count = 0;

    private String plateNumber;
    private String color;
    private int hand;
    private int km;
    private String yearOfProduction;
    private int price;
    private String manufacturer;

    public Vehicle(String plateNumber, String color, int hand, int km, String yearOfProduction, int price, String manufacturer) {
        this.plateNumber = plateNumber;
        this.color = color;
        this.hand = hand;
        this.km = km;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.manufacturer = manufacturer;
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

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Vehicle.count = count;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
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

}
