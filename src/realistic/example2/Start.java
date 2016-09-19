/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realistic.example2;

/**
 *
 * @author kevinjerke
 */
public class Start {
    public static void main(String []args){
    CocaCola c = new CocaCola() {};
        
        //a.setDrinkType("soda");
        c.setDrinkType();
        c.setFlavor("Cherry");
        //a.setSodaType("Coke");
        c.setNutritionalType("Diet");
        
        
        c.getDrinkDetails();
    }
}
