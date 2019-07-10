package Leizy;

public class sport extends car {
	private int maxSpeed;
	private float timeFromZeroTo100;
	public sport(String carNumber, String previousOwners, String producer, String model, String yearOfProduce, 
			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
			int hand, int price, int horsePower
			,Status carStatus, int numberOfSeats, int numberOfDoors, float SizeOfTrunk, int maxSpeed, float timeFromZeroTo100)
	{
		super(carNumber, previousOwners, producer, model, yearOfProduce, 
				carFuel, carColor, kilometers, cubicCentimeter,
				hand, price, horsePower
				,carStatus, numberOfSeats, numberOfDoors, sizeOfTrunk);
		setMaxSpeed(maxSpeed);
		setTimeFromZeroTo100(timeFromZeroTo100);
	}

	public int getMaxSpeed()
	{
		return this.maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed)
	{
		if(maxSpeed > 0)
			this.maxSpeed = maxSpeed;
		else
			this.maxSpeed = 100;
	}
	
	public float getTimeFromZeroTo100()
	{
		return this.timeFromZeroTo100;
	}
	public void setTimeFromZeroTo100(float timeFromZeroTo100)
	{
		if(timeFromZeroTo100 > 0)
			this.timeFromZeroTo100 = timeFromZeroTo100;
		else
			this.timeFromZeroTo100 = 10;
	}

	public String toString()
	{
		return super.toString() + ", maximum speed: " + getMaxSpeed() + ", time from 0 to 100:" + getTimeFromZeroTo100();
	}
}
