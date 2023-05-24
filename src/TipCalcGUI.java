import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TipCalcGUI extends JFrame implements ActionListener {

    private JPanel mainPanel;
    private JLabel tip;
    private JLabel billLabel;
    private JButton tipMinus;
    private JButton tipPlus;
    private JTextArea textAreaTip;
    private JButton pMinus;
    private JButton pPlus;
    private JLabel totalLabel;
    private JTextArea textAreaTotal;
    private JLabel tipLabel;
    private JTextArea textAreaBill;
    private JTextArea textAreaTipPercent;
    private JTextArea textAreaPeople;
    private TipCalculator calculator;
    private double bill;
    private int percent;
    private int numPeople;


    public TipCalcGUI() {
        createUIComponent();

    }

    private void createUIComponent() {
        setTitle("TipCalculator");
        setContentPane(mainPanel);
        setSize(700, 400);
        setLocation(450, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setActionListeners();
    }

    public void setActionListeners() {
        tipMinus.addActionListener(this);
        tipPlus.addActionListener(this);
        pMinus.addActionListener(this);
        pPlus.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton b = (JButton) source;
            String text = b.getText();
            if (text.equals("-") && percent != 0) {
                bill = Double.parseDouble(textAreaBill.getText());
                percent = Integer.parseInt(textAreaTipPercent.getText());
                numPeople = Integer.parseInt(textAreaPeople.getText());
                calculator = new TipCalculator(bill, percent, numPeople);
                calculator.setTipPercentage(percent--);
                textAreaTipPercent.setText("" + percent);
                textAreaTip.setText(""+calculator.tipPerPerson());
                textAreaTotal.setText("" + calculator.totalPerPerson());
            } else if (text.equals("+")) {
                bill = Double.parseDouble(textAreaBill.getText());
                percent = Integer.parseInt(textAreaTipPercent.getText());
                numPeople = Integer.parseInt(textAreaPeople.getText());
                calculator = new TipCalculator(bill, percent, numPeople);
                calculator.setTipPercentage(percent++);
                textAreaTipPercent.setText("" + percent);
                textAreaTip.setText(""+calculator.tipPerPerson());
                textAreaTotal.setText("" + calculator.totalBill());
            } else if (text.equals("--") && (numPeople != 0)) {
                bill = Double.parseDouble(textAreaBill.getText());
                percent = Integer.parseInt(textAreaTipPercent.getText());
                numPeople = Integer.parseInt(textAreaPeople.getText());
                calculator = new TipCalculator(bill, percent, numPeople);
                calculator.setNumberOfPeople(numPeople--);
                textAreaPeople.setText("" + numPeople);
                textAreaTip.setText(""+calculator.tipPerPerson());
                textAreaTotal.setText("" + calculator.totalPerPerson());
            } else if (text.equals("++")) {
                bill = Double.parseDouble(textAreaBill.getText());
                percent = Integer.parseInt(textAreaTipPercent.getText());
                numPeople = Integer.parseInt(textAreaPeople.getText());
                calculator = new TipCalculator(bill, percent, numPeople);
                calculator.setNumberOfPeople(numPeople++);
                textAreaPeople.setText("" + numPeople);
                textAreaTip.setText(""+calculator.tipPerPerson());
                textAreaTotal.setText("" + calculator.totalPerPerson());
            }
        }

    }


}