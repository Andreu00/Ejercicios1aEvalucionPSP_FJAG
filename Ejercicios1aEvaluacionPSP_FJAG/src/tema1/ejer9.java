/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author maget
 */
public class ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        File fichero=new File("./src/Ejercicios/cadenaTexto2.txt");
        String cadena="";
        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                // Si se encuentra un asterisco (*), finalizar el programa
                System.out.println(linea);
                if (linea.contains("*")) {
                    System.out.println("Programa finalizado");
                    System.exit(0);
                }
                cadena += linea + "\n";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
