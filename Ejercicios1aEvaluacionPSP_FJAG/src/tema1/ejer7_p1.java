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
public class ejer7_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena, finaliza con escribamos un *:");
        String cadena="";
        
        while(!cadena.equals("*")){
            cadena = scanner.nextLine();
        }
    }
    
}
