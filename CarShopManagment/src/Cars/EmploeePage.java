package Cars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmploeePage {

	private JFrame frame;
	private JTable table;
	private JTextField txtfHP;
	private JTextField txtfEngineCap;
	private JTextField txtfKmMin;
	private JTextField txtfKmMax;
	private JTextField txtfPriceMin;
	private JTextField txtfPriceMax;

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
		frame.setBounds(100, 100, 1129, 559);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBounds(239, 11, 749, 186);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox cb_Manufacturer = new JComboBox();
		cb_Manufacturer.setModel(new DefaultComboBoxModel(new String[] {"k", "l", ";", ";"}));
		cb_Manufacturer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(arg0);
			}
		});
		cb_Manufacturer.setToolTipText("Manufacturer");
		cb_Manufacturer.setBounds(10, 36, 112, 20);
		panel.add(cb_Manufacturer);
		
		JComboBox cbModel = new JComboBox();
		cbModel.setToolTipText("Model");
		cbModel.setBounds(132, 36, 112, 20);
		panel.add(cbModel);
		
		JComboBox cbVehicle = new JComboBox();
		cbVehicle.setToolTipText("Car/Motorcycle");
		cbVehicle.setModel(new DefaultComboBoxModel(new String[] {"Car", "Motorcycle"}));
		cbVehicle.setSelectedIndex(0);
		cbVehicle.setBounds(254, 36, 112, 20);
		panel.add(cbVehicle);
		
		JComboBox cbColor = new JComboBox();
		cbColor.setToolTipText("color");
		cbColor.setBounds(376, 36, 112, 20);
		panel.add(cbColor);
		
		JComboBox cbHand = new JComboBox();
		cbHand.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
		cbHand.setToolTipText("Hand");
		cbHand.setBounds(502, 36, 112, 20);
		panel.add(cbHand);
		
		txtfHP = new JTextField();
		txtfHP.setToolTipText("Engine capacity");
		txtfHP.setText("0");
		txtfHP.setColumns(10);
		txtfHP.setBounds(10, 97, 86, 20);
		panel.add(txtfHP);
		
		txtfEngineCap = new JTextField();
		txtfEngineCap.setToolTipText("Horse power");
		txtfEngineCap.setText("0");
		txtfEngineCap.setColumns(10);
		txtfEngineCap.setBounds(142, 97, 86, 20);
		panel.add(txtfEngineCap);
		
		JLabel lblManufacturer = new JLabel("Manufacturer:");
		lblManufacturer.setLabelFor(cb_Manufacturer);
		lblManufacturer.setFont(new Font("Arial", Font.PLAIN, 12));
		lblManufacturer.setBounds(10, 11, 86, 14);
		panel.add(lblManufacturer);
		
		JLabel lblModel = new JLabel("Model:");
		lblModel.setLabelFor(cbModel);
		lblModel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModel.setBounds(132, 11, 86, 14);
		panel.add(lblModel);
		
		JLabel lblVehicle = new JLabel("Car/Motorcycle:");
		lblVehicle.setLabelFor(cbVehicle);
		lblVehicle.setFont(new Font("Arial", Font.PLAIN, 12));
		lblVehicle.setBounds(254, 11, 86, 14);
		panel.add(lblVehicle);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setLabelFor(cbColor);
		lblColor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblColor.setBounds(376, 11, 86, 14);
		panel.add(lblColor);
		
		JLabel lblKM = new JLabel("K\"M:");
		lblKM.setFont(new Font("Arial", Font.PLAIN, 12));
		lblKM.setBounds(264, 72, 37, 14);
		panel.add(lblKM);
		
		JLabel lblHand = new JLabel("Hand:");
		lblHand.setLabelFor(cbHand);
		lblHand.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHand.setBounds(502, 11, 69, 14);
		panel.add(lblHand);
		
		JLabel lblHP = new JLabel("Horse power:");
		lblHP.setLabelFor(txtfHP);
		lblHP.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHP.setBounds(10, 72, 86, 14);
		panel.add(lblHP);
		
		JLabel lblEngineCap = new JLabel("Engine capacity:");
		lblEngineCap.setLabelFor(txtfEngineCap);
		lblEngineCap.setFont(new Font("Arial", Font.PLAIN, 12));
		lblEngineCap.setBounds(142, 72, 102, 14);
		panel.add(lblEngineCap);
		
		txtfKmMin = new JTextField();
		txtfKmMin.setColumns(10);
		txtfKmMin.setBounds(304, 97, 62, 20);
		panel.add(txtfKmMin);
		
		txtfKmMax = new JTextField();
		txtfKmMax.setColumns(10);
		txtfKmMax.setBounds(304, 119, 62, 20);
		panel.add(txtfKmMax);
		
		JLabel lblKmMin = new JLabel("From:");
		lblKmMin.setLabelFor(txtfKmMin);
		lblKmMin.setHorizontalAlignment(SwingConstants.LEFT);
		lblKmMin.setBounds(254, 100, 37, 14);
		panel.add(lblKmMin);
		
		JLabel lblKmMax = new JLabel("To:");
		lblKmMax.setLabelFor(txtfKmMax);
		lblKmMax.setHorizontalAlignment(SwingConstants.LEFT);
		lblKmMax.setBounds(254, 122, 26, 14);
		panel.add(lblKmMax);
		
		JLabel lblPriceMin = new JLabel("From:");
		lblPriceMin.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriceMin.setBounds(387, 100, 37, 14);
		panel.add(lblPriceMin);
		
		txtfPriceMin = new JTextField();
		lblPriceMin.setLabelFor(txtfPriceMin);
		txtfPriceMin.setColumns(10);
		txtfPriceMin.setBounds(426, 97, 62, 20);
		panel.add(txtfPriceMin);
		
		JLabel lblPriceMax = new JLabel("To:");
		lblPriceMax.setHorizontalAlignment(SwingConstants.LEFT);
		lblPriceMax.setBounds(387, 122, 29, 14);
		panel.add(lblPriceMax);
		
		txtfPriceMax = new JTextField();
		lblPriceMax.setLabelFor(txtfPriceMax);
		txtfPriceMax.setColumns(10);
		txtfPriceMax.setBounds(426, 119, 62, 20);
		panel.add(txtfPriceMax);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPrice.setBounds(399, 72, 37, 14);
		panel.add(lblPrice);
		
		JButton btnShow = new JButton("Show!");
		btnShow.setBounds(272, 150, 89, 23);
		panel.add(btnShow);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 219, 393);
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
		btnAddNewCar.setBounds(0, 177, 150, 61);
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
		btnAddNewCos.setBounds(0, 249, 150, 61);
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
		btnAddNewEmployee.setBounds(0, 321, 150, 61);
		panel_1.add(btnAddNewEmployee);
		
		JLabel label_13 = new JLabel("Hello,");
		label_13.setVerticalAlignment(SwingConstants.TOP);
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setForeground(Color.BLUE);
		label_13.setFont(new Font("Arial", Font.PLAIN, 18));
		label_13.setBounds(0, 11, 182, 22);
		panel_1.add(label_13);

		
	}
	
}
