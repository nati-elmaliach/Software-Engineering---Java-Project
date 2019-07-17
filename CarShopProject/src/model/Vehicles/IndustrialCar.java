package model.Vehicles;

public class IndustrialCar extends Car {

    private int loadWeight;
    private int height;

    public IndustrialCar(String plateNumber, String color, int hand, int km, String yearOfProduction, int price, String manufacturer, TypeCategory type,CarStatus status, int loadWeight, int height) {
        super(plateNumber, color, hand, km, yearOfProduction, price, manufacturer, type,status);
        this.loadWeight = loadWeight;
        this.height = height;
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
