package view.tabels;

import model.Vehicles.PrivateCar;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class privateCarsQueryTable extends AbstractTableModel implements TableListener {

    private List<PrivateCar> cars;

    private String[] columns = {"plate", "Category", "Hand", "KM", "Year", "Price", "Color", "Manufacturer", "Seats Number", "status"};


    @Override
    public void tableChange() {
        this.fireTableDataChanged();
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    public void setData(List<PrivateCar> cars) {
        System.out.println(cars);
        this.cars = cars;
    }

    @Override
    public int getRowCount() {
        return cars.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PrivateCar car = cars.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return car.getPlateNumber();
            case 1:
                return car.getPrivateCategory();
            case 2:
                return car.getHand();
            case 3:
                return car.getKm();
            case 4:
                return car.getYearOfProduction();
            case 5:
                return car.getPrice();
            case 6:
                return car.getColor();
            case 7:
                return car.getManufacturer();
            case 8:
                return car.getNumOfSeats();
            case 9:
                return car.getStatus();
        }

        return null;
    }
}

