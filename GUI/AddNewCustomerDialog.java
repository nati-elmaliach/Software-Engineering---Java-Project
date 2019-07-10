package GoodLuck;

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
	private JTextField txtfName;
	private JTextField txtfEmail;
	private JTextField txtfPhoneNum;
	private JTextField txtfAddress;
	private JTextField txtfIDnum;
	private JTextField txtfLicenceNum;

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
			
			txtfName = new JTextField();
			lblName.setLabelFor(txtfName);
			txtfName.setToolTipText("Name");
			txtfName.setColumns(10);
			txtfName.setBounds(113, 59, 138, 20);
			panel.add(txtfName);
			
			JLabel lblPhoneNumber = new JLabel("Phone number:");
			lblPhoneNumber.setFont(new Font("Arial", Font.PLAIN, 12));
			lblPhoneNumber.setBounds(10, 90, 89, 15);
			panel.add(lblPhoneNumber);
			
			JLabel lblEmail = new JLabel("E-Mail:");
			lblEmail.setFont(new Font("Arial", Font.PLAIN, 12));
			lblEmail.setBounds(10, 118, 47, 15);
			panel.add(lblEmail);
			
			txtfEmail = new JTextField();
			lblEmail.setLabelFor(txtfEmail);
			txtfEmail.setToolTipText("Email: ***@***.com");
			txtfEmail.setColumns(10);
			txtfEmail.setBounds(113, 118, 138, 20);
			panel.add(txtfEmail);
			
			JLabel lblTitle = new JLabel("Adding a new costumer");
			lblTitle.setFont(new Font("Arial", Font.PLAIN, 14));
			lblTitle.setBounds(103, 11, 178, 35);
			panel.add(lblTitle);
			
			txtfPhoneNum = new JTextField();
			lblPhoneNumber.setLabelFor(txtfPhoneNum);
			txtfPhoneNum.setToolTipText("Phone number");
			txtfPhoneNum.setColumns(10);
			txtfPhoneNum.setBounds(113, 90, 138, 20);
			panel.add(txtfPhoneNum);
			
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
			
			txtfAddress = new JTextField();
			lblAddress.setLabelFor(txtfAddress);
			txtfAddress.setToolTipText("Address");
			txtfAddress.setColumns(10);
			txtfAddress.setBounds(113, 142, 138, 20);
			panel.add(txtfAddress);
			
			txtfIDnum = new JTextField();
			lblIdNumber.setLabelFor(txtfIDnum);
			txtfIDnum.setToolTipText("ID number");
			txtfIDnum.setColumns(10);
			txtfIDnum.setBounds(113, 168, 138, 20);
			panel.add(txtfIDnum);
			
			txtfLicenceNum = new JTextField();
			lblLicenceNumber.setLabelFor(txtfLicenceNum);
			txtfLicenceNum.setToolTipText("Licence number");
			txtfLicenceNum.setColumns(10);
			txtfLicenceNum.setBounds(113, 194, 138, 20);
			panel.add(txtfLicenceNum);
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
