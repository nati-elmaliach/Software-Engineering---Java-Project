package view.tabels;


import model.DealsHistory;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DealsHistoryTableModel extends AbstractTableModel implements TableListener{

    private List<DealsHistory> deals;
    private String[] columns = {"Employee ID","Cusromer ID","Plate Number","Price","Date"};

    @Override

    public void tableChange() {
        this.fireTableDataChanged();
    }

    public void setData(List<DealsHistory> deals) {
        this.deals = deals;
    }

    @Override
    public int getRowCount() {
        return deals.size();
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
        DealsHistory dealsHistory = deals.get(rowIndex);

        switch (columnIndex){
            case 0:
                return dealsHistory.getEmployeeID();
            case 1:
                return dealsHistory.getClientID();
            case 2:
                return dealsHistory.getCarPlateNumber();
            case 3:
                return dealsHistory.getSellingPrice();
            case 4:
                return dealsHistory.getDealDate();
        }
        return null;
    }
}
