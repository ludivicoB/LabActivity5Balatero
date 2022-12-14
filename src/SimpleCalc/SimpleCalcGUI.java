package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;
    SimpleCalcGUI(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int num1 = Integer.parseInt(tfNumber1.getText());
                    int num2 = Integer.parseInt(tfNumber2.getText());
                    int result = 0;
                    if(cbOperations.getSelectedItem() == "+"){
                        result = num1 + num2;
                    }
                    if(cbOperations.getSelectedItem() == "-"){
                        result = num1-num2;
                    }
                    if(cbOperations.getSelectedItem() == "*"){
                        result = num1*num2;
                    }
                    if(cbOperations.getSelectedItem() == "/"){
                        result = num1/num2;
                    }
                    lblResult.setText(String.valueOf(result));
                } catch (Exception ee){
                    JOptionPane.showMessageDialog(panel1, "Invalid Input");
                }

            }
        });
    }
    public static void main(String[] args) {

        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.panel1);
        app.setSize(500,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);

    }
}
