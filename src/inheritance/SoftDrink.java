/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import javax.swing.JOptionPane;

/**
 * @author kevinjerke
 */
public class SoftDrink extends Beverage {
    String flavorType;
    String sodaType;
    String drinkType;
    
    public void setFlavor(String flavor){
        flavorType = flavor;
    }
    
    public String getFlavor(){
        return flavorType;
    }
    
    public void setSodaType(String soda){
        sodaType = soda;
    }
    
    public String getSodaType(){
        return sodaType;
    }
    
    @Override
    public void setDrinkType(String drink){
        drinkType = drink;
    }
    
    public void setDrinkType(){
        drinkType = "Soda";
    }
    
    @Override
    public String getDrinkType(){
        return drinkType;
    }
    
    @Override
    public void getDrinkDetails(){
        JOptionPane.showMessageDialog(null, "Drink type: " + getDrinkType() + " flavor: " + getFlavor() + " soda: " + getSodaType());
    }
}
