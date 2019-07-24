package model.PersonEntity;

public class Employee extends Person {

    private static int count = 0;
    private int employeeID;
    private String startDate;
    private EmployeeCategory employeeCategory;

    public Employee(int optinal_id,String firstName, String lastName, String email, String phoneNumber,String startDate,EmployeeCategory employeeCategory) {
        super(firstName, lastName, email, phoneNumber);
        if(optinal_id !=-1)
            this.employeeID = optinal_id;
        else
            this.employeeID = count++;

        this.startDate = startDate;
        this.employeeCategory = employeeCategory;
    }

    public String getEmployeeCategory() {
        return employeeCategory.toString();
    }

    public void setEmployeeCategory(EmployeeCategory employeeCategory) {
        this.employeeCategory = employeeCategory;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
