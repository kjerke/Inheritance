/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author kevinjerke
 */
public class Inheritance {
    public static void main(String []args){
        CocaCola a = new CocaCola();
        
        //a.setDrinkType("soda");
        a.setDrinkType();
        a.setFlavor("Cherry");
        //a.setSodaType("Coke");
        a.setNutritionalType("Diet");
        
        //System.out.println(a.getDrinkType());
        a.getDrinkDetails();
    }
}