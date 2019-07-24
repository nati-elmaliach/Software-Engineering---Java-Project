package model;

import model.PersonEntity.Customer;
import model.PersonEntity.Employee;
import model.PersonEntity.EmployeeCategory;
import model.Vehicles.*;

import java.sql.*;
import java.util.*;

public class Database {

    final static String DB_URI = "jdbc:sqlite" + ":data.db";
    private ArrayList<Customer> customers;
    private ArrayList<Employee> employees;
    private ArrayList<PrivateCar> privateCars;
    private ArrayList<IndustrialCar> industrialCars;
    private ArrayList<DealsHistory> dealsHistories;


    private ArrayList<PrivateCar> privateCarsQueryResults;
    private ArrayList<IndustrialCar> industrialCarsQueryResults;
    private ArrayList<Customer> custumersQueryResults;
    private ArrayList<Employee> employeesQueryResults;
    private ArrayList<DealsHistory> dealsHistoriesQueryResults;

    public Database() {
        customers = new ArrayList<Customer>();
        privateCars = new ArrayList<PrivateCar>();
        industrialCars = new ArrayList<IndustrialCar>();
        employees = new ArrayList<Employee>();
        dealsHistories = new ArrayList<DealsHistory>();

        //query data results
        privateCarsQueryResults= new ArrayList<PrivateCar>();
        industrialCarsQueryResults = new ArrayList<IndustrialCar>();
        custumersQueryResults = new ArrayList<Customer>();
        employeesQueryResults = new ArrayList<Employee>();
        dealsHistoriesQueryResults = new ArrayList<DealsHistory>();


        //load data from the database
        loadCustomers();
        loadEmployees();
        loadPrivateCars();
        loadIndustrialCars();
        loadDeals();
    }
    //private void init_tables(){
//        try {
////            Statement statement = conn.createStatement();
////
////            statement.execute("CREATE TABLE privateCars (plateNumber TEXT,color TEXT,hand INTEGER,KM INTEGER,yearOfProduction TEXT,price INTEGER,manufacturer TEXT,category TEXT,num_seats INTEGER,status TEXT)");
////            statement.execute("CREATE TABLE industrialCars (plateNumber TEXT,color TEXT,hand INTEGER,km INTEGER,yearOfProduction TEXT,price INTEGER,manufacturer TEXT,loadWeight INTEGER,height Integer,status TEXT)");
////
////
////            statement.execute("CREATE TABLE customers (client_id INTEGER,firstName TEXT,lastName TEXT,phoneNumber TEXT,email TEXT,intrestedIn TEXT,maxPrice INTEGER)");
////            statement.execute("CREATE  TABLE employeees (employee_id INTEGER,firstName TEXT,lastName TEXT,phoneNumber TEXT,email TEXT,startDate TEXT,employeeType TEXT)");
////
////            statement.execute("CREATE TABLE DealsHistory(employeeID INTEGER,customerID INTEGER,carPlateNumber TEXT,sellingPrice INTEGER,dealDate TEXT)");
//
//        }catch (SQLException e){
//            System.out.println("Connection is closed here " + e.getMessage());
//        }

        //close();
    //}




//    public boolean open(){
//        try (Connection conn = DriverManager.getConnection(DB_URI);){
//            Statement statement = conn.createStatement();
//            statement.execute("ALTER TABLE privateCars ADD COLUMN status TEXT;");
//            statement.execute("ALTER TABLE industrialCars ADD COLUMN status TEXT;");
//            return true;
//        }catch(SQLException e){
//            System.out.println("Couldent connect: " + e.getMessage());
//            return false;
//        }
//    }
//
//    public void close(){
//        try{
//            if (conn!=null){
//                conn.close();
//            }
//        }catch(SQLException e){
//            System.out.println("Couldent connect: " + e.getMessage());
//        }
//    }



