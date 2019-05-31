package Cars;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AddNewEmployeeDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddNewEmployeeDialog dialog = new AddNewEmployeeDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddNewEmployeeDialog() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 434, 277);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				textField = new JTextField();
				textField.setToolTipText("Horse power");
				textField.setColumns(10);
				textField.setBounds(113, 168, 138, 20);
				panel.add(textField);
			}
			{
				JLabel lblWorkerNumber = new JLabel("Worker number:");
				lblWorkerNumber.setFont(new Font("Arial", Font.PLAIN, 12));
				lblWorkerNumber.setBounds(10, 170, 93, 15);
				panel.add(lblWorkerNumber);
			}
			{
				JLabel label = new JLabel("Address:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 144, 74, 15);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setToolTipText("Horse power");
				textField_1.setColumns(10);
				textField_1.setBounds(113, 142, 138, 20);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setToolTipText("Horse power");
				textField_2.setColumns(10);
				textField_2.setBounds(113, 118, 138, 20);
				panel.add(textField_2);
			}
			{
				JLabel label = new JLabel("E-Mail:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 118, 47, 15);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("Phone number:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 90, 89, 15);
				panel.add(label);
			}
			{
				textField_3 = new JTextField();
				textField_3.setToolTipText("Engine capacity");
				textField_3.setColumns(10);
				textField_3.setBounds(113, 90, 38, 20);
				panel.add(textField_3);
			}
			{
				textField_4 = new JTextField();
				textField_4.setToolTipText("Horse power");
				textField_4.setColumns(10);
				textField_4.setBounds(165, 90, 86, 20);
				panel.add(textField_4);
			}
			{
				textField_5 = new JTextField();
				textField_5.setToolTipText("Horse power");
				textField_5.setColumns(10);
				textField_5.setBounds(113, 59, 138, 20);
				panel.add(textField_5);
			}
			{
				JLabel label = new JLabel("Name:");
				label.setFont(new Font("Arial", Font.PLAIN, 12));
				label.setBounds(10, 59, 74, 15);
				panel.add(label);
			}
			{
				JLabel lblAddingANew = new JLabel("Adding a new employee");
				lblAddingANew.setFont(new Font("Arial", Font.PLAIN, 14));
				lblAddingANew.setBounds(103, 11, 178, 35);
				panel.add(lblAddingANew);
			}
			{
				JLabel lblStartOnDate = new JLabel("Start on date:");
				lblStartOnDate.setFont(new Font("Arial", Font.PLAIN, 12));
				lblStartOnDate.setBounds(10, 199, 74, 15);
				panel.add(lblStartOnDate);
			}
			{
				textField_6 = new JTextField();
				textField_6.setToolTipText("Horse power");
				textField_6.setColumns(10);
				textField_6.setBounds(113, 197, 138, 20);
				panel.add(textField_6);
			}
			{
				JLabel lblPosition = new JLabel("Position:");
				lblPosition.setFont(new Font("Arial", Font.PLAIN, 12));
				lblPosition.setBounds(10, 225, 74, 15);
				panel.add(lblPosition);
			}
			{
				JComboBox comboBox = new JComboBox();
				comboBox.setModel(new DefaultComboBoxModel(new String[] {"Manager", "Employee"}));
				comboBox.setBounds(113, 228, 138, 20);
				panel.add(comboBox);
			}
			{
				JLabel lblddmmyyy = new JLabel("*DD/MM/YYYY");
				lblddmmyyy.setFont(new Font("Tahoma", Font.PLAIN, 9));
				lblddmmyyy.setForeground(Color.RED);
				lblddmmyyy.setBounds(259, 200, 93, 14);
				panel.add(lblddmmyyy);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
