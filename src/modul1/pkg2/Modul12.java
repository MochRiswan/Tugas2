/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1.pkg2;

/**
 *
 * @author MOKLET-2
 */
public class Modul12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i =0; i<4; i++){
            for(int j =0; j<4; j++){
                System.out.print(" @ ");
                if (i==j){
                    break;
                }
            }
             System.out.println();
        }
    }
    
}