    public void addCustomer(Customer customer){
        customers.add(customer);
        insertCustomer(customer);
    }

    public void insertCustomer(Customer customer) {

        int client_id = customer.getId();
        String firstName = customer.getFirstName();
        String lastName = customer.getLastName();
        String phoneNumber = customer.getPhoneNumber();
        String email = customer.getEmail();
        String intrestedCategory = customer.getLokingFor();
        int maxPrice = customer.getMaxPrice();
        final String SQL = "INSERT INTO customers VALUES(?,?,?,?,?,?,?)";

        //try with resources - resources will be closed
        try (Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            ps.setInt(1, client_id); // First question mark will be replaced by name variable - String;
            ps.setString(2, firstName); // Second question mark will be replaced by name variable - Integer;
            ps.setString(3, lastName);
            ps.setString(4, phoneNumber);
            ps.setString(5, email);
            ps.setString(6, intrestedCategory);
            ps.setInt(7, maxPrice);

            ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
        }
    }

    //load customers from database
    public void loadCustomers(){

        String SQL = "select * from customers";
        try(Connection conn = DriverManager.getConnection(DB_URI);){
            Statement selectStatement = conn.createStatement();
            ResultSet results = selectStatement.executeQuery(SQL);

            while(results.next()) {
                String firstName = results.getString("firstName");
                String lastName = results.getString("lastName");
                String phoneNumber = results.getString("phoneNumber");
                String email = results.getString("email");
                String intrestedCategory = results.getString("intrestedIn");
                int maxPrice = results.getInt("maxPrice");

                Customer customer = new Customer(-1,firstName, lastName, email, phoneNumber, PrivateCarCategory.valueOf(intrestedCategory),maxPrice);
                customers.add(customer);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
        insertEmployee(employee);
    }

    //insert employee table
    public void insertEmployee(Employee employee){

        int employeeID = employee.getEmployeeID();
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        String phoneNumber = employee.getPhoneNumber();
        String email = employee.getEmail();
        String startDate = employee.getStartDate();
        String employeeType = employee.getEmployeeCategory();

        final String SQL = "INSERT INTO employeees VALUES(?,?,?,?,?,?,?)";

        //try with resources - resources will be closed
        try (Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            ps.setInt(1, employeeID); // First question mark will be replaced by name variable - String;
            ps.setString(2, firstName); // Second question mark will be replaced by name variable - Integer;
            ps.setString(3, lastName);
            ps.setString(4, phoneNumber);
            ps.setString(5, email);
            ps.setString(6, startDate);
            ps.setString(7, employeeType);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //load employees from database
    public void loadEmployees(){

        String SQL = "select * from employeees";
        try(Connection conn = DriverManager.getConnection(DB_URI);){
            Statement selectStatement = conn.createStatement();
            ResultSet results = selectStatement.executeQuery(SQL);

            while(results.next()) {
                String firstName = results.getString("firstName");
                String lastName = results.getString("lastName");
                String phoneNumber = results.getString("phoneNumber");
                String email = results.getString("email");
                String startDate = results.getString("startDate");
                String employeeType = results.getString("employeeType");

                Employee employee = new Employee(-1,firstName, lastName, email, phoneNumber,startDate, EmployeeCategory.valueOf(employeeType));
                employees.add(employee);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void addPrivateCar(PrivateCar car){
        privateCars.add(car);
        insertPrivateCar(car);
    }

    //insert into privateCars
    public void insertPrivateCar(PrivateCar car){

        String plateNumber = car.getPlateNumber();
        String color = car.getColor();
        int hand = car.getHand();
        int km = car.getKm();
        String yearOfProduction = car.getYearOfProduction();
        int price = car.getPrice();
        String manufacturer = car.getManufacturer();
        String category = car.getPrivateCategory().toString();
        int num_seats = car.getNumOfSeats();
        String status = car.getStatus().toString();

        final String SQL = "INSERT INTO privateCars VALUES(?,?,?,?,?,?,?,?,?,?)";

        //try with resources - resources will be closed
        try (Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            ps.setString(1, plateNumber); // First question mark will be replaced by name variable - String;
            ps.setString(2, color); // Second question mark will be replaced by name variable - Integer;
            ps.setInt(3,hand );
            ps.setInt(4, km);
            ps.setString(5, yearOfProduction);
            ps.setInt(6, price);
            ps.setString(7, manufacturer);
            ps.setString(8, category);
            ps.setInt(9,num_seats);
            ps.setString(10,status);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //load privateCar data
    public void loadPrivateCars(){

        String SQL = "select * from privateCars";
        try(Connection conn = DriverManager.getConnection(DB_URI);){
            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()){

                TypeCategory type = TypeCategory.privateCar;
                String plateNumber = results.getString("plateNumber");
                String color = results.getString("color");
                int hand = results.getInt("hand");
                int km = results.getInt("KM");
                String yearOfProduction = results.getString("yearOfProduction");
                int price = results.getInt("price");
                String manufacturer = results.getString("manufacturer");
                String category = results.getString("category");
                int num_seats = results.getInt("num_seats");
                String status = results.getString("status");

                PrivateCar car = new PrivateCar(type,PrivateCarCategory.valueOf(category), CarStatus.valueOf(status),plateNumber,hand,km,yearOfProduction,price,color,manufacturer,num_seats);
                privateCars.add(car);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public List<PrivateCar> getPrivateCarsQuery(Map<String,Object> privateCarMap){

        privateCarsQueryResults.clear();
        String SQL = "select * from privateCars where 1=1";

        //retrieving values from map
        Set<String> keySet= privateCarMap.keySet();
        for(String key:keySet){
          if(privateCarMap.get(key) instanceof String)
              SQL += " and " + key + " = '" + privateCarMap.get(key) + "'";
          else if(privateCarMap.get(key) instanceof Integer)
              SQL += " and " + key + " <= " + privateCarMap.get(key);
        }

        try(Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()) {

                TypeCategory type = TypeCategory.privateCar;
                String plateNumber = results.getString("plateNumber");
                String color = results.getString("color");
                int hand = results.getInt("hand");
                int km = results.getInt("KM");
                String yearOfProduction = results.getString("yearOfProduction");
                int price = results.getInt("price");
                String manufacturer = results.getString("manufacturer");
                String category = results.getString("category");
                int num_seats = results.getInt("num_seats");
                String status = results.getString("status");

                PrivateCar car = new PrivateCar(type, PrivateCarCategory.valueOf(category), CarStatus.valueOf(status), plateNumber, hand, km, yearOfProduction, price, color, manufacturer, num_seats);
                privateCarsQueryResults.add(car);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return privateCarsQueryResults;
    }

    public List<IndustrialCar> getIndustrialCarsQuery(Map<String, Object> industrialCarMap) {
        industrialCarsQueryResults.clear();
        String SQL = "select * from industrialCars where 1=1";

        //retrieving values from map
        Set<String> keySet= industrialCarMap.keySet();
        for(String key:keySet){
            if(industrialCarMap.get(key) instanceof String)
                SQL += " and " + key + " = '" + industrialCarMap.get(key) + "'";
            else if(industrialCarMap.get(key) instanceof Integer)
                SQL += " and " + key + " <= " + industrialCarMap.get(key);
        }

        try(Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()) {

                TypeCategory type = TypeCategory.industrialCar;
                String plateNumber = results.getString("plateNumber");
                String color = results.getString("color");
                int hand = results.getInt("hand");
                int km = results.getInt("KM");
                String yearOfProduction = results.getString("yearOfProduction");
                int price = results.getInt("price");
                String manufacturer = results.getString("manufacturer");
                String status = results.getString("status");
                int loadWeight = results.getInt("loadWeight");
                int height = results.getInt("height");


                IndustrialCar car = new IndustrialCar(plateNumber,color,hand,km,yearOfProduction,price,manufacturer,type,CarStatus.valueOf(status),loadWeight,height);
                industrialCarsQueryResults.add(car);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return industrialCarsQueryResults;

    }

    public List<Customer> getCustomersQuery(Map<String, Object> customersMap) {
        custumersQueryResults.clear();
        String SQL = "select * from customers where 1=1";

        Set<String> keySet= customersMap.keySet();
        for(String key:keySet){
            if(customersMap.get(key) instanceof String)
                SQL += " and " + key + " = '" + customersMap.get(key) + "'";
            else if(customersMap.get(key) instanceof Integer)
                SQL += " and " + key + " <= " + customersMap.get(key);
        }
        System.out.println(SQL);

        try(Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()) {

                int client_id = results.getInt("client_id");
                String firstName = results.getString("firstName");
                String lastName = results.getString("lastName");
                String phoneNumber = results.getString("phoneNumber");
                String email = results.getString("email");
                String intrestedIn = results.getString("intrestedIn");
                int maxPrice = results.getInt("maxPrice");


                Customer customer = new Customer(client_id,firstName,lastName,email,phoneNumber,PrivateCarCategory.valueOf(intrestedIn),maxPrice);
                custumersQueryResults.add(customer);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return custumersQueryResults;

    }

    public List<Employee> getEmployeesQuery(Map<String, Object> employeeMap) {
        employeesQueryResults.clear();
        String SQL = "select * from employeees where 1=1";

        Set<String> keySet= employeeMap.keySet();
        for(String key:keySet){
            if(employeeMap.get(key) instanceof String)
                SQL += " and " + key + " = '" + employeeMap.get(key) + "'";
            else if(employeeMap.get(key) instanceof Integer)
                SQL += " and " + key + " <= " + employeeMap.get(key);
        }
        System.out.println(SQL);

        try(Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()) {

                int employee_id = results.getInt("employee_id");
                String firstName = results.getString("firstName");
                String lastName = results.getString("lastName");
                String phoneNumber = results.getString("phoneNumber");
                String email = results.getString("email");
                String startDate = results.getString("startDate");
                String employeeType = results.getString("employeeType");


                Employee employee = new Employee(employee_id,firstName,lastName,email,phoneNumber,startDate,EmployeeCategory.valueOf(employeeType));
                employeesQueryResults.add(employee);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return employeesQueryResults;

    }

    public List<DealsHistory> getDealsHistoryQuery(Map<String, Object> dealsMap) {
        final List<String> ids = Arrays.asList("employeeID","customerID");

        dealsHistoriesQueryResults.clear();
        String SQL = "select * from DealsHistory where 1=1";

        Set<String> keySet= dealsMap.keySet();
        for(String key:keySet){
            if(dealsMap.get(key) instanceof String)
                SQL += " and " + key + " = '" + dealsMap.get(key) + "'";
            else if(dealsMap.get(key) instanceof Integer && ids.contains(key))
                SQL += " and " + key + " = " + dealsMap.get(key);
            else if(dealsMap.get(key) instanceof Integer)
                SQL += " and " + key + " <= " + dealsMap.get(key);

        }
        System.out.println(SQL);

        try(Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()) {

                int employee_id = results.getInt("employeeID");
                int clientId = results.getInt("customerID");
                int sellingPrice = results.getInt("sellingPrice");
                String carPlateNumber = results.getString("carPlateNumber");
                String dealDate = results.getString("dealDate");



                DealsHistory dealsHistory = new DealsHistory(employee_id,clientId,carPlateNumber,sellingPrice,dealDate);
                dealsHistoriesQueryResults.add(dealsHistory);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return dealsHistoriesQueryResults;

    }


    public void addIndustrialCar(IndustrialCar car){
        industrialCars.add(car);
        insertIndustrialCar(car);
    }

    //insert into InddustrialCars
    public void insertIndustrialCar(IndustrialCar car){

        String plateNumber = car.getPlateNumber();
        String color = car.getColor();
        int hand = car.getHand();
        int km = car.getKm();
        String yearOfProduction = car.getYearOfProduction();
        int price = car.getPrice();
        String manufacturer = car.getManufacturer();
        int loadWeight = car.getLoadWeight();
        int height = car.getHeight();
        String status = car.getStatus().toString();

        final String SQL = "INSERT INTO industrialCars VALUES(?,?,?,?,?,?,?,?,?,?)";

        //try with resources - resources will be closed
        try (Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            ps.setString(1, plateNumber); // First question mark will be replaced by name variable - String;
            ps.setString(2, color); // Second question mark will be replaced by name variable - Integer;
            ps.setInt(3,hand );
            ps.setInt(4, km);
            ps.setString(5, yearOfProduction);
            ps.setInt(6, price);
            ps.setString(7, manufacturer);
            ps.setInt(8, loadWeight);
            ps.setInt(9,height);
            ps.setString(10,status);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadIndustrialCars(){

        String SQL = "select * from industrialCars";
        try(Connection conn = DriverManager.getConnection(DB_URI);){
            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()){

                TypeCategory type = TypeCategory.industrialCar;

                String plateNumber = results.getString("plateNumber");
                String color = results.getString("color");
                int hand = results.getInt("hand");
                int km = results.getInt("KM");
                String yearOfProduction = results.getString("yearOfProduction");
                int price = results.getInt("price");
                String manufacturer = results.getString("manufacturer");
                int loadWeight = results.getInt("loadWeight");
                int height = results.getInt("height");
                String status = results.getString("status");

                IndustrialCar car = new IndustrialCar(plateNumber,color,hand,km,yearOfProduction,price,manufacturer,type,CarStatus.valueOf(status),loadWeight,height);
                industrialCars.add(car);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void addDeal(DealsHistory deal){
        dealsHistories.add(deal);
        insertDeal(deal);
    }

    public void insertDeal(DealsHistory deal) {

        int employeeID = deal.getEmployeeID();
        int customerID = deal.getClientID();
        String carPlateNumber = deal.getCarPlateNumber();
        int sellingPrice = deal.getSellingPrice();
        String deallDate = deal.getDealDate();

        final String SQL = "INSERT INTO DealsHistory VALUES(?,?,?,?,?)";

        try(Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){

            ps.setInt(1,employeeID);
            ps.setInt(2,customerID);
            ps.setString(3,carPlateNumber);
            ps.setInt(4,sellingPrice);
            ps.setString(5,deallDate);

            ps.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void loadDeals(){

        String SQL = "select * from DealsHistory";
        try(Connection conn = DriverManager.getConnection(DB_URI);){
            Statement statement = conn.createStatement();
            ResultSet results = statement.executeQuery(SQL);

            while(results.next()){

                int employeeID = results.getInt("employeeID");
                int customerID = results.getInt("customerID");
                String carPlateNumber = results.getString("carPlateNumber");
                int sellingPrice = results.getInt("sellingPrice");
                String dealDate = results.getString("dealDate");

                DealsHistory deal = new DealsHistory(employeeID,customerID,carPlateNumber,sellingPrice,dealDate);
                dealsHistories.add(deal);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteHistory(){
        final String SQL = "delete from privateCars where yearOfProduction = 204";

        //try with resources - resources will be closed
        try (Connection conn = DriverManager.getConnection(DB_URI); PreparedStatement ps = conn.prepareStatement(SQL);){


            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<PrivateCar> getPrivateCars() {
        return privateCars;
    }

    public List<IndustrialCar> getIndustrialCars(){
        return industrialCars;
    }

    public List<DealsHistory> getDealsHistory(){
        return dealsHistories;
    }



}
