package Cars;

public class motorcycle extends vihecle{
	private int numberOfWheels;
	private boolean box;
	private MotorCycleType motorcycleClass;
	public motorcycle(String carNumber, String previousOwners, String producer, String model, String yearOfProduce, 
			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
			int hand, int price, int horsePower
			,Status carStatus, int numberOfWheels, boolean box, MotorCycleType motorcycleClass)
	{
		super(carNumber, previousOwners, producer, model, yearOfProduce, 
				carFuel, carColor, kilometers, cubicCentimeter,
				hand, price, horsePower, carStatus);
		setNumberOfWheels(numberOfWheels);
		setBox(box);
		setMotorCycleType(motorcycleClass);
	}

	public int getNumberOfWheels()
	{
		return this.numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels)
	{
		if(numberOfWheels > 0 && numberOfWheels < 4)
			this.numberOfWheels = numberOfWheels;
		else
			this.numberOfWheels = 2;
	}
	
	public boolean getBox()
	{
		return this.box;
	}
	public void setBox(boolean box)
	{
		this.box = box;
	}

	public MotorCycleType getMotorCycleType()
	{
		return this.motorcycleClass;
	}
	public void setMotorCycleType(MotorCycleType motorcycleClass)
	{
		this.motorcycleClass = motorcycleClass;
	}
	
	public String toString()
	{
		return super.toString() + ", number of wheels: " + getNumberOfWheels() + ", there is a box:" + getBox() + ", motorcycle type: " + getMotorCycleType();
	}
	
	enum MotorCycleType
	{
		Sport, Electrical, Scooter;
	}
}
