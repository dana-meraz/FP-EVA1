/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_10_Formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double veloIn, tmp,acel,dis ;
       Scanner captu = new Scanner(System.in);
       
       System.out.println("Velocidad inicial: ");
       veloIn = captu.nextDouble();
        System.out.println("Tiempo: ");
        tmp = captu.nextDouble();
        System.out.println("Aceleración; ");
        acel = captu.nextDouble();
        
        dis = veloIn * tmp + (acel * tmp *tmp) / 2;
        
        System.out.println("Distancia = " + dis);
        
        
        
        
    }
    
}
