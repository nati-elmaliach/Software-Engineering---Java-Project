package Cars;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class AddNewCarDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 489, 273);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 460, 224);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("Manufacturer:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 39, 74, 15);
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
				label.setBounds(103, 39, 36, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Car/Motorcycle:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(196, 39, 83, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Color:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(289, 39, 33, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Hand:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(373, 39, 33, 15);
				panel.add(label);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("Hand");
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6"}));
				comboBox.setSelectedIndex(0);
				comboBox.setBounds(373, 65, 74, 20);
				panel.add(comboBox);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("color");
				comboBox.setBounds(289, 65, 74, 20);
				panel.add(comboBox);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("Car/Motorcycle");
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Car", "Motorcycle"}));
				comboBox.setSelectedIndex(0);
				comboBox.setBounds(196, 65, 83, 20);
				panel.add(comboBox);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("Model");
				comboBox.setBounds(103, 65, 83, 20);
				panel.add(comboBox);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setToolTipText("Manufacturer");
				comboBox.setSelectedIndex(-1);
				comboBox.setBounds(10, 65, 83, 20);
				panel.add(comboBox);
			}
			{
				JLabel label = new JLabel("Horse power:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 100, 74, 15);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setToolTipText("Horse power");
				textField.setText("0");
				textField.setColumns(10);
				textField.setBounds(103, 98, 86, 20);
				panel.add(textField);
			}
			{
				JLabel label = new JLabel("Engine capacity:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 131, 89, 15);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setToolTipText("Engine capacity");
				textField_1.setText("0");
				textField_1.setColumns(10);
				textField_1.setBounds(103, 129, 86, 20);
				panel.add(textField_1);
			}
			{
				JLabel label = new JLabel("K\"M:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 157, 24, 15);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setToolTipText("Horse power");
				textField_2.setText("0");
				textField_2.setColumns(10);
				textField_2.setBounds(103, 155, 86, 20);
				panel.add(textField_2);
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
