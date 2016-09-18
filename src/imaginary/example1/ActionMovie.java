/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.example1;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinjerke
 */
public class ActionMovie {
    String characterType;
    String nameOfMovie;
            
    public String getNameOfMovie() {
    return nameOfMovie;
    }
   
    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
        
    }
    
    public void setCharacterType(String character){
        characterType = character;
    }
    
    public String getCharacterType(){
        return characterType;
    }
    
   
    public void getCharacterDetails(){
        JOptionPane.showMessageDialog(null, "Character Details: " + getCharacterType());
    }
}
