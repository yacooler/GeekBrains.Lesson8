package Calc;


import javax.swing.*;
import java.awt.*;


public class CalcFrame extends JFrame {

    protected static final char[] CALC_KEYS = {
            '7','8','9','+',
            '4','5','6','-',
            '1','2','3','*',
            'C','0','=','/'};


    public CalcFrame() {

        setBounds(300,300,300,300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calc");

        init();

        setVisible(true);
    }

    private void init(){

        JPanel borderPanel = new JPanel(new BorderLayout() );

        JPanel textPanel = new JPanel(new GridLayout (2,1));
        textPanel.add(new JLabel());
        JTextField resultField = new JTextField("");
        resultField.setHorizontalAlignment(SwingConstants.RIGHT);
        CalcKeyHandler calcKeyHandler = new CalcKeyHandler(resultField);


        JPanel gridPanel = new JPanel(new GridLayout(4,5));
        for (int i = 0; i < CALC_KEYS.length; i++) {
            JButton button = new JButton(String.valueOf(CALC_KEYS[i]));
            button.addActionListener(calcKeyHandler);
            gridPanel.add(button);
        }

        textPanel.add(resultField);
        borderPanel.add(textPanel, BorderLayout.NORTH);
        borderPanel.add(gridPanel, BorderLayout.CENTER);

        getContentPane().add(borderPanel);

    }


}
