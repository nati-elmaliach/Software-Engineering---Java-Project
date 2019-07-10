package Cars;

public class priCar extends car{
	private CarType carClass;
	public priCar(String carNumber, String previousOwners, String producer, String model, String yearOfProduce, 
			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
			int hand, int price, int horsePower
			,Status carStatus, int numberOfSeats, int numberOfDoors, float SizeOfTrunk, CarType carClass)
	{
		super(carNumber, previousOwners, producer, model, yearOfProduce, 
				carFuel, carColor, kilometers, cubicCentimeter,
				hand, price, horsePower
				,carStatus, numberOfSeats, numberOfDoors, sizeOfTrunk);
		setCarType(carClass);
		
	}
	
	public CarType getCarType()
	{
		return this.carClass;
	}
	public void setCarType(CarType carClass)
	{
		this.carClass = carClass;
	}
	
	public String toString()
	{
		return super.toString() + ", Car class: " + getCarType();
	}
	
	enum CarType
	{
		Sporting, Managers, Mini, SuperMini;
	}

}
