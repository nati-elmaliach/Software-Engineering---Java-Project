package Cars;

import java.sql.*;
public class DB {

    final static String DB_URI = "jdbc:sqlite" + ":data.db";

    //THE VEHICLE TABLE
    public static final String TABLE_vehicle = "vehicle";
    public static final String COLUMN_vehicle_producer = "producer";
    public static final String COLUMN_vehicle_model = "model";
    public static final String COLUMN_vehicle_type = "type";
    public static final String COLUMN_vehicle_fuel_type = "fuel_type";
    public static final String COLUMN_vehicle_color = "color";
    public static final String COLUMN_vehicle_KM = "KM";
    public static final String COLUMN_vehicle_hand = "hand";
    public static final String COLUMN_vehicle_price = "price";
    public static final String COLUMN_vehicle_car_number = "car_number";
    public static final String COLUMN_vehicle_yearOfProduce = "yearOfProduce";
    public static final String COLUMN_vehicle_status = "status";
    public static final String COLUMN_vehicle_prev_owner = "prev_owner";
    public static final String COLUMN_vehicle_CC = "CC";
    public static final String COLUMN_vehicle_horse = "horse";
    public static final String COLUMN_vehicle_seats_num = "seats_num";
    public static final String COLUMN_vehicle_doors_num = "doors_num";
    public static final String COLUMN_vehicle_trunk_size = "trunk_size";
    public static final String COLUMN_vehicle_number_of_wheels = "number_of_wheels";
    public static final String COLUMN_vehicle_motorcycle_type = "motorcycle_type";


    //THE CLIENTS TABLE
    public static final String TABLE_CLIENTS = "clients";
    public static final String COLUMN_CLIENTS_firstName = "firstName";
    public static final String COLUMN_CLIENTS_lastName = "lastName";
    public static final String COLUMN_CLIENTS_ID = "client_id";
    public static final String COLUMN_CLIENTS_driver_licence = "driver_licence";
    public static final String COLUMN_CLIENTS_phone = "phone";
    public static final String COLUMN_CLIENTS_email = "email";
    public static final String COLUMN_CLIENTS_city = "city";
    public static final String COLUMN_CLIENTS_street = "street";
    public static final String COLUMN_CLIENTS_bill_number = "bill_number";
    public static final String COLUMN_CLIENTS_license_plate = "license_plate";

    // THE EMPLOYEE TABLE
    public static final String TABLE_EMPLOYEES = "employees";
    public static final String COLUMN_EMPLOYEES_firstName = "firstname";
    public static final String COLUMN_EMPLOYEES_lastName = "lastName";
    public static final String COLUMN_EMPLOYEES_position = "position";
    public static final String COLUMN_EMPLOYEES_ID = "employee_id";
    public static final String COLUMN_EMPLOYEES_START_DATE = "start_date";
    public static final String COLUMN_EMPLOYEES_phone = "phone";
    public static final String COLUMN_EMPLOYEES_email = "email";
    public static final String COLUMN_EMPLOYEES_city = "city";
    public static final String COLUMN_EMPLOYEES_street = "street";

    //THE PROPOSAL TABLE
    public static final String  PROPOSAL_TABLE = "proposal";
    public static final String COLUMN_PROPOSAL_openDate = "open";
    public static final String COLUMN_PROPOSAL_clinetID = "clientID";
    public static final String COLUMN_PROPOSAL_prop_type = "prop_type";
    public static final String COLUMN_PROPOSAL_vehicleNum = "vehicleNum";
    public static final String COLUMN_PROPOSAL_closeDate = "close";


    private Connection conn;

    public boolean open(){
        try {
            conn = DriverManager.getConnection(DB_URI);
            return true;
        }catch(SQLException e){
            System.out.println("Couldent connect: " + e.getMessage());
            return false;
        }
    }

    public void initialize(){
        init_tables();
        insert_tables();
    }

