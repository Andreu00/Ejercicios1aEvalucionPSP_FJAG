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
public class ejer8_p1 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.print("Ingrese una cadena de texto: ");
        cadena = teclado.nextLine();

        // Verificar si la cadena está vacía
        if (cadena.equals("")) {
            System.out.println("La cadena está vacía.");
        } else {
            if (esPalindromo(cadena)) {
                System.out.println("La cadena es un palíndromo.");
            } else {
                System.out.println("La cadena no es un palíndromo.");
            }
        }
    }


    private static boolean esPalindromo(String cadena) {
        // Eliminar espacios y convertir a minúsculas
        String cadenaSinEspacios = cadena.replaceAll("\\s", "").toLowerCase();

        // Comparar la cadena original con su versión invertida
        String cadenaInvertida = new StringBuilder(cadenaSinEspacios).reverse().toString();

        return cadenaSinEspacios.equals(cadenaInvertida);
    }
}

    

