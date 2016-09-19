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
public abstract class CocaCola extends SoftDrink {
     String nutritionType;
     String sodaType;
     
     @Override
     public String getNutritionType(){
         return nutritionType;
     }
     @Override
     public void setNutritionType(){
         this.nutritionType = nutritionType;
     }
     @Override
       public String getSodaType(){
         return nutritionType;
     }
     @Override
     public void setSodaType(){
         this.sodaType = sodaType;
     }
}
