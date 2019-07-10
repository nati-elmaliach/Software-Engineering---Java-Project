package GoodLuck;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.DropMode;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField pwdLoginPass;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
					int screenWidth= screenSize.width;
					int screenHeight= screenSize.height;
					LoginPage frame = new LoginPage();
					frame.setLocation(screenWidth/3,screenHeight/3);
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUserName = new JTextField();
		txtUserName.setFont(new Font("Arial", Font.PLAIN, 11));
		txtUserName.setToolTipText("Please enter user name");
		txtUserName.setHorizontalAlignment(SwingConstants.LEFT);
		txtUserName.setDropMode(DropMode.INSERT);
		txtUserName.setForeground(new Color(0, 0, 0));
		txtUserName.setBounds(125, 67, 185, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(152, 11, 85, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(35, 70, 80, 14);
		contentPane.add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(35, 98, 80, 14);
		contentPane.add(lblPassword);
		
		pwdLoginPass = new JPasswordField();
		pwdLoginPass.setFont(new Font("Arial", Font.PLAIN, 11));
		pwdLoginPass.setHorizontalAlignment(SwingConstants.LEFT);
		pwdLoginPass.setEchoChar('@');
		pwdLoginPass.setToolTipText("Please enter password");
		pwdLoginPass.setBounds(125, 98, 185, 20);
		contentPane.add(pwdLoginPass);
		
		JButton btnSend = new JButton("SEND");
		btnSend.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				//if(wrong user name not found on DB or pass not match with to this user name)
				//{
				JLabel lblWrongUser = new JLabel("* Wrong user name or password, please try again.");
				lblWrongUser.setHorizontalAlignment(SwingConstants.LEFT);
				lblWrongUser.setForeground(new Color(255, 0, 0));
				lblWrongUser.setFont(new Font("Arial", Font.PLAIN, 11));
				lblWrongUser.setBounds(45, 123, 254, 14);
				contentPane.add(lblWrongUser);
				JOptionPane.showMessageDialog(null, "* Wrong user name or password, please try again");
				//}
				/*
				 * else
				 * {
				 * 		if(user name belongs to manager)
				 * 				directing to manager page
				 * 		else
				 * 				directing to employee page
				 * }
				*/
			}
		});
		btnSend.setBounds(266, 145, 89, 23);
		contentPane.add(btnSend);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btnExit.setBounds(266, 180, 89, 23);
		contentPane.add(btnExit);
		

	}
}
