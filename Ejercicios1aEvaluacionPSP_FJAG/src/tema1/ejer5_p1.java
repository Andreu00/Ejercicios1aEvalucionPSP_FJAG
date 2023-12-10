/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

import java.util.Scanner;

/**
 *
 * @author maget
 */
public class ejer5_p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int salida=0;
        String cadena="";
        if(args.length<1){
            System.err.println("Debes introducir una cadena");
            salida=1;
        }else{
            for (int i = 0; i < args.length; i++) {
                cadena+=args[i];
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(cadena);
            }
        }
       System.exit(salida);
    }
    
}
