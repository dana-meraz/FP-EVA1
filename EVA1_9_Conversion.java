/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double far, cent, kl;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Temperatura en faranheit: ");
        far = captu.nextDouble();
        cent = (far - 32) / 1.8;
        System.out.println("C = " + cent);
        
        System.out.println("Temperatura en centígrados: ");
        cent = captu.nextDouble ();
        far = cent * 18 + 32;
        System.out.println("F = " + far);
        
        System.out.println("Temperatura en Centigrados: ");
        cent = captu.nextDouble ();
         kl = cent + 273.15;
        System.out.println("K = " + kl); 
        
    }
    
}
