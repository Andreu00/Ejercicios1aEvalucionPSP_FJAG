/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author maget
 */
public class ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorExit,caracter;
        Scanner sc = new Scanner(System.in);
        ProcessBuilder processBuilder;
        String cadena;
        System.out.print("Introduzca la cadena a enviar: ");
        cadena = sc.nextLine();
        File directorio=new File("./src/Ejercicios");
        if (cadena.equals("")){
            processBuilder = new ProcessBuilder("java","ejer5_p1.java");
        }else{
            processBuilder = new ProcessBuilder("java","ejer5_p1.java",cadena);
        }
        processBuilder.directory(directorio);
        System.out.printf("Directorio de Trabajo: %s\n",processBuilder.directory());
     
        try {
            Process proceso= processBuilder.start();
            int salida;
            try {
                salida = proceso.waitFor();
                System.out.println("Valor de Salida: " + salida);
                switch (salida) {
                    case (0):
                        System.out.println("FINAL CORRECTO...");
                            try {
                                // fichero al que se enviará la salida del programa
                                String fichero = "src/tema1/ejercicio6/ficheroSalidaCorrecto.txt";
                                FileOutputStream fos = new FileOutputStream(fichero);
                                PrintWriter printWriter = new PrintWriter(fos);
                                InputStream inputStream = proceso.getInputStream();
                                BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));
                                String linea;
                                while ((linea = bufferReader.readLine()) != null) // lee la salida
                                {
                                    //System.out.println("INSERTO EN EL FICHERO > " + linea);
                                    printWriter.println(linea); // la inserta en el fichero
                                }
                                bufferReader.close();
                                printWriter.close();
                            }catch (Exception ee) {
                                ee.printStackTrace();
                            }
                               
                    break;
                    case (1):
                        System.out.println("FINAL INCORRECTO...");
                        try {
                            // fichero al que se enviará la salida del programa
                            String fichero = "src/tema1/ejercicio6/ficheroSalidaError.txt";
                            FileOutputStream fos = new FileOutputStream(fichero);
                            PrintWriter printWriter = new PrintWriter(fos);
                            InputStream inputStream = proceso.getErrorStream();
                            BufferedReader bufferReader = new BufferedReader(new InputStreamReader(inputStream));
                            String lineaError;
                            while ((lineaError = bufferReader.readLine()) != null) // lee la salida
                            {
                                //System.out.println("INSERTO EN EL FICHEROError > " + linea);
                                printWriter.println("Error >> "+lineaError); // la inserta en el fichero
                            }
                            bufferReader.close();
                            printWriter.close();
                        }catch (Exception ee) {
                            ee.printStackTrace();
                        }                               
                    break;
                }

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            }catch (IOException ex) {
                System.out.println(ex);
            }
    }
    
}
