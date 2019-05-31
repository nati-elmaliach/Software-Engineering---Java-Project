package Cars;
public class Employee 
{
	public enum position{manager, shiftManager, salesman};
	private	position imploeePos;
	private static int count=100;
	private int imploeeNumber;
	private FullName ImploeeName;
	//private static date startDate;
	//private contact contactCard;
	public Employee(FullName ImploeeName, String imploeePos)
	{
		this.ImploeeName=ImploeeName;
		this.imploeePos=position.valueOf(imploeePos);
		this.imploeeNumber= ++count;
		//this.startDate=date.now();
	}
	/*
	 * public void setContactCard(contact contactCard)
	 * {
	 * 		this.contactCard=contactCard;
	 * }
	 */
	public void setImploeePos(position imploeePos)
	{
		this.imploeePos=imploeePos;
	}
	public FullName getImploeeName() 
	{
		return this.ImploeeName;
	}
	public position getPosition() 
	{
		return this.imploeePos;
	}
	public int getImploeeNum()
	{
		return this.imploeeNumber;
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
