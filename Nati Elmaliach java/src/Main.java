import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    final static String DB_URI = "jdbc:sqlite" + ":data.db";

    public static void main(String[] args) {

        DB dataBase = new DB();
        if(!dataBase.open()){
            System.out.println("Could not open DB");
            return;
        }
        // initialize the dataBase + create tables
        dataBase.initialize();
        // this is how we can query tables
        //dataBase.query_table();
        // close data base connection
        //dataBase.close();

       JFrame frame = new JFrame();

       JLabel userLabel = new JLabel();
       userLabel.setBounds(250,50,250,20);
       userLabel.setText("User name");
       userLabel.setFont(userLabel.getFont().deriveFont(Font.BOLD,20));
       JTextField UserTextField = new JTextField();
       UserTextField.setBounds(175,100,250,30);

       JLabel passwordLabel = new JLabel();
       passwordLabel.setBounds(250,150,250,20);
       passwordLabel.setText("PASSWORD");
       passwordLabel.setFont(passwordLabel.getFont().deriveFont(Font.BOLD,20));

       JTextField passwordTextField = new JTextField();
       passwordTextField.setBounds(175,200,250,30);

       JLabel AuthenticationStatus = new JLabel();
       AuthenticationStatus.setBounds(175,300,250,20);
       AuthenticationStatus.setFont(AuthenticationStatus.getFont().deriveFont(Font.BOLD,15));



       JButton button = new JButton();
       button.setBounds(175,400,250,50);
       button.setText("click here");





       button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                   String USER = UserTextField.getText();
                   String PASSWORD = passwordTextField.getText();
                   boolean Auto = dataBase.Authentication(USER,PASSWORD);
                   if(!Auto){
                       AuthenticationStatus.setForeground(Color.red);
                       AuthenticationStatus.setText("WRONG USERNAME OR PASSWORD");
                   } // the Authentication has failed
                    else{
                       AuthenticationStatus.setForeground(Color.green);
                       AuthenticationStatus.setText("WELCOME BACK");
                       AuthenticationStatus.setAlignmentX(Component.CENTER_ALIGNMENT);
                   }
//                   String host = UserTextField.getText();
//                   String ip = java.net.InetAddress.getByName(host).getHostAddress();
//                   userLabel.setText("ip is" + host + "is" + ip);
           }
       });

       frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       frame.add(button);
       frame.add(UserTextField);
       frame.add(userLabel);
       frame.add(passwordLabel);
       frame.add(passwordTextField);
       frame.add(AuthenticationStatus);
       frame.setLayout(null);
       frame.setBounds(400,300,600,500);
       frame.setVisible(true);
    }

}
