package view;

import controller.Controller;
import view.components.TextPanel;
import view.components.ToolBar;
import view.forms.FormEvent;
import view.forms.FormListener;
import view.panels.*;
import view.panels.AddPanels.AddNewCarPanel;
import view.panels.AddPanels.AddNewCustomerPanel;
import view.panels.AddPanels.AddNewDealPanel;
import view.panels.AddPanels.AddNewEmployeePanel;
import view.panels.searchPanels.SearchCarPanel;
import view.panels.searchPanels.SearchCustomerPanel;
import view.panels.searchPanels.SearchDealPanel;
import view.panels.searchPanels.SerachEmployeePanel;
import view.tabels.TablePanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

   // private JTextArea textArea;
    private TextPanel textPanel;
    private ToolBar toolBar;
    private JPanel cards;
    private AddNewCarPanel addNewCarPanel;
    private AddNewCustomerPanel addNewCustomerPanel;
    private AddNewEmployeePanel addNewEmployeePanel;
    private AddNewDealPanel addNewDealPanel;
    private SearchCarPanel searchCarPanel;
    private SearchCustomerPanel searchCustomerPanel;
    private SerachEmployeePanel serachEmployeePanel;
    private SearchDealPanel searchDealPanel;
    private TablePanel tablePanel;
    private JDialog dialogBox;
    private JFrame mainFrame;

    private Controller controller;

    public MainFrame(){
        super("CarShop");
        setLayout(new BorderLayout());

        mainFrame = this;
        //textArea = new JTextArea();
        toolBar = new ToolBar();
        textPanel = new TextPanel();
        tablePanel = new TablePanel();
        addNewCarPanel = new AddNewCarPanel();
        addNewCustomerPanel = new AddNewCustomerPanel();
        addNewEmployeePanel = new AddNewEmployeePanel();
        addNewDealPanel = new AddNewDealPanel();

        searchCarPanel = new SearchCarPanel();
        searchCustomerPanel = new SearchCustomerPanel();
        serachEmployeePanel = new SerachEmployeePanel();
        searchDealPanel = new SearchDealPanel();

        cards = new JPanel(new CardLayout());
        cards.add(addNewCarPanel,"addNewCar");
        cards.add(addNewCustomerPanel,"addNewCustomer");
        cards.add(addNewEmployeePanel,"addNewEmployee");
        cards.add(addNewDealPanel,"addNewDeal");

        cards.add(searchCarPanel,"searchCar");
        cards.add(searchCustomerPanel,"searchClient");
        cards.add(serachEmployeePanel,"searchEmployee");
        cards.add(searchDealPanel,"searchDeal");


        controller = new Controller();
        tablePanel.setTables(controller.getPrivateCars(),controller.getIndustrialCars(),controller.getCustomers(),controller.getEmployees(),controller.getDeals());

        //tablePanel.setPrivateCarsData(controller.getPrivateCars());

        //Change panels form by user click
        toolBar.setPanelListener(new PanelListeners(){

            @Override
            public void PanelChange(String text) {
               //textPanel.appendText(text);
                CardLayout cl =  (CardLayout) (cards.getLayout());
                cl.show(cards,text);
                tablePanel.showPanelTable(text);
            }
        });

        addNewCarPanel.setFormListener(new FormListener(){
            public void formEventOccurred(FormEvent e){
                    int vehicleType = e.getTypeCategoty();
                    controller.addNewCar(e);

                    if(vehicleType == 0)
                        tablePanel.setPrivateCarsData(controller.getPrivateCars());
                    else if(vehicleType == 1)
                        tablePanel.setIndustrialCarsData(controller.getIndustrialCars());

                    tablePanel.refresh();
            }
        });

        searchCarPanel.setFormListener(new FormListener(){
            public void formEventOccurred(FormEvent e){
                int vehicleType = e.getTypeCategoty();
                //controller.addNewCar(e);

                if(vehicleType == 0)
                    tablePanel.setPrivateCarsQueryData(controller.getPrivateCarsQuery(e));
                else if(vehicleType == 1)
                    tablePanel.setIndustrialCarsData(controller.getIndustrialCarsQuery(e));

                tablePanel.refresh();
            }
        });

        addNewCustomerPanel.setFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                controller.addNewCustomer(e);
                tablePanel.setCustomersData(controller.getCustomers());
                tablePanel.refresh();
            }
        });

        searchCustomerPanel.setFormListener(new FormListener(){
            public void formEventOccurred(FormEvent e){
                tablePanel.setCustomersQueryData(controller.getCustomersQuery(e));

                    tablePanel.refresh();
            }
        });

        addNewEmployeePanel.setFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                controller.addNewEmployee(e);
                tablePanel.setEmployeeData(controller.getEmployees());
                tablePanel.refresh();
            }
        });

        serachEmployeePanel.setFormListener(new FormListener(){
            public void formEventOccurred(FormEvent e){
                tablePanel.setEmployeeQueryData(controller.getEmployeesQuery(e));

                tablePanel.refresh();
            }
        });

        addNewDealPanel.setFormListener(new FormListener() {
            @Override
            public void formEventOccurred(FormEvent e) {
                controller.addDealsHistory(e);
                tablePanel.setDealData(controller.getDeals());
                tablePanel.refresh();
            }
        });

        addNewDealPanel.setDialogListener(new DialogListener() {
            @Override
            public void errorOccuerd() {
                dialogBox= new JDialog(mainFrame,"Error");

                // create a label
                JLabel l = new JLabel("All fields are Required for adding new object");

                dialogBox.add(l);

                // setsize of dialog
                dialogBox.setSize(300, 80);

                dialogBox.setLocationRelativeTo(null);
                // set visibility of dialog
                dialogBox.setVisible(true);
            }
        });

        searchDealPanel.setFormListener(new FormListener(){
            public void formEventOccurred(FormEvent e){
                tablePanel.setDealQueryData(controller.getDealsQuery(e));

                tablePanel.refresh();
            }
        });

        addNewCarPanel.setDialogListener(new DialogListener() {
            @Override
            public void errorOccuerd() {
                dialogBox= new JDialog(mainFrame,"Error");

                // create a label
                JLabel l = new JLabel("All fields are Required for adding new object");

                dialogBox.add(l);

                // setsize of dialog
                dialogBox.setSize(300, 80);

                dialogBox.setLocationRelativeTo(null);
                // set visibility of dialog
                dialogBox.setVisible(true);
            }
        });

        addNewCustomerPanel.setDialogListener(new DialogListener() {
            @Override
            public void errorOccuerd() {
                dialogBox= new JDialog(mainFrame,"Error");

                // create a label
                JLabel l = new JLabel("All fields are Required for adding new object");

                dialogBox.add(l);

                // setsize of dialog
                dialogBox.setSize(300, 80);

                dialogBox.setLocationRelativeTo(null);
                // set visibility of dialog
                dialogBox.setVisible(true);
            }
        });

        addNewEmployeePanel.setDialogListener(new DialogListener() {
            @Override
            public void errorOccuerd() {
                dialogBox= new JDialog(mainFrame,"Error");

                // create a label
                JLabel l = new JLabel("All fields are Required for adding new object");

                dialogBox.add(l);

                // setsize of dialog
                dialogBox.setSize(300, 80);

                dialogBox.setLocationRelativeTo(null);
                // set visibility of dialog
                dialogBox.setVisible(true);
            }
        });

        add(cards,BorderLayout.WEST);
        add(tablePanel,BorderLayout.CENTER);
        add(toolBar,BorderLayout.NORTH);
        setMinimumSize( new Dimension(500,400));

        this.setSize(1000,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //pack();
        setVisible(true);
    }
}
