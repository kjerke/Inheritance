/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realistic.example1;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinjerke
 */
public class Beverage {
    String drinkType;
    
    public void setDrinkType(String drink){
        drinkType = drink;
    }
    
    public final String getDrinkType(){
        return drinkType;
    }
    
    public final void getDrinkDetails(){
        JOptionPane.showMessageDialog(null, "Drink type: " + getDrinkType());
    }
}
