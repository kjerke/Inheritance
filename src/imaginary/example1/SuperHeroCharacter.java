/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.example1;

import imaginary.example1.ActionMovie;
import javax.swing.JOptionPane;

/**
 *
 * @author kevinjerke
 */
public class SuperHeroCharacter extends ActionMovie{
    String superHeroName;

    
    public String getSuperHeroName() {
        return superHeroName;
    }
  
    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

 
  
    public void getMovieDetails(){
        JOptionPane.showMessageDialog(null, "Movie type: " + getNameOfMovie() + "superHeroName: " + getSuperHeroName());
    }
    
    
}
