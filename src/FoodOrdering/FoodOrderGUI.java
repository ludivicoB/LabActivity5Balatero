package FoodOrdering;

import javax.swing.*;
import java.util.List;

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
    private List<JCheckBox> cbFoods;
    FoodOrderGUI(){
        bgDiscounts.add(rb5);
        bgDiscounts.add(rbNone);
        bgDiscounts.add(rb10);
        bgDiscounts.add(rb15);

        cbFoods.add(cSundae);
        cbFoods.add(cBurger);
        cbFoods.add(cFries);
        cbFoods.add(cTea);
        cbFoods.add(cPizza);
        cbFoods.add(cSoftDrinks);
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