    private void init_tables(){
        try {
            Statement statement = conn.createStatement();
            //statement.execute("drop table clients");
//            statement.execute("drop table vehicle");
            //statement.execute("drop table if exsits employees");
//            statement.execute("drop table PROPOSAL");

          //THE VEHICLE TABLE

        

//            statement.execute("CREATE TABLE IF NOT EXISTS vehicle (producer TEXT,model TEXT,type TEXT,price INTEGER,yearOfProduce TEXT,number INTEGER,hand INTEGER,status TEXT,producer TEXT, ,prev_owner TEXT"
//            		+ "CC float,horse integer,seats_num integer ,doors_num integer,trunk_size float,number_of_wheels integer,motorcycle_type text");
            statement.execute("CREATE TABLE IF NOT EXISTS clients (firstName TEXT,lastName TEXT,client_id INTEGER,driver_license INTEGER,phone INTEGER,email TEXT, city TEXT,street TEXT, bill_number INTEGER,license_plate INTEGER)");
            statement.execute("CREATE TABLE IF NOT EXISTS employees (firstname TEXT,lastName TEXT,position TEXT,employee_id INTEGER,start_date TEXT,phone TEXT,email TEXT,city TEXT,street TEXT)");
            //statement.execute("CREATE TABLE IF NOT EXISTS proposal (open TEXT, clientID INTEGER,prop_type TEXT,vehicleNum INTEGER,close TEXT )");

        }catch (SQLException e){
            System.out.println("Connection is closed here " + e.getMessage());
        }

    }

    private void insert_tables(){
        //try{
//            Statement statement = conn.createStatement();
//            statement.execute("INSERT INTO vehicle (number, type,producer, model,yearOfProduce , fuel_type ,color ,KM ,CC ,hand ,price ,horse ,status ,seats_num , doors_num ,trunk_size ,number_of_wheels ,motorcycle_type )" +
//                    "VALUES ( \"112233\", \"private\", \"Hyundai\", \"I30\", \"2019\", \n" +
//                    "				Fuel.Benzine, Color.Black , 15560 , (float)4.5,\n" +
//                    "				0, 120000 , 1600, Status.Available, 4, 4, (float) 15.5, CarType.Managers)");
            
//            (String carNumber, String previousOwners, String producer, String model, String yearOfProduce,
//        			Fuel carFuel, Color carColor, int kilometers, float cubicCentimeter,
//        			int hand, int price, int horsePower
//        			,Status carStatus, int numberOfSeats, int numberOfDoors, float SizeOfTrunk)
            
//            statement.execute("INSERT INTO vehicle (model,price,yearOfProduce,number,hand,status)" +
//                    "VALUES ('SEAT',25000,'2010',5566611,2,'sale')");
//
//
//            statement.execute("INSERT INTO clients (firstName,lastName,client_id,driver_licence,phone,email,city)" +
//                    " VALUES ('bob','lee',12,154545,'05255454','asdasd@gmail','TLV')");
//
//            statement.execute("INSERT INTO employees (firstname,lastName,email,employee_id,start_date)" +
//                    "VALUES ('jonh','hope','asdasd@gmail',3,'1/5/2013')");
//
//            statement.execute("INSERT INTO proposal (open,clientID,prop_type,vehicleNum,close)" +
//                    "VALUES ('5/8/18',12,'buy',5566611,'1/7/2013')");
//        }catch (SQLException e){
//            System.out.println("Connection is closed " + e.getMessage());
        //}
    }

    public void query_table(){
//        try{
//            Statement statement = conn.createStatement();
//            ResultSet results = statement.executeQuery("SELECT * FROM vehicle");
//            while(results.next()){
//                System.out.println(
//                        results.getString("model")+ ' '
//                                + results.getInt("price") + ' '
//                                + results.getString("yearOfProduce") + ' '
//                                + results.getInt("number") + ' '
//                                + results.getInt("hand") + ' '
//                                + results.getString("status")
//                );
//            }
//        }catch(SQLException e){
//
//        }
    }

    public void close(){
        try{
            if (conn!=null){
                conn.close();
            }
        }catch(SQLException e){
            System.out.println("Couldent connect: " + e.getMessage());
        }
    }

    //UPDATE TABLES
//   statement.execute("UPDATE clients SET phone = 548787878 WHERE firstName = 'NATI'");

    //DELETE FROM TABLE
//     statement.execute("DELETE FROM clients WHERE firstName = 'PERSON'");
}