package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cSoftDrinks;
    private List<JRadioButton> bgDiscounts;
    FoodOrderGUI(){
        bgDiscounts = new ArrayList<>();
        bgDiscounts.add(rb5);
        bgDiscounts.add(rbNone);
        bgDiscounts.add(rb10);
        bgDiscounts.add(rb15);


        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double total=0;
                    if(cPizza.isSelected()){
                        total+=100;
                    }
                    if(cBurger.isSelected()){
                        total+=80;
                    }
                    if(cFries.isSelected()){
                        total+=65;
                    }
                    if(cSoftDrinks.isSelected()){
                        total+=55;
                    }
                    if(cTea.isSelected()){
                        total+=50;
                    }
                    if(cSundae.isSelected()){
                        total+=40;
                    }
                    double disc;
                    boolean discc = false;
                    for(JRadioButton rb : bgDiscounts){
                        if(rb.isSelected()){
                            discc = true;
                            if(Objects.equals(rb.getText(), "5% Off")){
                                total = total - (total * 0.05);
                            }
                            if(Objects.equals(rb.getText(), "10% Off")){
                                total = total - (total * 0.10);
                            }
                            if(Objects.equals(rb.getText(), "15% Off")){
                                total = total - (total * 0.15);
                            }
                        }
                    }
                    if(total == 0 && !discc){
                        JOptionPane.showMessageDialog(panel1, "You did not select any food and discount");
                    } else if(total == 0){
                        JOptionPane.showMessageDialog(panel1, "You did not select any food");
                    } else if(!discc){
                        JOptionPane.showMessageDialog(panel1, "You did not select any discount");
                    } else {
                        JOptionPane.showMessageDialog(panel1, "The total price is Php "+ String.format("%.2f",total));
                    }
                }catch(Exception ee){
                    JOptionPane.showMessageDialog(panel1, "You did something wrong");
                }



            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(500,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
