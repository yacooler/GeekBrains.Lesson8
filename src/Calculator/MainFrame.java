package Calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.*;


public class MainFrame extends JFrame {
    private static final int SIZE_WIDTH = 300;
    private static final int SIZE_HEIGHT = 300;

    private final ScriptEngineManager manager = new ScriptEngineManager();
    private final ScriptEngine engine = manager.getEngineByName("JavaScript");


    public MainFrame(String arg) {

        setBounds(getGraphicsConfiguration().getBounds().width / 2 - SIZE_WIDTH / 2,
                getGraphicsConfiguration().getBounds().height / 2 - SIZE_HEIGHT / 2,
                SIZE_WIDTH, SIZE_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");

        initComponents(arg);

        setVisible(true);
    }

    private void initComponents(String arg){

        JPanel borderPanel = new JPanel(new BorderLayout() );
        JPanel textPanel = new JPanel(new GridLayout (2,1));

        textPanel.add(new JLabel());
        JTextField resultField = new JTextField(arg);

        Font newFont = resultField.getFont().deriveFont(20F);
        resultField.setFont(newFont);

        resultField.setHorizontalAlignment(SwingConstants.RIGHT);

        Calculate calculate = new Calculate(engine);
        KeyHandler keyHandler = new KeyHandler(resultField, calculate);


        JPanel gridPanel = new JPanel(new GridLayout(4,5));
        for (int i = 0; i < Constants.CALC_KEYS.length; i++) {
            JButton button = new JButton(String.valueOf(Constants.CALC_KEYS[i]));
            button.addActionListener(keyHandler);
            gridPanel.add(button);
        }

        textPanel.add(resultField);
        borderPanel.add(textPanel, BorderLayout.NORTH);
        borderPanel.add(gridPanel, BorderLayout.CENTER);

        getContentPane().add(borderPanel);

        if (!arg.equals("0")){
            resultField.setText(calculate.evaluate(resultField.getText()));
        }

    }


}
