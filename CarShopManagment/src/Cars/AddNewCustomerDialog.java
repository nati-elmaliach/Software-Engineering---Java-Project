package Cars;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class AddNewCustomerDialog extends JDialog {

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
			AddNewCustomerDialog dialog = new AddNewCustomerDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddNewCustomerDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 434, 228);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JLabel lblName = new JLabel("Name:");
			lblName.setFont(new Font("Arial", Font.PLAIN, 12));
			lblName.setBounds(10, 59, 74, 15);
			panel.add(lblName);
			
			textField = new JTextField();
			textField.setToolTipText("Horse power");
			textField.setColumns(10);
			textField.setBounds(113, 59, 138, 20);
			panel.add(textField);
			
			JLabel lblPhoneNumber = new JLabel("Phone number:");
			lblPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 12));
			lblPhoneNumber.setBounds(10, 90, 89, 15);
			panel.add(lblPhoneNumber);
			
			textField_1 = new JTextField();
			textField_1.setToolTipText("Engine capacity");
			textField_1.setColumns(10);
			textField_1.setBounds(113, 90, 38, 20);
			panel.add(textField_1);
			
			JLabel lblEmail = new JLabel("E-Mail:");
			lblEmail.setFont(new Font("Arial", Font.PLAIN, 12));
			lblEmail.setBounds(10, 118, 47, 15);
			panel.add(lblEmail);
			
			textField_2 = new JTextField();
			textField_2.setToolTipText("Horse power");
			textField_2.setColumns(10);
			textField_2.setBounds(113, 118, 138, 20);
			panel.add(textField_2);
			
			JLabel lblAddingANew = new JLabel("Adding a new costumer");
			lblAddingANew.setFont(new Font("Arial", Font.PLAIN, 14));
			lblAddingANew.setBounds(103, 11, 178, 35);
			panel.add(lblAddingANew);
			
			textField_3 = new JTextField();
			textField_3.setToolTipText("Horse power");
			textField_3.setColumns(10);
			textField_3.setBounds(165, 90, 86, 20);
			panel.add(textField_3);
			
			JLabel lblAddress = new JLabel("Address:");
			lblAddress.setFont(new Font("Arial", Font.PLAIN, 12));
			lblAddress.setBounds(10, 144, 74, 15);
			panel.add(lblAddress);
			
			JLabel lblIdNumber = new JLabel("ID number:");
			lblIdNumber.setFont(new Font("Arial", Font.PLAIN, 12));
			lblIdNumber.setBounds(10, 170, 74, 15);
			panel.add(lblIdNumber);
			
			JLabel lblLicenceNumber = new JLabel("Licence number:");
			lblLicenceNumber.setFont(new Font("Arial", Font.PLAIN, 12));
			lblLicenceNumber.setBounds(10, 196, 93, 15);
			panel.add(lblLicenceNumber);
			
			textField_4 = new JTextField();
			textField_4.setToolTipText("Horse power");
			textField_4.setColumns(10);
			textField_4.setBounds(113, 142, 138, 20);
			panel.add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setToolTipText("Horse power");
			textField_5.setColumns(10);
			textField_5.setBounds(113, 168, 138, 20);
			panel.add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setToolTipText("Horse power");
			textField_6.setColumns(10);
			textField_6.setBounds(113, 194, 138, 20);
			panel.add(textField_6);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.setActionCommand("Save");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//System.exit(0);
						//cancelButton.addActionListener(new addActionListner());
						//AddNewCustomerDialog.DISPOSE_ON_CLOSE(0);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
