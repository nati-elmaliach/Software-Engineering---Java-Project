package GoodLuck;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class AddNewCar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtfManufacturer;
	private JTextField txtfModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNewCar frame = new AddNewCar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddNewCar() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 561, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 534, 221);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblManufacturer = new JLabel("Manufacturer:");
		lblManufacturer.setFont(new Font("Arial", Font.PLAIN, 12));
		lblManufacturer.setBounds(10, 39, 74, 15);
		panel.add(lblManufacturer);
		
		JLabel label_1 = new JLabel("Adding a new car");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Arial", Font.PLAIN, 14));
		label_1.setBounds(103, 11, 109, 17);
		panel.add(label_1);
		
		JLabel lblModel = new JLabel("Model:");
		lblModel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblModel.setBounds(103, 39, 36, 15);
		panel.add(lblModel);
		
		JLabel lblCarMoto = new JLabel("Car/Motorcycle:");
		lblCarMoto.setFont(new Font("Arial", Font.PLAIN, 12));
		lblCarMoto.setBounds(196, 39, 83, 15);
		panel.add(lblCarMoto);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setFont(new Font("Arial", Font.PLAIN, 12));
		lblColor.setBounds(289, 39, 33, 15);
		panel.add(lblColor);
		
		JLabel lblHand = new JLabel("Hand:");
		lblHand.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHand.setBounds(373, 39, 33, 15);
		panel.add(lblHand);
		
		JComboBox cbHand = new JComboBox();
		lblHand.setLabelFor(cbHand);
		cbHand.setToolTipText("Hand");
		cbHand.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"}));
		cbHand.setSelectedIndex(-1);
		cbHand.setBounds(373, 65, 74, 20);
		panel.add(cbHand);
		
		JComboBox cbColor = new JComboBox();
		lblColor.setLabelFor(cbColor);
		cbColor.setModel(new DefaultComboBoxModel(new String[] {"Red", "Black", "White"}));
		cbColor.setToolTipText("color");
		cbColor.setBounds(289, 65, 74, 20);
		panel.add(cbColor);
		
		JComboBox cbCarMoto = new JComboBox();
		lblCarMoto.setLabelFor(cbCarMoto);
		cbCarMoto.setToolTipText("Car/Motorcycle");
		cbCarMoto.setModel(new DefaultComboBoxModel(new String[] {"Car", "Motorcycle"}));
		cbCarMoto.setBounds(196, 65, 83, 20);
		panel.add(cbCarMoto);
		
		JLabel label_6 = new JLabel("Horse power:");
		label_6.setFont(new Font("Arial", Font.PLAIN, 12));
		label_6.setBounds(10, 100, 74, 15);
		panel.add(label_6);
		
		textField = new JTextField();
		textField.setToolTipText("Horse power");
		textField.setText("0");
		textField.setColumns(10);
		textField.setBounds(103, 98, 86, 20);
		panel.add(textField);
		
		JLabel label_7 = new JLabel("Engine capacity:");
		label_7.setFont(new Font("Arial", Font.PLAIN, 12));
		label_7.setBounds(10, 131, 89, 15);
		panel.add(label_7);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Engine capacity");
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(103, 129, 86, 20);
		panel.add(textField_1);
		
		JLabel label_8 = new JLabel("K\"M:");
		label_8.setFont(new Font("Arial", Font.PLAIN, 12));
		label_8.setBounds(10, 157, 24, 15);
		panel.add(label_8);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Horse power");
		textField_2.setText("0");
		textField_2.setColumns(10);
		textField_2.setBounds(103, 155, 86, 20);
		panel.add(textField_2);
		
		JButton button = new JButton("ADD");
		button.setBounds(317, 191, 89, 23);
		panel.add(button);
		
		txtfManufacturer = new JTextField();
		lblManufacturer.setLabelFor(txtfManufacturer);
		txtfManufacturer.setToolTipText("Horse power");
		txtfManufacturer.setColumns(10);
		txtfManufacturer.setBounds(10, 65, 89, 20);
		panel.add(txtfManufacturer);
		
		txtfModel = new JTextField();
		lblModel.setLabelFor(txtfModel);
		txtfModel.setToolTipText("Horse power");
		txtfModel.setColumns(10);
		txtfModel.setBounds(103, 65, 86, 20);
		panel.add(txtfModel);
	}
}
