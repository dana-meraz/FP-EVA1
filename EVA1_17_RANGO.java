/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_17_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("Coloca la calificación");
        calif = captu.nextInt();
        captu.nextLine();
        
        if(calif >= 0 && calif <= 100){
        System.out.println("Calificación valida");
        }else{
        System.out.println("Calificación no valida");
        }
    }
    
}
