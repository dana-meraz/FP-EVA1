/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONAL
        //LOGICA BOOLEANA --> OPERACIONES DE VERDADERO Y FALSO
        //SOLICITAR LA EDAD EN AÑOS.
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura la edad: ");
        edad = captu.nextInt();
        
        //DETERMINAR SI ES UN ADULTO O NO
        // La operacion logica solo genera como resultado 
        //un verdadero o un fslso
        //si son validas las instrucciones, hay que gruparlas con llaves {}
        if(edad >= 18) {//Bloque para el verdadero
        System.out.println("ES UN ADULTO");
        }else{//Bloque para el falso (opcional)
        System.out.println("MENOR DE EDAD!!");
        }
        
        
        
    }
    
}
