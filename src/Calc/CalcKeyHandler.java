package Calc;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
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
        String buttonText;
        JButton jButton;
        jButton = (JButton) e.getSource();
        buttonText = jButton.getText();

        if (buttonText.equals("C")){
            textField.setText("");
            return;
        } else if (buttonText.equals("=")){
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");
            String script = textField.getText()+';';
            try {
                engine.eval(script);
                Object returnedValue = engine.eval(script);
                textField.setText(String.valueOf(returnedValue));
            } catch (ScriptException se){
                System.err.println(se.getMessage());
            }

        } else {
            textField.setText(textField.getText() + buttonText);
        }







    }
}
