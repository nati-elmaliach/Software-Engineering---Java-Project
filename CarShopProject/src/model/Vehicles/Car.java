package model.Vehicles;

public class Car extends Vehicle {

    private TypeCategory type;
    private CarStatus status;

    public Car(String plateNumber, String color,int hand, int km, String yearOfProduction, int price, String manufacturer, TypeCategory type,CarStatus status) {
        super(plateNumber, color, hand, km, yearOfProduction, price, manufacturer);
        this.type = type;
        this.status = status;
    }

    public TypeCategory getType() {
        return type;
    }

    public void setType(TypeCategory type) {
        this.type = type;
    }

    public CarStatus getStatus() {
        return status;
    }

    public void setStatus(CarStatus status) {
        this.status = status;
    }
}
