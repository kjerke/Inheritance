/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.example1;

import imaginary.example1.SuperHeroCharacter;
import javax.swing.JOptionPane;
/**
 *
 * @author kevinjerke
 */
public class Superman extends SuperHeroCharacter{
    String superPowers; 
    String heroicMoments; 
    
    public String getSuperPowers() {
        return superPowers;
    }

    public void setSuperPowers(String superPowers) {
        this.superPowers = superPowers;
    }

    public String getHeroicMoments() {
        return heroicMoments;
    }

    public void setHeroicMoments(String heroicMoments) {
        this.heroicMoments = heroicMoments;
    }
    
    @Override
    public void getMovieDetails(){
        JOptionPane.showMessageDialog(null, "Movie Details: " + getHeroicMoments());
    }
    
}
