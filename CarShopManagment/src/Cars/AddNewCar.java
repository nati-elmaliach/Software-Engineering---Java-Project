package Cars;

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

public class AddNewCar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		
		JLabel label = new JLabel("Manufacturer:");
		label.setFont(new Font("Arial", Font.PLAIN, 12));
		label.setBounds(10, 39, 74, 15);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Adding a new car");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Arial", Font.PLAIN, 14));
		label_1.setBounds(103, 11, 109, 17);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Model:");
		label_2.setFont(new Font("Arial", Font.PLAIN, 12));
		label_2.setBounds(103, 39, 36, 15);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Car/Motorcycle:");
		label_3.setFont(new Font("Arial", Font.PLAIN, 12));
		label_3.setBounds(196, 39, 83, 15);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Color:");
		label_4.setFont(new Font("Arial", Font.PLAIN, 12));
		label_4.setBounds(289, 39, 33, 15);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Hand:");
		label_5.setFont(new Font("Arial", Font.PLAIN, 12));
		label_5.setBounds(373, 39, 33, 15);
		panel.add(label_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Hand");
		comboBox.setSelectedIndex(-1);
		comboBox.setBounds(373, 65, 74, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("color");
		comboBox_1.setBounds(289, 65, 74, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setToolTipText("Car/Motorcycle");
		comboBox_2.setSelectedIndex(-1);
		comboBox_2.setBounds(196, 65, 83, 20);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setToolTipText("Model");
		comboBox_3.setBounds(103, 65, 83, 20);
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setToolTipText("Manufacturer");
		comboBox_4.setSelectedIndex(-1);
		comboBox_4.setBounds(10, 65, 83, 20);
		panel.add(comboBox_4);
		
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
	}
}
