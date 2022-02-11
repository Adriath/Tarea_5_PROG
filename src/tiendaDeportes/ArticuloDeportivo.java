/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaDeportes;

/**
 * Clase dedicada a los artículos deportivos de la tienda.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class ArticuloDeportivo {
    
    // DECLARACIÓN DE VARIABLES
    
    private String codigoCompleto ;
    private String descripcionArticulo ;
    
    private String codigoCiudad ;
    private String codigoTienda ;
    private String codigoArticulo ;
    private String numeroControl ;
    
    private int unidades ;
    
    // CONSTRUCTORES
    
    public ArticuloDeportivo(){
        
        codigoCompleto = "" ;
        descripcionArticulo = "" ;
        
        codigoCiudad = "" ;
        codigoTienda = "" ;
        codigoArticulo = "" ;
        numeroControl = "" ;
    }
    
    public ArticuloDeportivo (String codCompleto, String descripcion, 
            String codCiudad, String codTienda, String codArticulo, String numControl){
        
        this.codigoCompleto = codCompleto ;
        this.descripcionArticulo = descripcion ;
        
        this.codigoCiudad = codCiudad ;
        this.codigoTienda = codTienda ;
        this.codigoArticulo = codArticulo ;
        this.numeroControl = numControl ;
        
    }
    
    // AQUÍ VA EL CONSTRUCTOR COPIA QUE NO TENGO CLARO CÓMO SE HACE TODAVÍA
    
    
    
}
