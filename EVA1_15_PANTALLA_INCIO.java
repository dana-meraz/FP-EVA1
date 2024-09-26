/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_15_pantalla_incio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_15_PANTALLA_INCIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    final String USUARIO = "Admin";
    final String PASSWORD = "Admin";
    //final PI= 3.1416;
    
    String usu, pwd;
    Scanner captu = new Scanner(System.in);
    System.out.println("Usuario");
    usu = captu.nextLine();
    System.out.println("Password: ");
    pwd = captu.nextLine();
    //como validamos el acceso
    if(usu.equals(USUARIO) && pwd.equals(PASSWORD)){
    System.out.println("Acceso consedido: ");
    }else{
    System.out.println("Acceso denegado: ");
    }
    
    
    }
    
}
