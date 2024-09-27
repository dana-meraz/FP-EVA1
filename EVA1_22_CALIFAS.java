/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_22_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner captu = new Scanner (System.in);
        System.out.println("COLOCA LA CALIFICACION");
        num = captu.nextInt();
        
        if(num >= 90 && num <= 100){
        System.out.println("A");
        }else if(num >= 80 && num <=89 ){
            System.out.println("B");
        }else if(num >= 70 && num <=79){
            System.out.println("C");
        }else if(num == 60 && num <=69){
            System.out.println("D");
        }else{
        System.out.println("CALIFICACIÓN NO VALIDA");
        }

        
    }
    
}
