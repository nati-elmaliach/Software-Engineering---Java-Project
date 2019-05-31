package Cars;

public abstract class vihecle {
	protected String producer;
	protected String model;
	protected String yearOfProduce;
	protected String carNumber;
	protected String previousOwners;
	protected Fuel carFuel;
	protected Color carColor;
	protected float cubicCentimeter;
	protected int kilometers, hand, price, horsePower;
	protected Status carStatus;
	
	public vihecle(String carNumber, String previousOwners, String producer, String model, String yearOfProduce, 
			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
			int hand, int price, int horsePower
			,Status carStatus)
	{
		setProducer(producer);
		setModel(model);
		setYearOfProduce(yearOfProduce);
		setCarNumber(carNumber);
		setPeviousOwners(previousOwners);
		setCarFuel(carFuel);
		setColor(carColor);
		setKilometers(kilometers);
		setcubicCentimeter(cubicCentimeter);
		setPrice(price);
		setHand(hand);
		setCarStatus(carStatus);
		setHorsePower(horsePower);
		
	}
	
	public String getProducer()
	{
		return this.producer;
	}
	public void setProducer(String producer)
	{
		this.producer = producer;
	}
	
	public String getModel()
	{
		return this.model;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getYearOfProduce()
	{
		return this.yearOfProduce;
	}
	public void setYearOfProduce(String yearOfProduce)
	{
		this.yearOfProduce = yearOfProduce;
	}
		
	public String getCarNumber()
	{
		return this.carNumber;
	}
	public void setCarNumber(String carNumber)
	{
		this.carNumber = carNumber;
	}
	
	public String getPriousOwners()
	{
		return this.previousOwners;
	}
	public void setPeviousOwners(String previousOwners)
	{
		this.previousOwners = previousOwners;
	}
	
	public Fuel getCarFuel()
	{
		return this.carFuel;
	}
	public void setCarFuel(Fuel carFuel)
	{
		this.carFuel= carFuel;
	}
	
	public Color getColor()
	{
		return this.carColor;
	}
	public void setColor(Color carColor)
	{
		this.carColor = carColor;
	}
	
	public int getKilometers()
	{
		return this.kilometers;
	}
	public void setKilometers(int kilometers)
	{
		if(kilometers > 0)
			this.kilometers = kilometers;
		else
			this.kilometers = 0;
	}
	
	public float getCubicCentimeter()
	{
		return this.cubicCentimeter;
	}
	public void setcubicCentimeter(float cubicCentimeter)
	{
		if(cubicCentimeter > 0.0)
			this.cubicCentimeter = cubicCentimeter;
		else
			this.cubicCentimeter = (float) 0.0;
	}
	
	public int getHand()
	{
		return this.hand;
	}
	public void setHand(int hand)
	{
		if(hand > 0)
			this.hand = hand ;
		else
			hand = 0;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	public void setPrice(int price)
	{
		this.price = price ;
	}
	
	public Status getCarStatus()
	{
		return this.carStatus;
	}
	public void setCarStatus(Status carStatus)
	{
		this.carStatus = carStatus;
	}
	
	public int getHorsePower()
	{
		return this.horsePower;
	}
	public void setHorsePower(int horsePower)
	{
		this.horsePower = horsePower;
	}
	
	public String toString()
	{
		return "producer: " + getProducer() + ", model: "+ getModel() + ", yearOfProduce: "+ getYearOfProduce() +", car number: " + getCarNumber() + 
				", previousOwners: " + getPriousOwners() + ", fuel: " + getCarFuel() + ", color: " + getColor() +
				", kilometers: " + getKilometers() + ", cubic centimeter: " + getCubicCentimeter() +
				", hand: " + getHand() + ", price: " + getPrice() + ", horsePower: " + getHorsePower() + 
				", status: " + getCarStatus();
	}
	
	enum Color 
	{ 
	    Red, Black, White; 
	} 

	enum Fuel
	{
		Benzine, Soler, Gaz;
	}

	enum Status
	{
		Available, Disabled, Save, InGarage; 
	}
}



