/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
        int km, meses;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuanto kiometraje tiene el vehiculo");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuanto meses tiene el vehiculo");
        meses = captu.nextInt();
        captu.nextLine();
        
        if(km >= 5000 || meses >= 6){
        System.out.println("Cambio de aceite");
        }else{
        System.out.println("Vehiculo en buenas condiciones");
        }
        
    }
    
}
