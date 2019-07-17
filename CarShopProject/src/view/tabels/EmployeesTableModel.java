package view.tabels;

import model.PersonEntity.Employee;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class EmployeesTableModel extends AbstractTableModel implements TableListener {

    private List<Employee> employees;
    private String[] columns = {"ID","First Name","Last Name","Email","Phone Number","Start Date","Type"};

    @Override
    public void tableChange() {
        this.fireTableDataChanged();
    }

    public void setData(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public int getRowCount() {
        return employees.size();
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Employee employee = employees.get(rowIndex);

        switch (columnIndex){
            case 0:
                return employee.getEmployeeID();
            case 1:
                return employee.getFirstName();
            case 2:
                return employee.getLastName();
            case 3:
                return employee.getEmail();
            case 4:
                return employee.getPhoneNumber();
            case 5:
                return employee.getStartDate();
            case 6:
                return employee.getEmployeeCategory();
        }
        return null;
    }
}
