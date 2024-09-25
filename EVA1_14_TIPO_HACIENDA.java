/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura el tipo de persona F:E");
        tipo = captu.nextLine().charAt(0);
        System.out.println("el caracter: " + tipo);
        if(tipo == 'F')
            System.out.println("prtsona ficica");
        else
            System.out.println("persona moral");
        
    }
    
    
    
}
