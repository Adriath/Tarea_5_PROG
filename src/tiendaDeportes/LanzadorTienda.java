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
 * @version 1.0
 */
public class LanzadorTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Antes del menú deberá ir un método llamado obtenerDatosArticulo() que pedirá datos para utilizarlos en el menú
//        Aqúi va un menú implementado a través de un método

// ----------------------- MAIN -------------------------------        

obtenerDatosArticulo() ;

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
    
    /**
     * Método que pide un número del 0 al 9 por teclado.
     * 
     * @return int. Devuelve un número del 0 al 9 (incluidos).
     */
     private static int leerOpcion(){
        
        // DECLARACIÓN DE VARIABLES
        
        int opcion = 0 ;
        int datoIntroducido ;
        boolean validador = false ;
        
        // ENTRADA Y SALIDA DE DATOS
        
         do // Pedirá un número del 0 al 9 mientras que se cumpla la condición
         {
             System.out.println("Debes seleccionar un número del 0 al 9.");
             
             try
             {
                datoIntroducido = Integer.parseInt(leerTeclado()) ; // Pide el dato por teclado y lo guarda
                
                 if (datoIntroducido >= 0 & datoIntroducido <= 9) { // Si el número introcido está comprendido entre 0 y 9 (incluidos)...
                     opcion = datoIntroducido ; // ...lo almacenará y saldrá del bucle para devolver ese 
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
    
    // Aunque lo pone en el main lo repito aquí: falta un método, obtenerDatosArticulo()
    // También hay que crear los métoso validadDescripcion() y validadCodigoArticulo() que serán utilizados en el método anterior.
     
     private static boolean validarDescripcion(String descripcion){
         
         // DECLARACIÓN DE VARIABLES
         
         boolean valido = false ;
                  
         // OPERACIONES
         
         if (descripcion.length() <= 40 ) // Si la descripcion es menor o igual que 40 caracteres será válido (true). False en caso contrario
         {
             valido = true ;
         }
         
         return valido ;
     }
     
//     private static boolean validarCodigoArticulo(String codigo){
//         
//     }
     
     private static ArticuloDeportivo obtenerDatosArticulo(){
         
         // DECLARACIÓN DE VARIABLES
         
         String descripcion ;
         String codigo ;
         boolean valido = false ;
         
         // ENTRADA Y SALIDA DE DATOS
         
         while (valido == false) // Mientras la descripción no se valide se repetirá el proceso de validación.
         {
            System.out.println("Inserta la descripción del artículo."); // Pide la descripción del artículo...
            descripcion = leerTeclado() ; //...lo almacena...
            valido = validarDescripcion(descripcion) ; // ...y lo valida
            
            if (valido == false) // Si no ha sido validado mostrará el siguiente mensaje antes de repetir el proceso.
            {
                System.out.println("\n--------------------------------------------------------------------------- ");
                System.out.println("La descripción debe ser igual o inferior a 40 caracteres. Prueba de nuevo ");
                System.out.println("---------------------------------------------------------------------------\n ");
            }
         } // Si la descripción ha sido validada mostrará el siguiente mensaje para indicar que ha sido registrada.
         
            System.out.println(" ------------------------------------- ");
            System.out.println("Descripción registrada correctamente.");
            System.out.println(" ------------------------------------- ");
         
         ArticuloDeportivo art1 = new ArticuloDeportivo() ;         
         
         return art1;
     }
     
}
