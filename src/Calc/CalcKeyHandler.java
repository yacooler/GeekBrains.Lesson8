package Calc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcKeyHandler implements ActionListener {
    private final JTextField textField;

    public CalcKeyHandler(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source;
        if (e.getClass().getName() != "JButton") return;
        source = (JButton) (e.getSource());


    }
}
