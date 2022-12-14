package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    LeapYearGUI(){
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int year = Integer.parseInt(tfYear.getText());
                    boolean isLeap = true;
                    String output = "Leap year";
                    if(year % 4 != 0){
                        isLeap = false;
                        output = "Not a leap year";
                    }
                    JOptionPane.showMessageDialog(panel1, output);
                } catch (Exception ee){
                    JOptionPane.showMessageDialog(panel1, "You entered a wrong input");
                }

            }
        });

    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(400,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}

