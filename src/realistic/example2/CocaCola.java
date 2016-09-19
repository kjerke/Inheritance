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
public class CocaCola extends SoftDrink {
     String nutritionType;
     String sodaType;
     
     
     public String getNutritionType(){
         return nutritionType;
     }
     
     public void setNutritionType(){
         this.nutritionType = nutritionType;
     }
     
     @Override
       public final String getSodaType(){
         return nutritionType;
     }
     
     public final void setSodaType(){
         this.sodaType = sodaType;
     }
     
     
}
