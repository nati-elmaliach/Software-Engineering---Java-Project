package Cars;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {
    final static String DB_URI = "jdbc:sqlite" + ":data.db";
    private Connection conn;

    private String firstName;
    private String lastName;
    private long client_ID;
    private long driver_license;
    public long phone_number;
    private String email;
    private String city;
    private String street;
    private int bill_number;
    private int license_plate;

    private static DB dataBase = new DB();

public Client(String firstName, String lastName, long client_ID, long driver_licence, long phone_number, String email, String city, String street, int bill_number,int license_plate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.client_ID = client_ID;
        this.driver_license = driver_licence;
        this.phone_number = phone_number;
        this.email = email;
        this.city = city;
        this.street = street;
        this.bill_number = bill_number;
        this.license_plate = license_plate;
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

    public void InsertClient(){
        //insert the client to the DB here
        Connection conn= openConnection();

        try{
           Statement statement = conn.createStatement();
           statement.execute("INSERT INTO clients(firstName,lastName,client_id,driver_license,phone,email,city,street, bill_number,license_plate) VALUES(' " +
                    this.firstName + "','" + this.lastName + "'," + this.client_ID + "," + this.driver_license + "," + this.phone_number + ",'" + this.email + "','" + this.city + "','" +this.street +"'," +this.bill_number + "," +
                    this.license_plate + ")");

        }catch(SQLException e){
            System.out.println("couldent execute insert query: " + e);
        }
    }

    public void deleteClient(){
        Connection conn= openConnection();

        try{
            Statement statement = conn.createStatement();
            statement.execute("DELETE from clients where client_id = " + this.client_ID);
            System.out.println("client with id " + this.client_ID + " is deleted");
        }catch(SQLException e){
            System.out.println("couldent execute insert query: " + e);
        }
    }



}
