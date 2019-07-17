package model.PersonEntity;

import model.Vehicles.PrivateCarCategory;

public class Customer extends Person {
    static private int count = 0;
    private int id;
    private PrivateCarCategory lokingFor;
    private int maxPrice;

    public Customer(String firstName, String lastName, String email, String phoneNumber, PrivateCarCategory lokingFor, int maxPrice) {
        super(firstName, lastName, email, phoneNumber);
        this.id = count++;
        this.lokingFor = lokingFor;
        this.maxPrice = maxPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getId() {
        return id;
    }

    public String getLokingFor() {
        return lokingFor.toString();
    }

    public void setLokingFor(PrivateCarCategory lokingFor) {
        this.lokingFor = lokingFor;
    }
}
