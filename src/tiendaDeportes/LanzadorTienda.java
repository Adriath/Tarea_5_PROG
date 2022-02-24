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
     
//     private static void obtenerPartesDelCodigo(String codigo){
//         
//     }
     
     private static boolean validarCodigoArticulo(String codigo)throws NumberFormatException{
         
         // DECLARACIÓN DE VARIABLES
         
         boolean valido = false ;
         long codigoNumerico ;
         int codCiudad ;
         int codTienda ;
         int codArticulo ;
         int codControl ;
         long codControlCalculado ;
         
         // OPERACIONES
         
         if (codigo.length() == 12) // Si la cadena es igual a 12 caracteres...
         {
//            try
//             {
                 codigoNumerico = Long.parseLong(codigo) ; // ...la pasamos a tipo entero...
//             }

//            catch (NumberFormatException e) {
//                System.out.println("El código debe estar formado por dígitos numéricos.");
//            }
//            catch (Exception e){
//                System.out.println("El código debe estar formado por dígitos numéricos."); // ...siempre y cuando la cadena esté formada por números.
//            }
            
            /*
                Si la cadena estaba formada por números procedemos a extraer las
                distintas partes para continuar con la validación.
            */
            
            codCiudad = Integer.parseInt(codigo.substring(0, 2)) ; // El código de ciudad
            codTienda = Integer.parseInt(codigo.substring(2, 4)) ; // El código de tienda
            codArticulo = Integer.parseInt(codigo.substring(4, 10)) ; // El código del artículo
            codControl = Integer.parseInt(codigo.substring(10, 12)) ; // El número de control
            
            codControlCalculado = (codCiudad + codTienda + codArticulo) % 99 ; // Realizamos la operación para calcular el número de control.
            
             if (codControlCalculado == codControl) // Si el código calculado es igual al introducido...
             {
                valido = true ; // ...el código será válido (true), ya que se recogen todas las validaciones anteriores llegados a este punto.
             }
         } // Si alguna de las condiciones no se ha cumplido el código saldrá del IF y el código no será válido (false).
                  
         return valido ;
     }
     
     private static ArticuloDeportivo obtenerDatosArticulo(){
         
         // DECLARACIÓN DE VARIABLES
         
         String descripcion ;
         String codigo ;
         boolean valido = false ;
//         boolean validadorCodigo = false ;
         
         // ENTRADA Y SALIDA DE DATOS
         
            // ------------- DESCRIPCIÓN -----------------
         
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
            
            valido = false ; // Reiniciamos el validador para repetir el proceso con el código.
            
            // ------------- CÓDIGO -----------------
         
         while (valido == false) // Mientras el código no se valide se repetirá el proceso de validación.
         {
//            do 
//             {
                System.out.println("Inserta el código completo del artículo."); // Pide el código del artículo...
                codigo = leerTeclado() ; //...lo almacena...
                try
                {
                    valido = validarCodigoArticulo(codigo) ; // ...y lo valida
//                    validadorCodigo = true ;
                }
                catch (NumberFormatException e){
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("Debes insertar un código válido de 12 números. Inténtalo de nuevo");
                    System.out.println("----------------------------------------------------------------------");
                }
                
//             } while (valido == false);
             
            
            if (valido == false) // Si no ha sido validado mostrará el siguiente mensaje antes de repetir el proceso.
            {
                System.out.println("\n--------------------------------------------------------------------------- ");
                System.out.println("Debes insertar un código válido de 12 números. Prueba de nuevo ");
                System.out.println("---------------------------------------------------------------------------\n ");
            }
         } // Si el código ha sido validado mostrará el siguiente mensaje para indicar que ha sido registrado.
         
            System.out.println(" ------------------------------------- ");
            System.out.println("Código registrado correctamente.");
            System.out.println(" ------------------------------------- ");
         
         ArticuloDeportivo articulo1 = new ArticuloDeportivo() ;   
         
         System.out.println("Mensaje provisional de confirmación");
         
         return articulo1;
     }
     
}
