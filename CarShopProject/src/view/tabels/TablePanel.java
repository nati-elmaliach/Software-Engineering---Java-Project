package view.tabels;

import model.DealsHistory;
import model.PersonEntity.Customer;
import model.PersonEntity.Employee;
import model.Vehicles.IndustrialCar;
import model.Vehicles.PrivateCar;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.List;

public class TablePanel extends JPanel {

    private JTable table;
    private PrivateCarsTableModel privateCarsTable;
    private IndustrialCarsTableModel industrialCarsTable;
    private CustomersTableModel customersTable;
    private EmployeesTableModel employeesTable;
    private DealsHistoryTableModel dealTable;



    private PrivateCarsTableModel privateCarsQueryTable;



    private QueryDataTableModel queryDataTableModel;
    private TableListener tableLisener;


    public TablePanel(){
        privateCarsTable = new PrivateCarsTableModel();
        industrialCarsTable = new IndustrialCarsTableModel();
        customersTable = new CustomersTableModel();
        employeesTable = new EmployeesTableModel();
        dealTable = new DealsHistoryTableModel();

        privateCarsQueryTable = new PrivateCarsTableModel();


        queryDataTableModel = new QueryDataTableModel();

        table = new JTable((TableModel) privateCarsTable);
        setLayout(new BorderLayout());
        add(new JScrollPane(table),BorderLayout.CENTER);
    }

    public void setTableListener(TableListener listener){
        this.tableLisener = listener;
    }

    public void setPrivateCarsData(List<PrivateCar> privateCars){
        privateCarsTable.setData(privateCars);
        setTableListener(privateCarsTable);
        table.setModel(privateCarsTable);
    }

    public void setIndustrialCarsData(List<IndustrialCar> IndustrialCars){
        industrialCarsTable.setData(IndustrialCars);
        setTableListener(industrialCarsTable);
        table.setModel(industrialCarsTable);
    }

    public void setCustomersData(List<Customer> customers){
        customersTable.setData(customers);
        setTableListener(customersTable);
        table.setModel(customersTable);
    }

    public void setEmployeeData(List<Employee> employees){
        employeesTable.setData(employees);
        setTableListener(employeesTable);
        table.setModel(employeesTable);
    }

    public void setDealData(List<DealsHistory> deals){
        dealTable.setData(deals);
        setTableListener(dealTable);
        table.setModel(dealTable);
    }

    public void setPrivateCarsQueryData(List<PrivateCar> privateCars){
        privateCarsQueryTable.setData(privateCars);
        setTableListener(privateCarsQueryTable);
        table.setModel(privateCarsQueryTable);
    }

    public void setIndustrialCarsQueryData(List<IndustrialCar> IndustrialCars){
        queryDataTableModel.industrialCarsTableModel.setData(IndustrialCars);
        setTableListener(queryDataTableModel.industrialCarsTableModel);
        table.setModel(queryDataTableModel.industrialCarsTableModel);
    }

    public void setCustomersQueryData(List<Customer> customers){
        queryDataTableModel.customersTableModel.setData(customers);
        setTableListener(queryDataTableModel.customersTableModel);
        table.setModel(queryDataTableModel.customersTableModel);
    }

    public void setEmployeeQueryData(List<Employee> employees){
        queryDataTableModel.employeesTableModel.setData(employees);
        setTableListener(queryDataTableModel.employeesTableModel);
        table.setModel(queryDataTableModel.employeesTableModel);
    }

    public void setDealQueryData(List<DealsHistory> deals){
        queryDataTableModel.dealsHistoryTableModel.setData(deals);
        setTableListener(queryDataTableModel.dealsHistoryTableModel);
        table.setModel(queryDataTableModel.dealsHistoryTableModel);
    }

    public void refresh(){
        tableLisener.tableChange();
    }

    public void setTables(List<PrivateCar> privateCars,List<IndustrialCar> IndustrialCars,List<Customer> customers,List<Employee> employees,List<DealsHistory> deals){
        privateCarsTable.setData(privateCars);
        industrialCarsTable.setData(IndustrialCars);
        customersTable.setData(customers);
        employeesTable.setData(employees);
        dealTable.setData(deals);
        table.setModel(privateCarsTable);
    }

    public void showPanelTable(String panleName){

        switch (panleName){

            case "addNewCar":
                table.setModel(privateCarsTable);
                break;
            case "addNewCustomer":
                table.setModel(customersTable);
                break;
            case "addNewEmployee":
                table.setModel(employeesTable);
                break;
            case "addNewDeal":
                table.setModel(dealTable);
                break;
            case "searchDeal":
                table.setModel(dealTable);
                break;
            case "searchEmployee":
                table.setModel(employeesTable);
                break;
            case "searchClient":
                table.setModel(customersTable);
                break;
            case "searchCar":
                table.setModel(privateCarsTable);
                break;



        }

    }


}
