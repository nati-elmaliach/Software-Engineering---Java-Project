package Leizy;
public class Emploee 
{
	public enum position{manager, shiftManager, salesman};
	private	position empleePos;
	private static int count=100;
	private int empleeNumber;
	private FullName EmpleeName;
	//private static date startDate;
	//private contact contactCard;
	public Emploee(FullName EmpleeName, String empleePos)
	{
		this.EmpleeName=EmpleeName;
		this.empleePos=position.valueOf(empleePos);
		this.empleeNumber= ++count;
		//this.startDate=date.now();
	}
	/*
	 * public void setContactCard(contact contactCard)
	 * {
	 * 		this.contactCard=contactCard;
	 * }
	 */
	public void setEmpleePos(position empleePos)
	{
		this.empleePos=empleePos;
	}
	public FullName getEmpleeName() 
	{
		return this.EmpleeName;
	}
	public position getPosition() 
	{
		return this.empleePos;
	}
	public int getEmpleeNum()
	{
		return this.empleeNumber;
	}
	/*
	 * public contact getContactCard()
	 * {
	 * 		return this.contactCard;
	 * }
	 *public date getStartDate()
	 *{
	 *	return this.startDate;
	 *}
	*/
	
}
