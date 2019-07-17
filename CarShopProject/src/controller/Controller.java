package controller;

import model.Database;
import model.DealsHistory;
import model.PersonEntity.Customer;
import model.PersonEntity.Employee;
import model.PersonEntity.EmployeeCategory;
import model.Vehicles.*;
import view.forms.FormEvent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Controller {

    //Singelton db instance
    Database db = new Database();


    public List<PrivateCar> getPrivateCars(){
        return db.getPrivateCars();
    };

    public List<PrivateCar> getPrivateCarsQuery(FormEvent e){
        Map<String,Object> privateCarMap = new HashMap<String,Object>();

        if(e.getPlateNumber().length() != 0)
            privateCarMap.put("plateNumber",e.getPlateNumber());
        if(e.getColor().length() != 0)
            privateCarMap.put("color",e.getColor());
        if (e.getHand() != -1)
            privateCarMap.put("hand",e.getHand());
        if(e.getKm() !=-1)
            privateCarMap.put("KM",e.getKm());
        if(e.getYearOfPrudction().length() != 0)
            privateCarMap.put("yearOfProduction",e.getYearOfPrudction());
        if(e.getPrice() !=-1)
            privateCarMap.put("price",e.getPrice());
        if(e.getManufacturer().length() !=0)
            privateCarMap.put("manufacturer",e.getManufacturer());
        if(e.getPrivateCarCategory().length() != 0)
            privateCarMap.put("category",e.getPrivateCarCategory());
        if(e.getNumOfSeats() !=-1)
        privateCarMap.put("num_seats",e.getNumOfSeats());

        return db.getPrivateCarsQuery(privateCarMap);
    };

    public List<IndustrialCar> getIndustrialCars(){
        return db.getIndustrialCars();
    };

    public List<Customer> getCustomers(){
        return db.getCustomers();
    };

    public List<Employee> getEmployees(){
        return db.getEmployees();
    };

    public List<DealsHistory> getDeals(){
        return db.getDealsHistory();
    }



    public void addNewCar(FormEvent event){

        String plateNumber  = event.getPlateNumber();
        int hand = event.getHand();
        int km = event.getKm();
        String yearOfProduction = event.getYearOfPrudction();
        int price = event.getPrice();
        String color = event.getColor();
        String manufacturer = event.getManufacturer();
        CarStatus status = CarStatus.FOR_sale;

        //if private car form
        if(event.getTypeCategoty() == 0){

            TypeCategory type = TypeCategory.privateCar;
            String categoryString = event.getPrivateCarCategory();
            PrivateCarCategory category = PrivateCarCategory.valueOf(categoryString);
            int numOfSeats = event.getNumOfSeats();

            PrivateCar privateCar  = new PrivateCar(type,category,status,plateNumber,hand,km,yearOfProduction,price,color,manufacturer,numOfSeats);
            db.addPrivateCar(privateCar);
        }
        //Industrial car
        else if(event.getTypeCategoty() == 1){
            TypeCategory type = TypeCategory.industrialCar;
            int loadWeight = event.getLoadWeight();
            int height = event.getHeight();

            IndustrialCar industrialCar = new IndustrialCar(plateNumber,color,hand,km,yearOfProduction,price,manufacturer,type,status,loadWeight,height);
            db.addIndustrialCar(industrialCar);
        }
    }

    public void addNewCustomer(FormEvent event){
        String firstName = event.getFirstName();
        String lastName = event.getLastName();
        String email = event.getEmail();
        String phoneNumber = event.getPhoneNumber();

        String intrestedCategory = event.getIntrestedIn();
        PrivateCarCategory category = PrivateCarCategory.valueOf(intrestedCategory);

        int maxPrice = event.getMaxPrice();

        Customer customer = new Customer(firstName,lastName,email,phoneNumber,category,maxPrice);
        db.addCustomer(customer);
    }

    public void addNewEmployee(FormEvent event){
        String firstName = event.getFirstName();
        String lastName = event.getLastName();
        String email = event.getEmail();
        String phoneNumber = event.getPhoneNumber();
        String startDate = event.getStartDate();

        String employeeType = event.getEmployeeType();
        EmployeeCategory employeeCategory = EmployeeCategory.valueOf(employeeType);


        Employee employee = new Employee(firstName,lastName,email,phoneNumber,startDate,employeeCategory);
        db.addEmployee(employee);
    }

    public void addDealsHistory(FormEvent event){
        int employeeID = event.getEmployeeID();
        int customerID = event.getCustomerID();
        String plateNumber = event.getPlateNumber();
        int price = event.getDealPrice();
        String date = event.getDealDate();

        DealsHistory dealHistory = new DealsHistory(employeeID,customerID,plateNumber,price,date);
        db.addDeal(dealHistory);
    }

}
