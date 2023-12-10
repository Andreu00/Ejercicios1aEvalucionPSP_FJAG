/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;

/**
 *
 * @author maget
 */
public class ejer4_p1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salida=0;
        int numero;
        
        if(args.length<1 || args.length>1){
            salida=1;
        }else{
            try{
                numero=Integer.parseInt(args[0]);
                if(numero<0){
                    salida=3;
                }
            }catch(NumberFormatException ex){
                salida=2;
            }
        }
        System.exit(salida);
    }
    
}
