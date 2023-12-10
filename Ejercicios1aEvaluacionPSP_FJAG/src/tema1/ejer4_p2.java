/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author maget
 */
public class ejer4_p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salida, caracter;
        File fichero=new File("./src/Ejercicios");
        ProcessBuilder proceso1=new ProcessBuilder("java", "ejer4_p1.java", "-4");
        proceso1.directory(fichero);
        System.out.printf("Directorio: %s\n",proceso1.directory());
        
        try{
            Process proceso2=proceso1.start();
            InputStream entrada=proceso2.getInputStream();
            while((caracter=entrada.read())!=-1){
                System.out.print((char)caracter);
            }
            entrada.close();
            salida=proceso2.waitFor();
            System.out.println("Valor de salida: "+salida);
            
            switch(salida){
                case 1 -> System.out.println("El numero de args es menor o mayor a 1");
                case 2 -> System.out.println("El args enviado no es un entero");
                case 3 -> System.out.println("Args menor que 0");
                case 4 -> System.out.println("Args es un numero entero mayor a 0");
            }
        }catch(IOException ex){
            System.out.println(ex);
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
    }
    
}
