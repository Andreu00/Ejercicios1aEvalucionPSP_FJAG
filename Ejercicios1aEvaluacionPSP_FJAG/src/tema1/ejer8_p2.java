/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author maget
 */
public class ejer8_p2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File directorio=new File("./src/Ejercicios");
        File fErr=new File("./src/Ejercicios/error.txt");
        
        String ficheroCadena="./src/Ejercicios/cadenaTexto.txt";
        String cadenaEntrada = leerCadenaArchivo(ficheroCadena);
        
        ProcessBuilder pb=new ProcessBuilder("java", "ejer8_p1.java", cadenaEntrada);
        ProcessBuilder pb2=new ProcessBuilder("CMD");        
        
        pb.directory(directorio);
        pb2.redirectError(fErr);
        Process proceso1=pb.start();
        
        
        
    }
    
    private static String leerCadenaArchivo(String nombreArchivo) {
        String cadena="";
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                cadena=linea;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cadena.toString();
    }
    
}
