/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_operaciones2;

/**
 *
 * @author invitado
 */
public class EVA1_8_Operaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre =  "Ruben";
        String apellido = "Hernandez";
        String nombreCom;
        //cadenas de texto la operacion se llama 
        //Concatenación ---> Unir cadenas de texto
        //El operador de concatenación es el +
        //Cuando un simbolo tiene varias funciones
        //se llama sabrecarga (de operadores)
        nombreCom = nombre + " " + apellido;
         //poner " " + te lo pone con espacio
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("El apellido es: " + apellido);
        System.out.println("El nombre compreto es: " + nombreCom);
        
        
    }
    
}
