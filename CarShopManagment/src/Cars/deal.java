package Cars;
public class deal 
{
	public enum type{buy, sell};
	public enum status{fresh, sold, onHold};
	private type dealType;
	private static int count=1000;
	private int dealID;
	private Employee dealEmployee;
	private double dealPrice;
	private status dealStatus;
	//private vehicle dealVehicle;
	//private time dealTime;
	//private customer dealCustomer;
	
	public deal(type dealType, Employee dealEmployee, status dealStatus)
	{
		this.dealID=++count;
		this.dealType=dealType;
		this.dealEmployee=dealEmployee;
		this.dealStatus=dealStatus;
	}
	public void setDealPrice(double dealPrice)
	{
		this.dealPrice=dealPrice;
	}
	public void setDealStatus(status dealStatus)
	{
		this.dealStatus=dealStatus;
	}
	public int getDealID()
	{
		return this.dealID;
	}
	public type getDealType()
	{
		return this.dealType;
	}
	public Employee getDealEmployee()
	{
		return this.dealEmployee;
	}
	public double getDealPrice()
	{
		return this.dealPrice;
	}
	public status getDealStatus()
	{
		return this.dealStatus;
	}
	/*public costumer getDealCostumer()
	 * {
	 * 		return this.dealCostumer;
	 * }
	 * public vehicle getDealVehicle()
	 * {
	 * 		return this.dealVehicle;
	 * }
	 * public time getDealTime()
	 * {
	 * 		return this.dealTime;
	 * }

	 */
}