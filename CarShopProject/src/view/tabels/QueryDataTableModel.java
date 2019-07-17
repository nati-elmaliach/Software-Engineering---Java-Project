package view.tabels;

import model.Vehicles.PrivateCar;

import java.util.List;

public class QueryDataTableModel {

    public PrivateCarsTableModel privateCarsTableModel;
    public IndustrialCarsTableModel industrialCarsTableModel;
    public CustomersTableModel customersTableModel;
    public EmployeesTableModel employeesTableModel;
    public DealsHistoryTableModel dealsHistoryTableModel;


    public QueryDataTableModel() {
        privateCarsTableModel = new PrivateCarsTableModel();
        industrialCarsTableModel = new IndustrialCarsTableModel();
        customersTableModel = new CustomersTableModel();
        employeesTableModel = new EmployeesTableModel();
        dealsHistoryTableModel = new DealsHistoryTableModel();
    }

    public void setPrivateCarsData(List<PrivateCar> privateCars){
        privateCarsTableModel.setData(privateCars);
    }

    public void setPrivateCarsRowsandCols(){
        privateCarsTableModel.getRowCount();
        privateCarsTableModel.getColumnCount();
    }

}
