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
public class CocaCola extends SoftDrink {
    String nutritionType;
    String sodaType;
    
    public String getNutritionalInfo(){
        return nutritionType;
    }
            
    public void setNutritionalType(String nutritionalType){
        nutritionType = nutritionalType;
    }
    
    @Override
    public String getSodaType(){
        return sodaType;
    }
    
    @Override
    public void setSodaType(String soda){
        sodaType = soda;
    }
    
    public void setSodaType(){
        sodaType = "Coca-Cola";
    }
    
    @Override
    public void getDrinkDetails(){
        JOptionPane.showMessageDialog(null, "Drink type: " + getDrinkType() + " flavor: " + getFlavor() + " soda: " + getSodaType());
    }
}
