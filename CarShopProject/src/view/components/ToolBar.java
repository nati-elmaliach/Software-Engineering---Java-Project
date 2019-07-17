package view.components;

import view.panels.PanelListeners;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {

    private JButton addNewCar;
    private JButton searchCar;

    private JButton addNewClient;
    private JButton searchClient;

    private JButton addNewEmployee;
    private JButton searchEmployee;

    private JButton addNewDeal;
    private JButton searchDeal;


    private PanelListeners panelListener;


    public ToolBar(){

            addNewCar = new JButton("Add new car");
            addNewCar.setPreferredSize(new Dimension(10,20));
            searchCar = new JButton("Search Car");
            addNewClient = new JButton("Add new customer");
            searchClient = new JButton("Search Customer");

            addNewEmployee = new JButton("Add new employee");
            searchEmployee = new JButton("Search employee");

            addNewDeal = new JButton("Submit deal");
            searchDeal = new JButton("Search Deal");

            //setLayout(new FlowLayout(FlowLayout.LEFT));


            add(addNewCar);
            add(addNewClient);
            add(addNewDeal);
            add(addNewEmployee);
            add(searchCar);
            add(searchClient);
            add(searchDeal);
            add(searchEmployee);

            searchDeal.addActionListener(this);
            searchEmployee.addActionListener(this);
            searchClient.addActionListener(this);
            searchCar.addActionListener(this);


            addNewCar.addActionListener(this);
            addNewClient.addActionListener(this);
            addNewEmployee.addActionListener(this);
            addNewDeal.addActionListener(this);
            setLayout(new GridLayout(2,4,50,10));
            setBorder(new EmptyBorder(10,10,10,10));
            //setPreferredSize(new Dimension(20,20));
    }

    public void setPanelListener(PanelListeners panelListener){
        this.panelListener = panelListener;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        if(clicked == addNewCar){
            panelListener.PanelChange("addNewCar");
            //textPanel.appendText("any othe button");
        }
        else if(clicked == addNewClient ){
            panelListener.PanelChange("addNewCustomer");
        }
        else if(clicked == addNewEmployee){
            panelListener.PanelChange("addNewEmployee");
        }
        else if(clicked == addNewDeal){
            panelListener.PanelChange("addNewDeal");
        }
        else if(clicked == searchDeal){
            panelListener.PanelChange("searchDeal");
        }
        else if(clicked == searchEmployee){
            panelListener.PanelChange("searchEmployee");
        }
        else if(clicked == searchClient){
            panelListener.PanelChange("searchClient");
        }
        else if(clicked == searchCar){
            panelListener.PanelChange("searchCar");
        }

    }
}
