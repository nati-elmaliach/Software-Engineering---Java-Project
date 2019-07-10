package Cars;

public class truck extends car{
	private float highet, maxLoadWeight;
	public truck(String carNumber, String previousOwners, String producer, String model, String yearOfProduce, 
			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
			int hand, int price, int horsePower
			,Status carStatus, int numberOfSeats, int numberOfDoors, float SizeOfTrunk, float highet, float maxLoadWeight)
	{
		super(carNumber, previousOwners, producer, model, yearOfProduce, 
				carFuel, carColor, kilometers, cubicCentimeter,
				hand, price, horsePower
				,carStatus, numberOfSeats, numberOfDoors, sizeOfTrunk);
		setHighet(highet);
		setmaxLoadWeight(maxLoadWeight);
	}

	public float getHighet()
	{
		return this.highet;
	}
	public void setHighet(float highet)
	{
		if(highet > 0)
			this.highet = highet;
		else
			this.highet = 100;
	}

	public float getmaxLoadWeight()
	{
		return this.maxLoadWeight;
	}
	public void setmaxLoadWeight(float maxLoadWeight)
	{
		if(maxLoadWeight > 0)
			this.maxLoadWeight = maxLoadWeight;
		else
			this.maxLoadWeight = 100;
	}

	public String toString()
	{
		return super.toString() + ", highet: " + getHighet() + ", Max load weight: " + getmaxLoadWeight();
	}

}
