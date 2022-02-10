/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaDeportes;

import java.util.Scanner;

/**
 * Clase principal con el método main. 
 * 
 * @author Adrián Arjona
 */
public class LanzadorTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Aqúi va un menú implementado a través de un método

// ----------------------- MAIN -------------------------------        

//String mensaje = leerTeclado() ;
//        System.out.println("El resutlado: ");
//        System.out.println(mensaje);

            
//            int opcion = leerOpcion() ;
//            
//            System.out.println(opcion);
    }
    
    private static void mostrarMenu(){ // MÉTODO QUE VA A ALBERGAR EL MENÚ
        
    }
    
    
    /**
     * Método que sirve para introducir datos por teclado.
     * 
     * @return String. Devuelve una cadena de caracteres.
     */
    private static String leerTeclado(){
        
        // Declaración de variables y objetos
        
        String mensaje = "";
        boolean validador = false ;
        
        Scanner teclado = new Scanner(System.in) ;
        
        // Entrada y salida de datos
        
        do
        {
            System.out.println("Introduce los datos escribiendo aquí: ");
                try
                {
                    mensaje = teclado.nextLine() ;
                    validador = true ;
                }
                catch (Exception e){
                    System.out.println("Algo salió mal. Debes introducir una cadena de caracteres válida.");
                }
        } while (!validador) ;
        
        return mensaje ;
    }
    
     private static int leerOpcion(){
        
        // Declaración de variables
        
        int opcion = 0 ;
        int datoIntroducido ;
        boolean validador = false ;
        
        // Entrada y salida de datos
        
         do // Pedirá un número del 0 al 9 mientras que se cumpla la condición
         {
             System.out.println("Debes seleccionar un número del 0 al 9.");
             
             try
             {
                datoIntroducido = Integer.parseInt(leerTeclado()) ; // Pide el dato por teclado y lo guarda
                
                 if (datoIntroducido >= 0 & datoIntroducido <= 9) { // Si el número introcido está comprendido entre 0 y 9 (incluidos)...
                     opcion = datoIntroducido ; // ...lo almacenará y saldrá del bucle para devolver ese valor
                     validador = true ;
                 }
             }
             catch (NumberFormatException e){
                 System.out.println("----------------------------------------------");
                 System.out.println("Lo que has introducido no es un número entero.");
                 System.out.println("----------------------------------------------");
             }
             catch (Exception e){
                 System.out.println("Algo salió mal... Presta atención a las instrucciones.");
             }
             
         } while (!validador);
         
        return opcion ;
    }
    
}
