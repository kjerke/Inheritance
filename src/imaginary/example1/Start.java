/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imaginary.example1;

import imaginary.example1.Start.Superman;


/**
 *
 * @author kevinjerke
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Superman s = new Superman();
        
        s.getNameOfMovie();
        s.getSuperHeroName();

        s.getMovieDetails();
        
    }

    static class Superman {

        public Superman() {
        }

        private void getNameOfMovie() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void getSuperHeroName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void getMovieDetails() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
