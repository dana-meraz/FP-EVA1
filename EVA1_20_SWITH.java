/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_swith;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_20_SWITH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int dia;
        Scanner captu = new Scanner (System.in);
        System.out.println("Número correspondiente al dia (1 - 7): ");
        dia = captu.nextInt();
        
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;//ultima instruccion - FIN del caso
            case 2:
                System.out.println("Martes");
                break;//ultima instruccion - FIN del caso
            case 3:
                System.out.println("Miercoles");
                break;//ultima instruccion - FIN del caso
            case 4:
                System.out.println("Jueves");
                break;//ultima instruccion - FIN del caso
            case 5:
                System.out.println("Viernes");
                break;//ultima instruccion - FIN del caso
            case 6:
                System.out.println("Sabado");
                break;//ultima instruccion - FIN del caso
            case 7:
                System.out.println("Domingo");
                break;//ultima instruccion - FIN del caso
            default: //OPCIONAL, SIN BREAK, ULTIMA SECCIÓN DEL SWITCH 
                System.out.println("Número no válido (Debe ser entre 1 al 7)");
        }
    }
    
}
