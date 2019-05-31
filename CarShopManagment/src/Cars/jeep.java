package Cars;

public class jeep extends car{
	private JeepType jeepClass;
	public jeep(String carNumber, String previousOwners, String producer, String model, String yearOfProduce, 
			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
			int hand, int price, int horsePower
			,Status carStatus, int numberOfSeats, int numberOfDoors, float SizeOfTrunk, JeepType jeepClass)
	{
		super(carNumber, previousOwners, producer, model, yearOfProduce, 
				carFuel, carColor, kilometers, cubicCentimeter,
				hand, price, horsePower
				,carStatus, numberOfSeats, numberOfDoors, sizeOfTrunk);
		setJeepType(jeepClass);

	}

	public JeepType getJeepType()
	{
		return this.jeepClass;
	}
	public void setJeepType(JeepType jeepClass)
	{
		this.jeepClass = jeepClass;
	}

	public String toString()
	{
		return super.toString() + ", Jeep type: " + getJeepType();
	}

	enum JeepType
	{
		Leisure, Area;
	}
}
