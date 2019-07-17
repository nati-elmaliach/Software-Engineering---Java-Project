package view.tabels;

import model.Vehicles.IndustrialCar;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class IndustrialCarsTableModel extends AbstractTableModel implements TableListener {

    private List<IndustrialCar> cars;
    private String[] columns = {"plate","Hand","KM","Year","Price","Color","Manufacturer","Load Weight","Height","status"};

    @Override
    public void tableChange() {
        this.fireTableDataChanged();
    }

    public void setData(List<IndustrialCar> cars) {
        this.cars = cars;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
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
        IndustrialCar car = cars.get(rowIndex);
        switch(columnIndex){
            case 0:
                return car.getPlateNumber();
            case 1:
                return car.getHand();
            case 2:
                return car.getKm();
            case 3:
                return car.getYearOfProduction();
            case 4:
                return car.getPrice();
            case 5:
                return car.getColor();
            case 6:
                return car.getManufacturer();
            case 7 :
                return car.getLoadWeight();
            case 8:
                return car.getHeight();
            case 9:
                return car.getStatus();
        }
        return null;
    }
}
