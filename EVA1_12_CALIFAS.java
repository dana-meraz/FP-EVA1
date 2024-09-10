/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR VARIABLE PARA LA CALIFICACIÓN
        //EVALUAR SI ACREDITA (MAYOR O IGUAL A 70)
        //O NO ACREDITA (NA---> MENOR A 70)
        int califa;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("INGRESA LA CALIFICACION");
    califa = captu.nextInt();
    
    if(califa >= 70){//IF(califa>=70) e invertido los printl
    System.out.println("ACREDITA");
    }else{
    System.out.println("NA");
    }
    }
    
}
