package Leizy;
public class FullName{
	private String FirstName, LastName;
	public FullName(String Fname, String Lname)
	{
		this.FirstName=Fname;
		this.LastName=Lname;
	}
	public String getFirstName()
	{
		return this.FirstName;
	}
	public String getLastName()
	{
		return this.LastName;
	}
	public void setFirstName(String Fname) 
	{
		this.FirstName=Fname;
	}
	public void setLastName(String Lname) 
	{
		this.LastName=Lname;
	}

}