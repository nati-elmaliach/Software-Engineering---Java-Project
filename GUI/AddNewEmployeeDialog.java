package GoodLuck;

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
	private JTextField txtfWorkerNum;
	private JTextField txtfAddress;
	private JTextField txtfEmail;
	private JTextField txtfPhoneNum;
	private JTextField txtfName;
	private JTextField txtfStartOnDate;
	private JLabel lblPhoneNum;
	private JLabel lblAddress;
	private JLabel lblStartOnDate;
	private JLabel lblPosition;

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
				txtfWorkerNum = new JTextField();
				txtfWorkerNum.setToolTipText("Worker number");
				txtfWorkerNum.setColumns(10);
				txtfWorkerNum.setBounds(113, 168, 138, 20);
				panel.add(txtfWorkerNum);
			}
			{
				JLabel lblWorkerNum = new JLabel("Worker number:");
				lblWorkerNum.setLabelFor(txtfWorkerNum);
				lblWorkerNum.setFont(new Font("Arial", Font.PLAIN, 12));
				lblWorkerNum.setBounds(10, 170, 93, 15);
				panel.add(lblWorkerNum);
			}
			{
				lblAddress = new JLabel("Address:");
				lblAddress.setFont(new Font("Arial", Font.PLAIN, 12));
				lblAddress.setBounds(10, 144, 74, 15);
				panel.add(lblAddress);
			}
			{
				txtfAddress = new JTextField();
				lblAddress.setLabelFor(txtfAddress);
				txtfAddress.setToolTipText("Address");
				txtfAddress.setColumns(10);
				txtfAddress.setBounds(113, 142, 138, 20);
				panel.add(txtfAddress);
			}
			{
				txtfEmail = new JTextField();
				txtfEmail.setToolTipText("Email: ***@***.com");
				txtfEmail.setColumns(10);
				txtfEmail.setBounds(113, 118, 138, 20);
				panel.add(txtfEmail);
			}
			{
				JLabel lblEmail = new JLabel("E-Mail:");
				lblEmail.setLabelFor(txtfEmail);
				lblEmail.setFont(new Font("Arial", Font.PLAIN, 12));
				lblEmail.setBounds(10, 118, 47, 15);
				panel.add(lblEmail);
			}
			{
				lblPhoneNum = new JLabel("Phone number:");
				lblPhoneNum.setFont(new Font("Arial", Font.PLAIN, 12));
				lblPhoneNum.setBounds(10, 90, 89, 15);
				panel.add(lblPhoneNum);
			}
			{
				txtfPhoneNum = new JTextField();
				lblPhoneNum.setLabelFor(txtfPhoneNum);
				txtfPhoneNum.setToolTipText("Phone number");
				txtfPhoneNum.setColumns(10);
				txtfPhoneNum.setBounds(113, 90, 138, 20);
				panel.add(txtfPhoneNum);
			}
			{
				txtfName = new JTextField();
				txtfName.setToolTipText("Name");
				txtfName.setColumns(10);
				txtfName.setBounds(113, 59, 138, 20);
				panel.add(txtfName);
			}
			{
				JLabel lblName = new JLabel("Name:");
				lblName.setLabelFor(txtfName);
				lblName.setFont(new Font("Arial", Font.PLAIN, 12));
				lblName.setBounds(10, 59, 74, 15);
				panel.add(lblName);
			}
			{
				JLabel lblAddingANew = new JLabel("Adding a new employee");
				lblAddingANew.setFont(new Font("Arial", Font.PLAIN, 14));
				lblAddingANew.setBounds(103, 11, 178, 35);
				panel.add(lblAddingANew);
			}
			{
				lblStartOnDate = new JLabel("Start on date:");
				lblStartOnDate.setFont(new Font("Arial", Font.PLAIN, 12));
				lblStartOnDate.setBounds(10, 199, 74, 15);
				panel.add(lblStartOnDate);
			}
			{
				txtfStartOnDate = new JTextField();
				lblStartOnDate.setLabelFor(txtfStartOnDate);
				txtfStartOnDate.setToolTipText("Start on date");
				txtfStartOnDate.setColumns(10);
				txtfStartOnDate.setBounds(113, 197, 138, 20);
				panel.add(txtfStartOnDate);
			}
			{
				lblPosition = new JLabel("Position:");
				lblPosition.setFont(new Font("Arial", Font.PLAIN, 12));
				lblPosition.setBounds(10, 225, 74, 15);
				panel.add(lblPosition);
			}
			{
				JComboBox cbPosition = new JComboBox();
				lblPosition.setLabelFor(cbPosition);
				cbPosition.setToolTipText("Position");
				cbPosition.setModel(new DefaultComboBoxModel(new String[] {"Manager", "Employee"}));
				cbPosition.setBounds(113, 223, 138, 20);
				panel.add(cbPosition);
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
				JButton okButton = new JButton("Save");
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
