/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_meses;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_19_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int meses;
   Scanner captu = new Scanner (System.in);
   
   System.out.println("Número correspondiente al mes (del 1 al 12)");
   meses = captu.nextInt();
   
   if(meses == 1){
   System.out.println("Enero");
   }else if(meses == 2){
   System.out.println("Febrero");
   }else if(meses == 3){
   System.out.println("Marzo");
   }else if(meses == 4){
   System.out.println("Abril");
   }else if(meses == 5){
   System.out.println("Mayo");
   }else if(meses == 6){
   System.out.println("Junio");
   }else if(meses == 7){
   System.out.println("Julio");
   }else if(meses == 8){
   System.out.println("Agosto");
   }else if(meses == 9){
   System.out.println("Septiembre");
   }else if(meses == 10){
   System.out.println("Octubre");
   }else if(meses == 11){
   System.out.println("Noviembre");
   }else if(meses == 12){
   System.out.println("Diciembre");
   }else{
   System.out.println("El numero del mes no es valido (Es entre 1 al 12)");
   }
    
    }
    
}
