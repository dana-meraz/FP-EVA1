/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_7_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMÉTICAS
        int x = 10; //declaración y asignación
        int y = 5;
        //declaración  de multiples variables del mismo tipo
        int suma, resta, divi, multi, pot, raiz;
        //SUMA RESTA
        suma = x + y; //operador de suma +
        System.out.println("suma de x + y");
        System.out.println(suma);
        
        resta = x - y; //operador de diferencia -
        System.out.println("resta de x - y");
        System.out.println(resta);
        
    //MULTIPLICACIÓN
        multi = x * y; //operador de diferencia *
        System.out.println("Multiplicacion de x * y");
        System.out.println(multi);
        
        //DIVICION ----> el manejo de tipos de datos
        //Si dividimos enteros, Java da como resultado un entero
        divi = x / y;
        System.out.println("Divición de x(10) / y(5)");
        System.out.println(divi);
        //Cambiamos los valores de x y
        x = 11;
        y = 3;
        divi = x / y;
        System.out.println("Divición de x(7) / y(3)");
        System.out.println(divi);
        
        double val1 = 11;
        double val2 = 3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("Divicion entre # decimales");
        System.out.println(diviD);
        
        
    }
    
}
