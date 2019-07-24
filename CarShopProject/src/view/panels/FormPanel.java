package view.panels;

import javax.swing.*;
import java.awt.*;

public abstract class FormPanel extends JPanel {


    public FormPanel(){

        Dimension dim = getPreferredSize();
        dim.width = 250;
        setPreferredSize(dim);

    }

    public int numiericFieldsValidation(String field) {
        int result;
        try {
            result = Integer.parseInt(field);

        } catch (NumberFormatException e) {
            result = -1;
        }
        return result;
    }

    public abstract boolean formValidation();

}
