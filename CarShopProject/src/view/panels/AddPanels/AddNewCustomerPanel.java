package view.panels.AddPanels;

import view.DialogListener;
import view.forms.FormEvent;
import view.forms.FormListener;
import view.panels.FormPanel;
import view.panels.PrivateCarList;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewCustomerPanel extends FormPanel {

    private JLabel firstNameLabel;
    private JTextField firstNameField;
    private JLabel lastNameLabel;
    private JTextField lastNameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel phoneNumberLabel;
    private JTextField phoneNumberField;
    private JLabel intrestedCategoryLabel;
    private JList intrestedCategoryField;
    private JLabel maxPriceLabel;
    private JTextField maxPriceField;
    private JButton submitForm;
    private FormListener listener;
    private DialogListener dialogListener;


    public AddNewCustomerPanel(){
        super();
        Border innerBorder = BorderFactory.createTitledBorder("Add New Customer");
        Border outterBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outterBorder,innerBorder));

        firstNameLabel = new JLabel("First Name");
        firstNameField = new JTextField();
        firstNameField.setMinimumSize(new Dimension(120,20));
        //firstNameField.setPreferredSize(new Dimension(10,10));

        lastNameLabel = new JLabel("Last Name");
        lastNameField = new JTextField(10);
        lastNameField.setMinimumSize(new Dimension(120,20));

        emailLabel = new JLabel("Email Adress");
        emailField = new JTextField(10);
        emailField.setMinimumSize(new Dimension(120,20));


        phoneNumberLabel = new JLabel("Phone Number");
        phoneNumberField = new JTextField(10);
        phoneNumberField.setMinimumSize(new Dimension(120,20));

        //set List options
        intrestedCategoryLabel = new JLabel("Intrested In");
        intrestedCategoryField = new JList();
        intrestedCategoryField.setPreferredSize(new Dimension(105, 100));
        intrestedCategoryField.setBorder(BorderFactory.createEtchedBorder());
        intrestedCategoryField.setSelectedIndex(0);

        DefaultListModel typeModel = new DefaultListModel();
        typeModel.addElement(new PrivateCarList(0, "Mini"));
        typeModel.addElement(new PrivateCarList(1, "SuperMini"));
        typeModel.addElement(new PrivateCarList(2, "Family"));
        typeModel.addElement(new PrivateCarList(3, "Managers"));
        typeModel.addElement(new PrivateCarList(4, "Sport"));
        typeModel.addElement(new PrivateCarList(5, "Jeep"));
        intrestedCategoryField.setModel(typeModel);


        maxPriceLabel = new JLabel("Maximum Price");
        maxPriceField = new JTextField(10);
        maxPriceField.setMinimumSize(new Dimension(120,20));
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
                int maxPrice = numiericFieldsValidation(maxPriceField.getText());
                String intrestCategory = intrestedCategoryField.getSelectedValue().toString();

                FormEvent CustomerEvent = new FormEvent(this,firstName,lastName,email,phoneNumber,intrestCategory,maxPrice);
                if(listener !=null)
                    listener.formEventOccurred(CustomerEvent);

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
        add(intrestedCategoryLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(intrestedCategoryField, gc);

        // //////////Next row ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(maxPriceLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(maxPriceField, gc);

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
        if(maxPriceField.getText().length() == 0 ||
           firstNameField.getText().length() == 0 ||
           lastNameField.getText().length() ==0 ||
           emailField.getText().length() ==0 ||
           phoneNumberField.getText().length() ==0 ||
           intrestedCategoryField.getSelectedValue() == null)
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
