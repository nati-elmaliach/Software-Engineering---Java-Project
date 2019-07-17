package view.panels.AddPanels;

import view.forms.FormEvent;
import view.forms.FormListener;
import view.panels.FormPanel;
import view.panels.PrivateCarList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewEmployeePanel extends FormPanel {

    private JLabel firstNameLabel;
    private JTextField firstNameField;
    private JLabel lastNameLabel;
    private JTextField lastNameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel phoneNumberLabel;
    private JTextField phoneNumberField;
    private JLabel startdateLabel;
    private JTextField startdateField;
    private JLabel employeeCategoryLabel;
    private JList employeeCategoryField;
    private JButton submitForm;
    private FormListener listener;

    public AddNewEmployeePanel(){
        super();
        Border innerBorder = BorderFactory.createTitledBorder("Add New Employee");
        Border outterBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outterBorder,innerBorder));

        firstNameLabel = new JLabel("First Name");
        firstNameField = new JTextField(10);

        lastNameLabel = new JLabel("Last Name");
        lastNameField = new JTextField(10);

        emailLabel = new JLabel("Email Adress");
        emailField = new JTextField(10);

        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberField = new JTextField(10);

        startdateLabel = new JLabel("Starting Date");
        startdateField = new JTextField(10);

        //set List options
        employeeCategoryLabel = new JLabel("Employee Type");
        employeeCategoryField = new JList();
        employeeCategoryField.setPreferredSize(new Dimension(105, 50));
        employeeCategoryField.setBorder(BorderFactory.createEtchedBorder());
        employeeCategoryField.setSelectedIndex(0);

        DefaultListModel typeModel = new DefaultListModel();
        typeModel.addElement(new PrivateCarList(0, "Employee"));
        typeModel.addElement(new PrivateCarList(1, "Manager"));
        employeeCategoryField.setModel(typeModel);

        submitForm = new JButton("Submit");
        submitForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                String phoneNumber = phoneNumberField.getText();
                String employeeType = employeeCategoryField.getSelectedValue().toString();
                String startDate = startdateField.getText();

                FormEvent employeeEvent = new FormEvent(this,firstName,lastName,email,phoneNumber,startDate,employeeType);
                if(listener !=null)
                    listener.formEventOccurred(employeeEvent);
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.gridy = 0;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0, 0, 0, 5);
        add(firstNameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(firstNameField, gc);

        // //////////Second row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(10, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(lastNameLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(10, 0, 0, 0);
        add(lastNameField, gc);

        // //////////Next row ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(emailLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(emailField, gc);

        //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(phoneNumberLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(phoneNumberField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(startdateLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(startdateField, gc);

        // //////////Next row ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(employeeCategoryLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(employeeCategoryField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 2.0;

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(10, 0, 0, 0);
        add(submitForm, gc);
    }

    public void setFormListener(FormListener listener) {
        this.listener = listener;
    }
}
