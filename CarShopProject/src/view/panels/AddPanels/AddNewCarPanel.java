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

public class AddNewCarPanel extends FormPanel {


    private JLabel plateNumberLabel;
    private JLabel colorLabel;
    private JTextField plateNumberField;
    private JTextField colorField;
    private JButton submitForm;
    private FormListener listener;
    private JList categoryList;
    private JLabel handLabel;
    private JTextField handField;
    private JLabel kmLabel;
    private JTextField kmField;
    private JLabel yearOfProductionLabel;
    private JTextField yearOfProductionField;
    private JLabel priceLabel;
    private JTextField priceField;
    private JLabel manufacturerLabel;
    private JTextField manufacturerField;
    private JLabel carTypeLabel;
    private JComboBox carTypeField;
    private JLabel loadweightLabel;
    private JTextField loadweightField;
    private JLabel heightLabel;
    private JTextField heightField;
    private JLabel numOfSeatsLabel;
    private JTextField numOfSeatsField;
    private DialogListener dialogListener;


    public AddNewCarPanel() {
        super();
        Border innerBorder = BorderFactory.createTitledBorder("Add New Car");
        Border outterBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outterBorder, innerBorder));

        plateNumberLabel = new JLabel("Plate number");
        colorLabel = new JLabel("Color");

        plateNumberField = new JTextField(10);
        colorField = new JTextField(10);

        handLabel = new JLabel("Hand");
        handField = new JTextField(10);

        kmLabel = new JLabel("KM");
        kmField = new JTextField(10);

        yearOfProductionLabel = new JLabel("Year");
        yearOfProductionField = new JTextField(10);

        priceLabel = new JLabel("Price");
        priceField = new JTextField(10);

        manufacturerLabel = new JLabel("Manufacturer");
        manufacturerField = new JTextField(10);

        loadweightLabel = new JLabel("Load Weight");
        loadweightField = new JTextField(10);

        heightLabel = new JLabel("Height");
        heightField = new JTextField(10);

        numOfSeatsLabel = new JLabel("Seats Number");
        numOfSeatsField = new JTextField(10);


        categoryList = new JList();
        categoryList.setPreferredSize(new Dimension(105, 100));
        categoryList.setBorder(BorderFactory.createEtchedBorder());
        categoryList.setSelectedIndex(0);

        carTypeLabel = new JLabel("Car Type");
        carTypeField = new JComboBox();

        //set ComboBox
        DefaultComboBoxModel carTypeModel = new DefaultComboBoxModel();
        carTypeModel.addElement("Private Car");
        carTypeModel.addElement("Industrial Car");
        carTypeField.setModel(carTypeModel);
        carTypeField.setSelectedIndex(0);
        carTypeField.setEditable(true);
        carTypeField.setPreferredSize(new Dimension(105, 20));


        //set JList
        DefaultListModel typeModel = new DefaultListModel();
        typeModel.addElement(new PrivateCarList(0, "Mini"));
        typeModel.addElement(new PrivateCarList(1, "SuperMini"));
        typeModel.addElement(new PrivateCarList(2, "Family"));
        typeModel.addElement(new PrivateCarList(3, "Managers"));
        typeModel.addElement(new PrivateCarList(4, "Sport"));
        typeModel.addElement(new PrivateCarList(5, "Jeep"));

        //enable disable by car type
        loadweightLabel.setEnabled(false);
        loadweightField.setEnabled(false);
        heightLabel.setEnabled(false);
        heightField.setEnabled(false);

        carTypeField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                int vehiclieType = carTypeField.getSelectedIndex();
                //private car
                if (vehiclieType == 0) {
                    loadweightLabel.setEnabled(false);
                    loadweightField.setEnabled(false);
                    heightLabel.setEnabled(false);
                    heightField.setEnabled(false);
                    categoryList.setEnabled(true);
                    numOfSeatsLabel.setEnabled(true);
                    numOfSeatsField.setEnabled(true);

                }
                //industrial car
                else {
                    loadweightLabel.setEnabled(true);
                    loadweightField.setEnabled(true);
                    heightLabel.setEnabled(true);
                    heightField.setEnabled(true);
                    categoryList.setEnabled(false);
                    numOfSeatsLabel.setEnabled(false);
                    numOfSeatsField.setEnabled(false);
                }
            }
        });


        categoryList.setModel(typeModel);
        submitForm = new JButton("Add Car");

        submitForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(formValidation() == false){
                    dialogListener.errorOccuerd();
                    return;
                }

                //All Vehicles shared fields
                int vehicleType = carTypeField.getSelectedIndex();
                String plate = plateNumberField.getText();
                int hand = numiericFieldsValidation(handField.getText());
                int km = numiericFieldsValidation(kmField.getText());
                String yearOfPrudoction = yearOfProductionField.getText();
                int price = numiericFieldsValidation(priceField.getText());
                String color = colorField.getText();
                String manufacturer = manufacturerField.getText();

                //private car submitted
                if (vehicleType == 0) {
                    //private cars fields

                    String privateCarCategory = categoryList.getSelectedValue().toString();
                    int numberOfSeats = numiericFieldsValidation(numOfSeatsField.getText());

                    FormEvent privateCarEvent = new FormEvent(this, vehicleType, plate, hand, km, yearOfPrudoction, price, color, manufacturer, privateCarCategory, numberOfSeats);

                    if (listener != null)
                        listener.formEventOccurred(privateCarEvent);
                }
                //Industrial car submitted
                else if (vehicleType == 1) {
                    int loadWeight = numiericFieldsValidation(loadweightField.getText());
                    int height = numiericFieldsValidation(heightField.getText());
                    FormEvent IndustrialCarEvent = new FormEvent(this, plate, vehicleType, hand, km, yearOfPrudoction, price, color, manufacturer, loadWeight, height);

                    if (listener != null)
                        listener.formEventOccurred(IndustrialCarEvent);
                }
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
        add(plateNumberLabel, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(plateNumberField, gc);

        // //////////Second row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(10, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(carTypeLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(10, 0, 0, 0);
        add(carTypeField, gc);

        // //////////Next row ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Category: "), gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(categoryList, gc);

        //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(handLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(handField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(kmLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(kmField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(yearOfProductionLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(yearOfProductionField, gc);

        // //////////Next row ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(numOfSeatsLabel, gc);

        gc.gridx = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(numOfSeatsField, gc);

        // //////////Next row ///////////////////////////////////


        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(colorLabel, gc);

        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(colorField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(priceLabel, gc);

        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(priceField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(manufacturerLabel, gc);

        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(manufacturerField, gc);

        // //////////Next row ///////////////////////////////////

        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(loadweightLabel, gc);

        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(loadweightField, gc);

        // //////////Next row ///////////////////////////////////
        gc.gridy++;

        gc.weightx = 1;
        gc.weighty = 0.2;

        gc.gridx = 0;
        gc.insets = new Insets(0, 0, 0, 5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(heightLabel, gc);

        gc.gridx = 1;
        gc.insets = new Insets(0, 0, 0, 0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(heightField, gc);

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
        if(plateNumberField.getText().length() == 0 ||
                categoryList.getSelectedValue() == null||
                handField.getText().length() == 0 ||
                kmField.getText().length() == 0 ||
                yearOfProductionField.getText().length() == 0 ||
                numiericFieldsValidation(priceField.getText()) == -1 ||
                manufacturerField.getText().length() ==0 ||
                carTypeField.getSelectedItem() == null)
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
