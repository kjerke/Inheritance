/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realistic.example3;

/**
 *
 * @author kevinjerke
 */
public class Start {
       public static void main(String []args){
        CocaCola a = new CocaCola();
        
        
        a.setDrinkType();
        a.setFlavor("Cherry");
        a.setNutritionalType("Diet");
        a.getDrinkDetails();
    }
}
