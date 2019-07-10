package Cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee
{
	final static String DB_URI = "jdbc:sqlite" + ":data.db";
	private Connection conn;


	private  String firstname;
	private  String lastName;
	private  String position;
	private  int employee_id;
	private  String start_date;
	private  String phone;
	private  String email;
	private  String city;
	private  String street;

	public Employee( String firstname, String lastName, String position, int employee_id, String start_date, String phone, String email, String city, String street) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.position = position;
		this.employee_id = employee_id;
		this.start_date = start_date;
		this.phone = phone;
		this.email = email;
		this.city = city;
		this.street = street;
	}

	public Connection openConnection(){
		try {
			conn = DriverManager.getConnection(DB_URI);
			return conn;
		}catch(SQLException e){
			System.out.println("Couldent connect: " + e.getMessage());
			return conn;
		}
	}

	public void InsertEmployee(){
		Connection conn= openConnection();

		try{
			Statement statement = conn.createStatement();
			statement.execute("insert into employees(firstname,lastName,position,employee_id,start_date,phone,email,city,street) values('" +
							this.firstname + "','" + this.lastName + "','" + this.position + "'," + this.employee_id + ",'" +
				            this.start_date +"','" + this.phone +"','" + this.email +"','" + this.city +"','" + this.street +"')");
//			System.out.println("insert into employees(firstname,lastName,position,employee_id,start_date,phone,email,city,street) values('" +
//					this.firstname + "','" + this.lastName + "','" + this.position + "," + this.employee_id + ",'" +
//					this.start_date +"','" + this.phone +"','" + this.email +"','" + this.city +"','" + this.street +"')");
			System.out.println("employee " + this.firstname + "inserted succesfully");

		}catch(SQLException e){
			System.out.println("couldent execute insert query: " + e);
		}
	}

	public void  deleteEmployee(){
	Connection conn= openConnection();

	try{
		Statement statement = conn.createStatement();
		statement.execute("DELETE from employees where employee_id = " + this.employee_id);
		System.out.println("client with id " + this.employee_id + " is deleted");
	}catch(SQLException e){
		System.out.println("couldent execute insert query: " + e);
	}

	}

}
