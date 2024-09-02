/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_pelicula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        
        Scanner captu;
        captu = new Scanner (System.in);
        
        System.out.println("INTRODUCE EL NOMBRE DE LA PELICULA");
        nombre = captu.nextLine();
        System.out.println("INTRODUCE EL GENERO D ELA PELICULA");
        genero = captu.nextLine();
        System.out.println("INTRODUCE LA DURACION DE LA PELICULA");
        duracion = captu.nextInt();
        System.out.println("INTRODUCE EL REPARTO");
        reparto = captu.nextLine();
        System.out.println("INTRODUCE LA CLASIFICACIÓN");
        clasificacion = captu.nextLine();
        
        
        System .out.println("Datos caprutados_________________________________");
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(reparto);
        System.out.println(clasificacion);
        
        
    }
    
}
