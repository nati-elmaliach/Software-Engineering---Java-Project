package GoodLuck;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;

public class EmploeePage {

	private JFrame frame;
	private JTable table;
	private JTextField txtfHP;
	private JTextField txtfEngineCap;
	private JTextField txtfKmMin;
	private JTextField txtfKmMax;
	private JTextField txtfPriceMin;
	private JTextField txtfPriceMax;
	private JTable table_1;
	private JTextField txtfManufacturer;
	private JTextField txtfModel;
	private JTextField txtfLicenseNum;
	private JTextField txtfPreviousOwners;
	private JTextField YearOfManufacture;
	private JTextField txtfAccelerate;
	private JTextField txtfMaxSpeed;
	private JTextField txtfLoadWeight;
	private JTextField txtfHeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					EmploeePage window = new EmploeePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels (JLayeredPane layeredPane, JPanel panel1)
	{
		layeredPane.removeAll();
		layeredPane.add(panel1);
		layeredPane.repaint();
		layeredPane.revalidate();
		layeredPane.setVisible(true);
	}
	/**
	 * Create the application.
	 */
	public EmploeePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1262, 559);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(239, 11, 997, 326);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		/*JPanel panelSportCar = new JPanel();
		JPanel panelTruck = new JPanel();
		JPanel panelJeep = new JPanel();
		JPanel panelMotorcycle = new JPanel();
		*/
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(10, 138, 439, 177);
		panel.add(layeredPane);
		layeredPane.setLayout(null);
		layeredPane.setVisible(false);
		
		JPanel panelJeep = new JPanel();
		panelJeep.setBounds(0, 0, 439, 166);
		layeredPane.add(panelJeep);
		panelJeep.setLayout(null);
		
		JLabel lblJeepType = new JLabel("Jeep type:");
		lblJeepType.setFont(new Font("Arial", Font.PLAIN, 12));
		lblJeepType.setBounds(0, 0, 86, 14);
		panelJeep.add(lblJeepType);
		
		JComboBox cbJeepType = new JComboBox();
		cbJeepType.setModel(new DefaultComboBoxModel(new String[] {"Area", "Leisure"}));
		cbJeepType.setToolTipText("Jeep type");
		cbJeepType.setBounds(0, 25, 103, 20);
		panelJeep.add(cbJeepType);
		
		JPanel panelTruck = new JPanel();
		panelTruck.setBounds(0, 0, 439, 166);
		layeredPane.add(panelTruck);
		panelTruck.setLayout(null);
		
		JLabel lblLoadWeight = new JLabel("Load weight:");
		lblLoadWeight.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoadWeight.setBounds(0, 0, 102, 14);
		panelTruck.add(lblLoadWeight);
		
		txtfLoadWeight = new JTextField();
		lblLoadWeight.setLabelFor(txtfLoadWeight);
		txtfLoadWeight.setToolTipText("Load weight");
		txtfLoadWeight.setColumns(10);
		txtfLoadWeight.setBounds(0, 25, 112, 20);
		panelTruck.add(txtfLoadWeight);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHeight.setBounds(0, 56, 102, 14);
		panelTruck.add(lblHeight);
		
		txtfHeight = new JTextField();
		lblHeight.setLabelFor(txtfHeight);
		txtfHeight.setToolTipText("Height");
		txtfHeight.setColumns(10);
		txtfHeight.setBounds(0, 81, 112, 20);
		panelTruck.add(txtfHeight);
		
		JPanel panelSportCar = new JPanel();
		panelSportCar.setBounds(0, 0, 439, 166);
		layeredPane.add(panelSportCar);
		panelSportCar.setLayout(null);
		
		JLabel lblAccelerate = new JLabel("Accelerate:");
		lblAccelerate.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAccelerate.setBounds(0, 0, 102, 14);
		panelSportCar.add(lblAccelerate);
		
		txtfAccelerate = new JTextField();
		lblAccelerate.setLabelFor(txtfAccelerate);
		txtfAccelerate.setToolTipText("Accelerate");
		txtfAccelerate.setColumns(10);
		txtfAccelerate.setBounds(0, 25, 112, 20);
		panelSportCar.add(txtfAccelerate);
		
		JLabel lblMaxSpeed = new JLabel("Max speed:");
		lblMaxSpeed.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMaxSpeed.setBounds(0, 56, 102, 14);
		panelSportCar.add(lblMaxSpeed);
		
		txtfMaxSpeed = new JTextField();
		lblMaxSpeed.setLabelFor(txtfMaxSpeed);
		txtfMaxSpeed.setToolTipText("Max speed");
		txtfMaxSpeed.setColumns(10);
		txtfMaxSpeed.setBounds(0, 81, 112, 20);
		panelSportCar.add(txtfMaxSpeed);
		
		JPanel panelMotorcycle = new JPanel();
		panelMotorcycle.setBounds(0, 0, 439, 166);
		layeredPane.add(panelMotorcycle);
		panelMotorcycle.setLayout(null);
		
		JLabel lblIsBox = new JLabel("Box?");
		lblIsBox.setFont(new Font("Arial", Font.PLAIN, 12));
		lblIsBox.setBounds(0, 11, 86, 14);
		panelMotorcycle.add(lblIsBox);
		
		JComboBox cbIsBox = new JComboBox();
		lblIsBox.setLabelFor(cbIsBox);
		cbIsBox.setModel(new DefaultComboBoxModel(new String[] {"With", "Without"}));
		cbIsBox.setToolTipText("Box");
		cbIsBox.setBounds(0, 36, 103, 20);
		panelMotorcycle.add(cbIsBox);
		
		JLabel lblWheels = new JLabel("Wheels:");
		lblWheels.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWheels.setBounds(0, 67, 86, 14);
		panelMotorcycle.add(lblWheels);
		
		JComboBox cbWheels = new JComboBox();
		lblWheels.setLabelFor(cbWheels);
		cbWheels.setModel(new DefaultComboBoxModel(new String[] {"2", "3"}));
		cbWheels.setToolTipText("Wheels");
		cbWheels.setBounds(0, 92, 103, 20);
		panelMotorcycle.add(cbWheels);
		
		JLabel lblMotorcycleType = new JLabel("Motorcycle type:");
		lblMotorcycleType.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMotorcycleType.setBounds(139, 11, 86, 14);
		panelMotorcycle.add(lblMotorcycleType);
		
		JComboBox cbMotorcycleType = new JComboBox();
		lblMotorcycleType.setLabelFor(cbMotorcycleType);
		cbMotorcycleType.setModel(new DefaultComboBoxModel(new String[] {"Sport", "Scooter", "Electric"}));
		cbMotorcycleType.setToolTipText("Motorcycle type");
		cbMotorcycleType.setBounds(139, 36, 103, 20);
		panelMotorcycle.add(cbMotorcycleType);
		JComboBox cbVehicle = new JComboBox();
		cbVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(cbVehicle.getSelectedItem().toString()=="Motorcycle")
					switchPanels(layeredPane, panelMotorcycle);
				
				if(cbVehicle.getSelectedItem().toString()=="Sport car")
					switchPanels(layeredPane, panelSportCar);

				if(cbVehicle.getSelectedItem().toString()=="Truck")
					switchPanels(layeredPane, panelTruck);

				if(cbVehicle.getSelectedItem().toString()=="Jeep")
					switchPanels(layeredPane, panelJeep);
					
			}
			
		});

			
		cbVehicle.setToolTipText("Vehicle");
		cbVehicle.setModel(new DefaultComboBoxModel(new String[] {"Car", "Motorcycle", "Sport car", "Jeep", "Truck"}));
		cbVehicle.setSelectedIndex(0);
		cbVehicle.setBounds(499, 36, 112, 20);
		panel.add(cbVehicle);
		
		JComboBox cbColor = new JComboBox();
		cbColor.setModel(new DefaultComboBoxModel(new String[] {"Red", "Black", "White"}));
		cbColor.setToolTipText("color");
		cbColor.setBounds(621, 36, 112, 20);
		panel.add(cbColor);
		
		JComboBox cbHand = new JComboBox();
		cbHand.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		cbHand.setToolTipText("Hand");
		cbHand.setBounds(747, 36, 112, 20);
		panel.add(cbHand);
		
		txtfHP = new JTextField();
		txtfHP.setToolTipText("Horse power");
		txtfHP.setText("0");
		txtfHP.setColumns(10);
		txtfHP.setBounds(275, 97, 86, 20);
		panel.add(txtfHP);
		
		txtfEngineCap = new JTextField();
		txtfEngineCap.setToolTipText("Engine capacity");
		txtfEngineCap.setText("0");
		txtfEngineCap.setColumns(10);
		txtfEngineCap.setBounds(387, 97, 86, 20);
		panel.add(txtfEngineCap);
		
		JLabel lblManufacturer = new JLabel("Manufacturer:");
		lblManufacturer.setFont(new Font("Arial", Font.PLAIN, 12));
		lblManufacturer.setBounds(275, 11, 86, 14);
		panel.add(lblManufacturer);
		
		JLabel lblModel = new JLabel("Model:");
		lblModel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModel.setBounds(387, 11, 62, 14);
		panel.add(lblModel);
		
		JLabel lblVehicle = new JLabel("Vehicle:");
		lblVehicle.setLabelFor(cbVehicle);
		lblVehicle.setFont(new Font("Arial", Font.PLAIN, 12));
		lblVehicle.setBounds(499, 11, 86, 14);
		panel.add(lblVehicle);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setLabelFor(cbColor);
		lblColor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblColor.setBounds(621, 11, 86, 14);
		panel.add(lblColor);
		
		JLabel lblKM = new JLabel("K\"M:");
		lblKM.setFont(new Font("Arial", Font.PLAIN, 12));
		lblKM.setBounds(509, 72, 37, 14);
		panel.add(lblKM);
		
		JLabel lblHand = new JLabel("Hand:");
		lblHand.setLabelFor(cbHand);
		lblHand.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHand.setBounds(747, 11, 69, 14);
		panel.add(lblHand);
		
		JLabel lblHP = new JLabel("Horse power:");
		lblHP.setLabelFor(txtfHP);
		lblHP.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHP.setBounds(275, 72, 86, 14);
		panel.add(lblHP);
		
		JLabel lblEngineCap = new JLabel("Engine capacity:");
		lblEngineCap.setLabelFor(txtfEngineCap);
		lblEngineCap.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEngineCap.setBounds(387, 72, 102, 14);
		panel.add(lblEngineCap);
		
		txtfKmMin = new JTextField();
		txtfKmMin.setColumns(10);
		txtfKmMin.setBounds(549, 97, 62, 20);
		panel.add(txtfKmMin);
		
		txtfKmMax = new JTextField();
		txtfKmMax.setColumns(10);
		txtfKmMax.setBounds(549, 119, 62, 20);
		panel.add(txtfKmMax);
		
		JLabel lblKmMin = new JLabel("From:");
		lblKmMin.setLabelFor(txtfKmMin);
		lblKmMin.setHorizontalAlignment(SwingConstants.LEFT);
		lblKmMin.setBounds(499, 100, 37, 14);
		panel.add(lblKmMin);
		
		JLabel lblKmMax = new JLabel("To:");
		lblKmMax.setLabelFor(txtfKmMax);
		lblKmMax.setHorizontalAlignment(SwingConstants.LEFT);
		lblKmMax.setBounds(499, 122, 26, 14);
		panel.add(lblKmMax);
		
		JLabel lblPriceMin = new JLabel("From:");
		lblPriceMin.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriceMin.setBounds(632, 100, 37, 14);
		panel.add(lblPriceMin);
		
		txtfPriceMin = new JTextField();
		lblPriceMin.setLabelFor(txtfPriceMin);
		txtfPriceMin.setColumns(10);
		txtfPriceMin.setBounds(671, 97, 62, 20);
		panel.add(txtfPriceMin);
		
		JLabel lblPriceMax = new JLabel("To:");
		lblPriceMax.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriceMax.setBounds(632, 122, 29, 14);
		panel.add(lblPriceMax);
		
		txtfPriceMax = new JTextField();
		lblPriceMax.setLabelFor(txtfPriceMax);
		txtfPriceMax.setColumns(10);
		txtfPriceMax.setBounds(671, 119, 62, 20);
		panel.add(txtfPriceMax);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPrice.setBounds(644, 72, 37, 14);
		panel.add(lblPrice);
		
		JButton btnShow = new JButton("Show!");
		btnShow.setBounds(842, 238, 89, 23);
		panel.add(btnShow);
		
		txtfManufacturer = new JTextField();
		lblManufacturer.setLabelFor(txtfManufacturer);
		txtfManufacturer.setToolTipText("Manufactorer");
		txtfManufacturer.setColumns(10);
		txtfManufacturer.setBounds(275, 36, 86, 20);
		panel.add(txtfManufacturer);
		
		txtfModel = new JTextField();
		lblModel.setLabelFor(txtfModel);
		txtfModel.setToolTipText("Model");
		txtfModel.setColumns(10);
		txtfModel.setBounds(387, 36, 86, 20);
		panel.add(txtfModel);
		
		JLabel lblLicenseNum = new JLabel("License number:");
		lblLicenseNum.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLicenseNum.setBounds(10, 11, 102, 14);
		panel.add(lblLicenseNum);
		
		txtfLicenseNum = new JTextField();
		lblLicenseNum.setLabelFor(txtfLicenseNum);
		txtfLicenseNum.setToolTipText("License number");
		txtfLicenseNum.setColumns(10);
		txtfLicenseNum.setBounds(10, 36, 112, 20);
		panel.add(txtfLicenseNum);
		
		JLabel lblYearOfManufacture = new JLabel("Year of manufacture:");
		lblYearOfManufacture.setFont(new Font("Arial", Font.PLAIN, 12));
		lblYearOfManufacture.setBounds(10, 72, 124, 14);
		panel.add(lblYearOfManufacture);
		
		JLabel lblPreviousOwners = new JLabel("Previous owners:");
		lblPreviousOwners.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPreviousOwners.setBounds(144, 11, 103, 14);
		panel.add(lblPreviousOwners);
		
		txtfPreviousOwners = new JTextField();
		lblPreviousOwners.setLabelFor(txtfPreviousOwners);
		txtfPreviousOwners.setToolTipText("Previous owners");
		txtfPreviousOwners.setColumns(10);
		txtfPreviousOwners.setBounds(144, 36, 103, 20);
		panel.add(txtfPreviousOwners);
		
		JLabel lblFuelType = new JLabel("Fuel type:");
		lblFuelType.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFuelType.setBounds(144, 72, 86, 14);
		panel.add(lblFuelType);
		
		YearOfManufacture = new JTextField();
		lblYearOfManufacture.setLabelFor(YearOfManufacture);
		YearOfManufacture.setToolTipText("Year of manufacture");
		YearOfManufacture.setBounds(10, 97, 112, 20);
		panel.add(YearOfManufacture);
		YearOfManufacture.setColumns(10);
		
		JComboBox cbFuelType = new JComboBox();
		cbFuelType.setToolTipText("Fuel type");
		lblFuelType.setLabelFor(cbFuelType);
		cbFuelType.setModel(new DefaultComboBoxModel(new String[] {"Gasoline", "Diesel", "Natural gaz"}));
		cbFuelType.setBounds(144, 97, 103, 20);
		panel.add(cbFuelType);
		
				

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 219, 509);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnAddNewCar = new JButton("Add new car");
		btnAddNewCar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				AddNewCarDialog newCar = new AddNewCarDialog();
				newCar.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				newCar.setVisible(true);
				
				/*AddNewCar frame = new AddNewCar();
				frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				*/
			}
		});
		btnAddNewCar.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddNewCar.setBounds(0, 70, 150, 61);
		panel_1.add(btnAddNewCar);
		
		JButton btnAddNewCos = new JButton("Add new costumer");
		btnAddNewCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddNewCustomerDialog newCostumer = new AddNewCustomerDialog();
				newCostumer.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				newCostumer.setVisible(true);
			}
		});
		btnAddNewCos.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddNewCos.setBounds(0, 142, 150, 61);
		panel_1.add(btnAddNewCos);
		
		JButton btnAddNewEmployee = new JButton("Add new employee");
		btnAddNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddNewEmployeeDialog newEmployee= new AddNewEmployeeDialog();
				newEmployee.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				newEmployee.setVisible(true);
			}
		});
		btnAddNewEmployee.setHorizontalAlignment(SwingConstants.LEFT);
		btnAddNewEmployee.setBounds(0, 214, 150, 61);
		panel_1.add(btnAddNewEmployee);
		
		//String userName= from DB;
		JLabel label_13 = new JLabel("Hello,");//("Hello"+ userName);
		label_13.setVerticalAlignment(SwingConstants.TOP);
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setForeground(Color.BLUE);
		label_13.setFont(new Font("Arial", Font.PLAIN, 18));
		label_13.setBounds(0, 11, 182, 22);
		panel_1.add(label_13);
		
			
	}
}
