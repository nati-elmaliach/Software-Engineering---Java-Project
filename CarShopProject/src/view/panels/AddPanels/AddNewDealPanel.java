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

public class AddNewDealPanel extends FormPanel {

    private JLabel employeeIDLabel;
    private JTextField employeeIDField;
    private JLabel clientIDLabel;
    private JTextField clientIDField;
    private JLabel CarplateNumberLabel;
    private JTextField CarplateNumberField;
    private JLabel closingPriceLabel;
    private JTextField closingPriceField;
    private JLabel dateLabel;
    private JTextField dateField;
    private JButton submitForm;
    private FormListener listener;
    private DialogListener dialogListener;

    //private JFrame mainFrame= (JFrame) SwingUtilities.getRoot(();



    public AddNewDealPanel(){
        super();
        Border innerBorder = BorderFactory.createTitledBorder("Submit Deal");
        Border outterBorder = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(outterBorder,innerBorder));

        employeeIDLabel = new JLabel("Employee ID");
        employeeIDField = new JTextField(10);

        clientIDLabel = new JLabel("Customer ID");
        clientIDField = new JTextField(10);

        CarplateNumberLabel = new JLabel("Plate Number");
        CarplateNumberField = new JTextField(10);

        closingPriceLabel = new JLabel("Closing Price");
        closingPriceField = new JTextField(10);

        dateLabel = new JLabel("Date");
        dateField = new JTextField(10);

        submitForm = new JButton("Submit");
        submitForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(formValidation() == false){
                    dialogListener.errorOccuerd();
                    return;
                }

                int employeeID = numiericFieldsValidation(employeeIDField.getText());
                int customerID = numiericFieldsValidation(clientIDField.getText());
                String plateNumber = CarplateNumberField.getText();
                int dealPrice = numiericFieldsValidation(closingPriceField.getText());
                String dealDate = dateField.getText();

                FormEvent dealEvent = new FormEvent(this,employeeID,customerID,plateNumber,dealPrice,dealDate);
                if(listener !=null)
                    listener.formEventOccurred(dealEvent);
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
        add(employeeIDLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(employeeIDField, gc);

        // //////////Second row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(10, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(clientIDLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(10, 0, 0, 0);
        add(clientIDField, gc);

        // //////////Next row ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(CarplateNumberLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(CarplateNumberField, gc);

        //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(closingPriceLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(closingPriceField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(dateLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(dateField, gc);

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
        if(numiericFieldsValidation(employeeIDField.getText()) == -1 ||
                numiericFieldsValidation(clientIDField.getText()) == -1 ||
                CarplateNumberField.getText().length() ==0 ||
                numiericFieldsValidation(closingPriceField.getText()) == -1 ||
                dateField.getText().length() == 0
        )
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
