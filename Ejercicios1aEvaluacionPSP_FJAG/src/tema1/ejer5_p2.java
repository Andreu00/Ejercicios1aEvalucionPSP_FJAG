/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author maget
 */
public class ejer5_p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int salida, caracter;
        Scanner teclado=new Scanner(System.in);
        ProcessBuilder proceso;
        String cadenaTexto;
        System.out.print("Introduce una cande de texto: ");
        cadenaTexto=teclado.nextLine();
        File fichero=new File("./src/Ejercicios");
        if(cadenaTexto.equals("")){
            proceso=new ProcessBuilder("java", "ejer5_p1");
        }else{
            proceso=new ProcessBuilder("java", "ejer5_p1", cadenaTexto);
        }
        proceso.directory(fichero);
        System.out.printf("Ruta: %s\n", proceso);
    }
    
}
