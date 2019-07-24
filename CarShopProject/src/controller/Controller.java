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

    public List<IndustrialCar> getIndustrialCarsQuery(FormEvent e){
        Map<String,Object> industrialCarMap = new HashMap<String,Object>();

        if(e.getPlateNumber().length() != 0)
            industrialCarMap.put("plateNumber",e.getPlateNumber());
        if(e.getColor().length() != 0)
            industrialCarMap.put("color",e.getColor());
        if (e.getHand() != -1)
            industrialCarMap.put("hand",e.getHand());
        if(e.getKm() !=-1)
            industrialCarMap.put("KM",e.getKm());
        if(e.getYearOfPrudction().length() != 0)
            industrialCarMap.put("yearOfProduction",e.getYearOfPrudction());
        if(e.getPrice() !=-1)
            industrialCarMap.put("price",e.getPrice());
        if(e.getManufacturer().length() !=0)
            industrialCarMap.put("manufacturer",e.getManufacturer());
        if(e.getLoadWeight() !=-1)
            industrialCarMap.put("loadWeight",e.getLoadWeight());
        if(e.getHeight() !=-1)
            industrialCarMap.put("height",e.getHeight());

        return db.getIndustrialCarsQuery(industrialCarMap);
    };

    public List<Customer> getCustomersQuery(FormEvent e) {

        Map <String,Object> customersMap = new HashMap<String, Object>();

        if(e.getFirstName().length() != 0)
            customersMap.put("firstName",e.getFirstName());
        if(e.getLastName().length() != 0)
            customersMap.put("lastName",e.getLastName());
        if(e.getPhoneNumber().length() != 0)
            customersMap.put("phoneNumber",e.getPhoneNumber());
        if(e.getEmail().length() != 0)
            customersMap.put("email",e.getEmail());
        if(e.getIntrestedIn().length() != 0)
            customersMap.put("intrestedIn",e.getIntrestedIn());
        if(e.getMaxPrice() !=-1)
            customersMap.put("maxPrice",e.getMaxPrice());


        return db.getCustomersQuery(customersMap);

    }

    public List<Employee> getEmployeesQuery(FormEvent e) {
        Map <String,Object> employeeMap = new HashMap<String, Object>();

        if(e.getFirstName().length() != 0)
            employeeMap.put("firstName",e.getFirstName());

        if(e.getLastName().length() != 0)
            employeeMap.put("lastName",e.getLastName());

        if(e.getPhoneNumber().length() != 0)
            employeeMap.put("phoneNumber",e.getPhoneNumber());

        if(e.getEmail().length() != 0)
            employeeMap.put("email",e.getEmail());

        if(e.getStartDate().length() != 0)
            employeeMap.put("startDate",e.getStartDate());

        if(e.getEmployeeType().length() !=0)
            employeeMap.put("employeeType",e.getEmployeeType());


        return db.getEmployeesQuery(employeeMap);

    }

    public List<DealsHistory> getDealsQuery(FormEvent e) {
        Map <String,Object> dealsMap = new HashMap<String, Object>();

        if(e.getEmployeeID() !=- 1)
            dealsMap.put("employeeID",e.getEmployeeID());

        if(e.getCustomerID() != -1)
            dealsMap.put("customerID",e.getCustomerID());

        if(e.getPlateNumber().length() != 0)
            dealsMap.put("carPlateNumber",e.getPlateNumber());

        if(e.getDealPrice()!= -1)
            dealsMap.put("sellingPrice",e.getDealPrice());

        if(e.getDealDate().length() != 0)
            dealsMap.put("dealDate",e.getDealDate());


        return db.getDealsHistoryQuery(dealsMap);


    }

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

        Customer customer = new Customer(-1,firstName,lastName,email,phoneNumber,category,maxPrice);
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


        Employee employee = new Employee(-1,firstName,lastName,email,phoneNumber,startDate,employeeCategory);
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
