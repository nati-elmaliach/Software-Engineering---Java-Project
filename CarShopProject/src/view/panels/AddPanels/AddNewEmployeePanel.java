package view.panels.AddPanels;

import view.DialogListener;
import view.forms.FormEvent;
import view.forms.FormListener;
import view.panels.FormPanel;

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
    private JComboBox employeeCategoryField;
    private JButton submitForm;
    private FormListener listener;
    private DialogListener dialogListener;


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
        employeeCategoryField = new JComboBox();

        DefaultComboBoxModel employeeType = new DefaultComboBoxModel();
        employeeType.addElement("Employee");
        employeeType.addElement("Manager");
        employeeCategoryField.setModel(employeeType);
        employeeCategoryField.setSelectedIndex(0);
        employeeCategoryField.setEditable(true);
        employeeCategoryField.setPreferredSize(new Dimension(105, 20));

        firstNameField.setMinimumSize(new Dimension(120,20));
        lastNameField.setMinimumSize(new Dimension(120,20));
        emailField.setMinimumSize(new Dimension(120,20));
        phoneNumberField.setMinimumSize(new Dimension(120,20));
        startdateField.setMinimumSize(new Dimension(120,20));
        employeeCategoryField.setMinimumSize(new Dimension(120,20));


        submitForm = new JButton("Submit");
        submitForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(formValidation() == false){
                    dialogListener.errorOccuerd();
                    return;
                }

                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                String phoneNumber = phoneNumberField.getText();
                String employeeType = employeeCategoryField.getSelectedItem().toString();
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

    @Override
    public boolean formValidation() {

        if( firstNameField.getText().length() == 0 ||
                lastNameField.getText().length() ==0 ||
                emailField.getText().length() ==0 ||
                phoneNumberField.getText().length() ==0 ||
                startdateField.getText().length() ==0 ||
                employeeCategoryField.getSelectedItem() == null)
            return false;
        else
            return true;
    }

    public void setFormListener(FormListener listener) {
        this.listener = listener;
    }

    public void setDialogListener(DialogListener dialogListener){
        this.dialogListener = dialogListener;
    }
}
