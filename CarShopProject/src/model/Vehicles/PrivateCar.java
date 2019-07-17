package model.Vehicles;

public class PrivateCar extends Car {

    private PrivateCarCategory privateCategory;
    int numOfSeats;

    public PrivateCar(TypeCategory type,PrivateCarCategory privateCategory,CarStatus status,String plateNumber,  int hand, int km, String yearOfProduction, int price, String color, String manufacturer,  int numOfSeats) {
        super(plateNumber, color, hand, km, yearOfProduction, price, manufacturer, type,status);
        this.privateCategory = privateCategory;
        this.numOfSeats = numOfSeats;
    }

    public PrivateCarCategory getPrivateCategory() {
        return privateCategory;
    }

    public void setPrivateCategory(PrivateCarCategory privateCategory) {
        this.privateCategory = privateCategory;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
