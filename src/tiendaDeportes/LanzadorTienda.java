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
        
        String mensaje ;
        
        Scanner teclado = new Scanner(System.in) ;
        
        // Entrada y salida de datos
        
        System.out.println("Introduce los datos escribiendo aquí: ");
        mensaje = teclado.nextLine() ;
        
        return mensaje ;
    }
}
