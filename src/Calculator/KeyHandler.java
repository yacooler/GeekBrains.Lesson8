package Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyHandler implements ActionListener {
    private final JTextField textField;
    private final Calculate calculate;

    public KeyHandler(JTextField textField, Calculate calculate) {
        this.textField = textField;
        this.calculate = calculate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (!(e.getSource() instanceof JButton)) { return; }

        char sourceChar = ((JButton) (e.getSource())).getText().charAt(0);

        switch (sourceChar){
            case Constants.CALCKEY_CLEAR:{
                textField.setText("0");
                break;
            }

            case Constants.CALCKEY_EVALUATE:{
                textField.setText(calculate.evaluate(textField.getText()));
                break;
            }

            case Constants.CALCKEY_FUNC_DIV,
                 Constants.CALCKEY_FUNC_MULT,
                 Constants.CALCKEY_FUNC_PLUS,
                 Constants.CALCKEY_FUNC_MINUS:{

                textField.setText(textField.getText() + " " + sourceChar + " ");

                break;
            }

            default:{ //Digits
                if (textField.getText().equals("0")){
                    textField.setText(String.valueOf(sourceChar));
                } else {
                    textField.setText(textField.getText() + sourceChar);
                }
            }
        }


    }
}
