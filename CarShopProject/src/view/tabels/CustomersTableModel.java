package view.tabels;

import model.PersonEntity.Customer;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CustomersTableModel extends AbstractTableModel implements  TableListener {

    private List<Customer> customers;
    private String[] columns = {"ID","First Name","Last Name","Email","Phone Number","Intrested in","Max Price"};

    @Override
    public void tableChange() {
        this.fireTableDataChanged();
    }

    public void setData(List<Customer> customers) {
        this.customers = customers;
    }
    @Override
    public int getRowCount() {
        return customers.size();
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
        Customer customer = customers.get(rowIndex);

        switch (columnIndex){
            case 0:
                return customer.getId();
            case 1:
                return customer.getFirstName();
            case 2:
                return customer.getLastName();
            case 3:
                return customer.getEmail();
            case 4:
                return customer.getPhoneNumber();
            case 5:
                return customer.getLokingFor();
            case 6:
                return customer.getMaxPrice();
        }
        return null;
    }
}
