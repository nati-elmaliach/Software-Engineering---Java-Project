package Leizy;
public class care
{
	public enum typeOfCare{KmCare, cosmetics, damagedParts}
	private double cost;
	private typeOfCare careType;
	private String notes;
	public care(double cost, typeOfCare careType, String notes)
	{
		this.careType=careType;
		this.cost=cost;
		this.notes=notes;
	}
	public void setCost(double newCost)
	{
		this.cost=newCost;
	}
	public void setNotes(String newNotes)
	{
		if(this.notes.contains(newNotes))
			this.notes=newNotes;
		else
			this.notes+=newNotes;
	}
	public double getCost()
	{
		return this.cost;
	}
	public typeOfCare getCareType()
	{
		return this.careType;
	}
	public String getNotes()
	{
		return this.notes;
	}
}