package Calc;

import javax.swing.*;
import java.awt.*;


public class FrameCalc extends JFrame {
    private static final int SIZE_WIDTH = 400;
    private static final int SIZE_HEIGHT = 400;




    public FrameCalc() {

        setBounds(getGraphicsConfiguration().getBounds().width / 2 - SIZE_WIDTH / 2,
                getGraphicsConfiguration().getBounds().height / 2 - SIZE_HEIGHT / 2,
                SIZE_WIDTH, SIZE_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calc");

        initComponents();

        setVisible(true);
    }

    private void initComponents(){

        JPanel borderPanel = new JPanel(new BorderLayout() );

        JPanel textPanel = new JPanel(new GridLayout (2,1));
        textPanel.add(new JLabel());
        JTextField resultField = new JTextField("0");
        resultField.setHorizontalAlignment(SwingConstants.RIGHT);
        CalcKeyHandler calcKeyHandler = new CalcKeyHandler(resultField);


        JPanel gridPanel = new JPanel(new GridLayout(4,5));
        for (int i = 0; i < CalcConstants.CALC_KEYS.length; i++) {
            JButton button = new JButton(String.valueOf(CalcConstants.CALC_KEYS[i]));
            button.addActionListener(calcKeyHandler);
            gridPanel.add(button);
        }

        textPanel.add(resultField);
        borderPanel.add(textPanel, BorderLayout.NORTH);
        borderPanel.add(gridPanel, BorderLayout.CENTER);

        getContentPane().add(borderPanel);

    }


}
