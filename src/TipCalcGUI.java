import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalcGUI extends JFrame implements ActionListener {

    private JTextField textField1;
    private JPanel mainPanel;
    private JLabel tip;
    private JLabel billLabel;
    private JButton tipMinus;
    private JButton tipPlus;
    private JTextArea textArea1;
    private JButton pMinus;
    private JButton pPlus;
    private JTextField pField;
    private JLabel totalLabel;
    private JTextArea textArea2;
    private JLabel tipLabel;
    private JTextField tipField;


    public TipCalcGUI()
    {
        setTitle("TipCalculator");
        setContentPane(mainPanel);
        setSize(700, 400);
        setLocation(450, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tipMinus.addActionListener(this);
        tipPlus.addActionListener(this);
        pMinus.addActionListener(this);
        pPlus.addActionListener(this);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent e)
     {
         Object source = e.getSource();
         if (source instanceof JButton)
         {
             JButton b = (JButton) source;
             if (b.getText().equals("-") && b.getName().equals("tipMinus"))
             {

             }
             {

             }
         }
     }

}
