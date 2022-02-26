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
    
    // MÉTODOS
    
        // GETTERS & SETTERS

    // --------- Código completo ------------
    
    /**
     * Método que devuelve el código completo del artículo.
     * 
     * @return String. Código completo.
     */
    public String obtenerCodigoCompleto(){
        
        return codigoCompleto ;
    }
    
    /**
     * Método que edita el código completo del artículo.
     * 
     * @param codigoCompleto. String.
     */
    public void cambiaCodigoCompleto(String codigoCompleto){ // ESTE MÉTODO TAMPOCO VALDRÁ SEGURAMENTE
        
        this.codigoCompleto = codigoCompleto ;
    }
    
    // --------- Descripción ------------
    
    /**
     * Método que devuelve la descripción del artículo.
     * 
     * @return String. Descripción del artículo.
     */
    public String obtenerDescripcionArticulo(){
        
        return descripcionArticulo ;
    }
    
    /**
     * Método que edita la descripción del artículo.
     * 
     * @param descripcionArticulo. String.
     */
    public void cambiaDescripcionArticulo(String descripcionArticulo){
        
        this.descripcionArticulo = descripcionArticulo ;
    }
    
    // --------- Código de ciudad ------------
    
    /**
     * Método que devuelve el código de ciudad.
     * 
     * @return String. Código de ciudad.
     */
    public String obtenerCodigoCiudad(){
        
        return codigoCiudad ;
    }
    
    /**
     * Método que edita el código de ciudad.
     * 
     * @param codigoCiudad. String.
     */
    public void cambiaCodigoCiudad(String codigoCiudad){
        
        this.codigoCiudad = codigoCiudad ;
    }
    
    
    // --------- Código de tienda ------------
    
    /**
     * Método que devuelve el código de tienda.
     * 
     * @return String. Código de tienda.
     */
    public String obtenerCodigoTienda(){
        
        return codigoTienda ;
    }
    
    /**
     * Método que edita el código de tienda.
     * 
     * @param codigoTienda. String.
     */
    public void cambiaCodigoTienda(String codigoTienda){
        
        this.codigoTienda = codigoTienda ;
    }
    
    // --------- Código del artículo ------------
    
    /**
     * Método que devuelve el código del artículo.
     * 
     * @return String. Código del artículo.
     */
    public String obtenerCodigoArticulo(){
        
        return codigoArticulo ;
    }
    
    /**
     * Método que edita el código del artículo.
     * 
     * @param codigoArticulo. String.
     */
    public void cambiaCodigoArticulo(String codigoArticulo){
        
        this.codigoArticulo = codigoArticulo ;
    }
    
    // --------- Número de control ------------
    
    /**
     * Método que devuelve el número de control.
     * 
     * @return String. Número de control.
     */
    public String obtenerNumeroControl(){
        
        return numeroControl ;
    }
    
    /**
     * Método que edita el número de control.
     * 
     * @param numeroControl. String.
     */
    public void cambiaNumeroControl(String numeroControl){ // ESTE MÉTODO POSIBLEMENTE NO VALGA
        
        this.numeroControl = numeroControl ;
    }
    
    // --------- Unidades ------------
    
    /**
     * Método que devuelve las unidades.
     * 
     * @return int. Número de unidades.
     */
    public int obtenerUnidades(){
        
        return unidades ;
    }
    
    /**
     * Método que edita las unidades.
     * 
     * @param unidades . int.
     */
    public void cambiaUnidades(int unidades){ // ESTE MÉTODO PUEDE QUE LO CAMBIE
        
        this.unidades = unidades ;
    }
    
    
    
    
}
