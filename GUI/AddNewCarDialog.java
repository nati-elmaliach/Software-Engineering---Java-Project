package GoodLuck;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AddNewCarDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_3;
	private JTextField txtfManufacturer;
	private JTextField txtfModel;
	private JTextField txtfPreviousOwners;
	private JTextField txtfHP;
	private JTextField txtfEngineCapacity;
	private JTextField txtfYearOfManufacturer;
	private JTextField txtfKM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddNewCarDialog dialog = new AddNewCarDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddNewCarDialog() {
		setBounds(100, 100, 339, 453);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 304, 359);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("Manufacturer:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 88, 74, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Adding a new car");
				label.setForeground(Color.BLACK);
				label.setFont(new Font("Arial", Font.PLAIN, 14));
				label.setBounds(103, 11, 109, 17);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Model:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 114, 36, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Car/Motorcycle:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 64, 83, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Color:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 212, 33, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Hand:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 165, 33, 15);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("Hand");
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
				comboBox.setSelectedIndex(0);
				comboBox.setBounds(125, 163, 89, 20);
				panel.add(comboBox);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Red", "Black", "White"}));
				comboBox.setToolTipText("color");
				comboBox.setBounds(125, 210, 89, 20);
				panel.add(comboBox);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("Car/Motorcycle");
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Car", "Motorcycle"}));
				comboBox.setSelectedIndex(0);
				comboBox.setBounds(125, 62, 89, 20);
				panel.add(comboBox);
			}
			{
				JLabel label = new JLabel("Horse power:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 238, 74, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Engine capacity:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 263, 89, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("K\"M:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 314, 24, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("License number:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 39, 102, 14);
				panel.add(label);
			}
			{
				textField_3 = new JTextField();
				textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
				textField_3.setToolTipText("License number");
				textField_3.setColumns(10);
				textField_3.setBounds(125, 36, 112, 20);
				panel.add(textField_3);
			}
			{
				JLabel label = new JLabel("Previous owners:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(-1, 140, 103, 14);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Fuel type:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 191, 86, 14);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("Fuel type");
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gasoline", "Diesel", "Natural gaz"}));
				comboBox.setFont(new Font("Arial", Font.PLAIN, 12));
				comboBox.setBounds(125, 188, 89, 20);
				panel.add(comboBox);
			}
			{
				JLabel label = new JLabel("Year of manufacture:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(0, 289, 124, 14);
				panel.add(label);
			}
			{
				txtfManufacturer = new JTextField();
				txtfManufacturer.setToolTipText("Manufacturer");
				txtfManufacturer.setFont(new Font("Arial", Font.PLAIN, 12));
				txtfManufacturer.setColumns(10);
				txtfManufacturer.setBounds(125, 85, 112, 20);
				panel.add(txtfManufacturer);
			}
			{
				txtfModel = new JTextField();
				txtfModel.setToolTipText("Model");
				txtfModel.setFont(new Font("Arial", Font.PLAIN, 12));
				txtfModel.setColumns(10);
				txtfModel.setBounds(125, 111, 112, 20);
				panel.add(txtfModel);
			}
			{
				txtfPreviousOwners = new JTextField();
				txtfPreviousOwners.setToolTipText("Previous owners");
				txtfPreviousOwners.setFont(new Font("Arial", Font.PLAIN, 12));
				txtfPreviousOwners.setColumns(10);
				txtfPreviousOwners.setBounds(125, 137, 112, 20);
				panel.add(txtfPreviousOwners);
			}
			{
				txtfHP = new JTextField();
				txtfHP.setToolTipText("Horse power");
				txtfHP.setFont(new Font("Arial", Font.PLAIN, 12));
				txtfHP.setColumns(10);
				txtfHP.setBounds(125, 235, 112, 20);
				panel.add(txtfHP);
			}
			{
				txtfEngineCapacity = new JTextField();
				txtfEngineCapacity.setToolTipText("Engine capacity");
				txtfEngineCapacity.setFont(new Font("Arial", Font.PLAIN, 12));
				txtfEngineCapacity.setColumns(10);
				txtfEngineCapacity.setBounds(125, 260, 112, 20);
				panel.add(txtfEngineCapacity);
			}
			{
				txtfYearOfManufacturer = new JTextField();
				txtfYearOfManufacturer.setToolTipText("Year of manufacturer");
				txtfYearOfManufacturer.setFont(new Font("Arial", Font.PLAIN, 12));
				txtfYearOfManufacturer.setColumns(10);
				txtfYearOfManufacturer.setBounds(125, 286, 112, 20);
				panel.add(txtfYearOfManufacturer);
			}
			{
				txtfKM = new JTextField();
				txtfKM.setToolTipText("K\"M");
				txtfKM.setFont(new Font("Arial", Font.PLAIN, 12));
				txtfKM.setColumns(10);
				txtfKM.setBounds(125, 311, 112, 20);
				panel.add(txtfKM);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				okButton.setActionCommand("Save");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
