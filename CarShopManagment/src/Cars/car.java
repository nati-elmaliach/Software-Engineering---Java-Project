package Cars;

public abstract class car extends vihecle{
	protected int numberOfSeats;
	protected int numberOfDoors;
	protected static float sizeOfTrunk;
	
	public car(String carNumber, String previousOwners, String producer, String model, String yearOfProduce, 
			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
			int hand, int price, int horsePower
			,Status carStatus, int numberOfSeats, int numberOfDoors, float SizeOfTrunk)
	{
		super(carNumber, previousOwners, producer, model, yearOfProduce, 
				carFuel, carColor, kilometers, cubicCentimeter,
				hand, price, horsePower
				,carStatus);
		setNumberOfSeats(numberOfSeats);
		setNumberOfDoors(numberOfDoors);
		setSizeOfTrunk(SizeOfTrunk);
	}
	
	public int getNumberOfSeats()
	{
		return this.numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats)
	{
		if(numberOfSeats > 0)
			this.numberOfSeats = numberOfSeats;
		else
			this.numberOfSeats = 1;
	}
	
	public int getNumberOfDoors()
	{
		return this.numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors)
	{
		if(numberOfDoors > 0)
			this.numberOfDoors = numberOfDoors;
		else
			this.numberOfDoors = 1;
	}
	
	public float getSizeOfTrunk()
	{
		return this.sizeOfTrunk;
	}
	public void setSizeOfTrunk(float sizeOfTrunk)
	{
		if(sizeOfTrunk > 0)
			this.sizeOfTrunk = sizeOfTrunk;
		else
			this.sizeOfTrunk = (float)1.5;
	}
	
	public String toString()
	{
		return super.toString() + ", Number of seats: " + getNumberOfSeats() + 
				", Number of doors: " + getNumberOfDoors() +
				", Size of trunk: " + getSizeOfTrunk();
	}
}